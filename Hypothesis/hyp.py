import random
from hypothesis import strategies as st
from hypothesis import given, settings


fornecedores = st.sampled_from(["EDP", "Jomar", "Endesa"])
formulas = st.sampled_from(["formula1", "formula2", "formula3"])
divisoes = st.sampled_from(["Sala de Jantar", "Garagem", "Jardim", "Sala de Estar", "Quarto", "Cozinha"])
nomes = st.sampled_from(["Joana Branco", "Inês Ferreira", "Catarina Veloso", "Daniela Alves", "Manel"])
nifs = st.integers(min_value=1000000, max_value=9999999)
device_ids = st.integers(min_value=0, max_value=9999999)
device_types = st.sampled_from(["SmartBulb", "SmartSpeaker", "SmartCamera"])
lamp_values = st.floats(min_value=0.0, max_value=60.0)
lamp_dimensions = st.floats(min_value=0.0, max_value=100.0)
speaker_volumes = st.integers(min_value=0, max_value=100)
speaker_stations = st.sampled_from(["RFM Oceano Pacifico", "RTP Antena 1 98.3 FM", "MEGA HITS", "TSF Radio Noticias"])
speaker_brands = st.sampled_from(["Marshall", "LG", "Sony","JBL", "Philips"])
camera_resolutions = st.integers(min_value=1000, max_value=10000)
camera_sizes = st.floats(min_value=0.0, max_value=10.0)


@st.composite
def log_record(draw):
    fornecedor = draw(fornecedores)
    formula = draw(formulas)
    divisao = draw(divisoes)
    nome = draw(nomes)
    nif = draw(nifs)
    device_id = draw(device_ids)
    device_type = draw(device_types)
    
    if device_type == "SmartBulb":
        device_value = round(draw(lamp_values), 2)
        device_dimension = round(draw(lamp_dimensions), 2)
        log_str = f"Divisao:{divisao}\n{device_type}:{device_id},Neutral,{device_value}\n{device_type}:{device_id},Neutral,{device_dimension}"
    elif device_type == "SmartSpeaker":
        speaker_volume = draw(speaker_volumes)
        speaker_station = draw(speaker_stations)
        speaker_brand = draw(speaker_brands)
        log_str = f"Divisao:{divisao}\n{device_type}:{device_id},{speaker_volume},{speaker_station},{speaker_brand}"
    elif device_type == "SmartCamera":
        camera_resolution = round(draw(camera_resolutions),2)
        camera_size = round(draw(camera_sizes), 2)
        log_str = f"Divisao:{divisao}\n{device_type}:{device_id},{camera_resolution},{camera_size}"

    return f"Fornecedor:{fornecedor},{formula}\nCasa:{nome},{nif},{fornecedor}\n{log_str}"


@given(st.lists(log_record(), min_size=30, max_size=150))
def generate_log_file(log_records):
    with open("sh_logs.txt", "w") as file:
        file.write('\n'.join(log_records))


generate_log_file()