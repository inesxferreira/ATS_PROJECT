import Test.QuickCheck
import System.IO

data Divisao = Quarto| SalaDeEstar | Sala | Sala1 | Sala2 | Cozinha | Jardim2 | Garagem | Garagem2 | Escritorio | Escritorio2 deriving (Eq, Enum, Show)
data Nome = Ines | Joana | Daniela | Catarina| Rafael | Manel | Gustavo | Miguel| Leticia | Jacinta  deriving (Enum, Show)
data Fornecedore = Jomar | EDP | Endesa deriving (Show)
data Formula = Formula1 | Formula2 | Formula3 deriving (Show)
data SmartBulbT = Warm | Cold | Neutral deriving (Show)
data SmartSpeakerRadio = RFM | NovaEra | RTP | RadioPopular deriving (Show)
data Marca = Marshall | Sony | LG deriving (Show)


data Casa = Casa Nome String Fornecedore deriving (Show)

instance Arbitrary Casa where
  arbitrary = do
    nome <- elements [Ines, Joana, Daniela, Catarina, Rafael,Manel, Gustavo, Miguel, Leticia, Jacinta ]
    telefone <- vectorOf 9 (choose (1, 9) :: Gen Int)
    fornecedor <- elements [Jomar, EDP, Endesa]
    return (Casa nome (concatMap show telefone) fornecedor)

instance Arbitrary Divisao where
  arbitrary = elements [Quarto, Sala, Cozinha, Jardim2, Garagem, Garagem2, Escritorio, Escritorio2]

data SmartDevice = SmartBulb String SmartBulbT Double | SmartSpeaker String Int SmartSpeakerRadio Marca| SmartCamera Double Double Double deriving (Show)

instance Arbitrary SmartDevice where
  arbitrary = oneof [bulbGen, speakerGen, cameraGen]
    where
      bulbGen = do
        id <- vectorOf 7 (elements ['0'..'9'])
        tipo <- elements [Warm, Cold, Neutral]
        valor <- choose (1, 9)
        return (SmartBulb id tipo valor)
      speakerGen = do
        id <- vectorOf 7 (elements ['0'..'9'])
        volume <- choose (1, 99)
        estacao <- elements [RFM, NovaEra, RTP,RadioPopular]
        marca <- elements [Marshall, Sony, LG]
        return (SmartSpeaker id volume estacao marca)
      cameraGen = do
        x <- choose (1, 99999999)
        y <- choose (1, 99999)
        w <- choose (1, 99999)
        return (SmartCamera x y w)

generateLog :: IO [String]
generateLog = generate $ do
  casas <- listOf1 (arbitrary :: Gen Casa)
  divisoes <- listOf (arbitrary :: Gen Divisao)
  devices <- listOf (arbitrary :: Gen SmartDevice)
  return $ "Fornecedor:EDP,formula2" : "Fornecedor:Jomar,formula1" : "Fornecedor:Endesa,formula3" : map showCasa casas ++ map showDivisao divisoes ++ map showDevice devices
  where
    showCasa (Casa nome telefone fornecedor) = "Casa: " ++ show nome ++ ", " ++ show telefone ++ ", " ++ show fornecedor
    showDivisao divisao = "Divisao: " ++ show divisao
    showDevice device = case device of
      SmartBulb id tipo valor -> "SmartBulb: " ++ show id ++ ", " ++ show tipo ++ ", " ++ show valor
      SmartSpeaker id volume estacao marca -> "SmartSpeaker: " ++ show id ++ ", " ++ show volume ++ ", " ++ show estacao ++ " " ++ show marca
      SmartCamera x y w -> "SmartCamera: " ++ show x ++ ", " ++ show y ++ ", " ++ show w


saveLogToFile :: FilePath -> [String] -> IO ()
saveLogToFile path logs = withFile path WriteMode $ \handle -> do
  mapM_ (hPutStrLn handle) logs

main :: IO ()
main = do
  logs <- generateLog
  saveLogToFile "log.txt" logs
