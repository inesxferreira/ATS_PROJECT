import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Automatizacao {
    public static void parseFile(String file, Estado estado) throws InterruptedException {
        List<String> linhas = Estado.lerFicheiro(file);
        List<Casa> casas = estado.getCasas();
        List<Fornecedores> fornecedores = estado.getFornecedores();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (String linha : linhas) {
            String[] linhaPartida = linha.split(",");
            LocalDate dataFutura = LocalDate.parse(linhaPartida[0], dateTimeFormatter);

            if (dataFutura.isAfter(LocalDate.parse(estado.getData(), dateTimeFormatter))) {
                if ("Casa".equals(linhaPartida[1])) {
                    int indice = Integer.parseInt(linhaPartida[2]) - 1;
                    Casa casa = casas.get(indice);
                    parseComandoC(linhaPartida[3], linhaPartida[4], casa, fornecedores);
                    estado.updateCasa(casa, indice);
                } else if ("Fornecedor".equals(linhaPartida[1])) {
                    String nomeF = linhaPartida[2];
                    Fornecedores fornecedor = null;
                    if ("EDP".equals(nomeF)) {
                        fornecedor = new FornecEDP();
                    } else if ("Endesa".equals(nomeF)) {
                        fornecedor = new FornecEndesa();
                    } else if ("Jomar".equals(nomeF)) {
                        fornecedor = new FornecJomar();
                    } else {
                        Menu.erros(7);
                    }

                    fornecedor = fornecedores.get(fornecedores.indexOf(fornecedor));
                    parseComandoF(linhaPartida[3], linhaPartida[4], fornecedor);
                    estado.updateFornecedor(fornecedor);
                    estado.updateCasas(fornecedor);
                } else {
                    Menu.erros(15);
                }
            } else {
                Menu.erros(15);
                Menu.erros(24);
                System.out.println("Data atual: " + estado.getData());
                Thread.sleep(3000);
            }
        }
    }

    private static void parseComandoC(String comando, String objeto, Casa casa, List<Fornecedores> fornecedores) {
        if ("setOn".equals(comando)) {
            casa.setDeviceOn(objeto);
        } else if ("setOff".equals(comando)) {
            casa.setDeviceOff(objeto);
        } else if ("setDivisionOn".equals(comando)) {
            casa.setDivisonOn(objeto);
        } else if ("setDivisionOff".equals(comando)) {
            casa.setDivisonOff(objeto);
        } else if ("mudarFornecedor".equals(comando)) {
            if ("EDP".equals(objeto)) {
                String formula = fornecedores.get(0).getFormula();
                casa.setFornecedor(new FornecEDP(formula));
            } else if ("Endesa".equals(objeto)) {
                String formula = fornecedores.get(2).getFormula();
                casa.setFornecedor(new FornecEndesa(formula));
            } else if ("Jomar".equals(objeto)) {
                String formula = fornecedores.get(1).getFormula();
                casa.setFornecedor(new FornecJomar(formula));
            } else {
                Menu.erros(7);
            }
        } else {
            Menu.erros(15);
        }
    }
    private static void parseComandoF(String comando, String objeto, Fornecedores fornecedor) {
        if ("alterarValorDesconto".equals(comando)) {
            System.out.println("Do something!");
        } else if ("alterarFormula".equals(comando)) {
            fornecedor.setFormula(objeto);
        } else {
            Menu.erros(15);
        }
    }
}




