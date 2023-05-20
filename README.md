# GUIDE HOW TO USE
Este repositório destina-se ao armazenamento do projeto realizado no âmbito da UC de Análise e Teste de Software e no presente documento pode encontrar instruções de como configurar e executar o projeto.

## Unit Testing
### JUnit
Usando o projeto **POO_2022**, os testes unitários estão em **src/main/java** entre as classes a que diz respeito os testes.

Para a sua execução e verificação dos testes unitários deve:
1. Editar as configurações de execução, como na figura:

      <img src="https://github.com/venicexbish/ATS_PROJECT/blob/main/imagens/junit1.png" width="500" />


2. Definir para cada uma das classes, a configuração de execução;
3. Analisar valores dados no terminal.



### Test Coverage
Usando o projeto **POO_2022**, os testes unitários estão em **src/main/java** entre as classes a que diz respeito os testes.

Para a sua execução e verificar o test coverage dos testes unitários deve:
1. Editar as configurações de execução, como no tópico **JUnit**, mas ;




2. Carregar no botão "Run with Coverage" como indicado na figura:

    <img src="https://github.com/venicexbish/ATS_PROJECT/blob/main/imagens/testcoverage.png" width="200" />

    
    
  
3. Observar os valores apresentados na tabela resultante.

## Unit Test Generation
### EvoSuite
Usando o projeto **POO_java8**, em **src/main/java** fazer o seguinte:
1. Carregar no botão direito da pasta em questão;
2. Executar "Run EvoSuite".

Os testes resultantes desta execução podem ser vistos em **.evosuite/best-tests** e em **.evosuite/tmp_2023_05_16_20_55_09/reports** encontram-se as estatísticas dos testes em causa.

**NOTA:** Este software apenas funciona em Java 8.

## Mutation Testing
### PIT
Usando o projeto **POO_2022**, os testes unitários estão em **src/main/java** entre as classes a que diz respeito os testes.

Para a sua execução e verificação dos testes unitários deve:
1. Editar as configurações de execução, como no tópico **JUnit**, indicado a target class e respetivo test.
2. Observar os resultados através do link para o "report" dado na linha de comandos.



## QuickCheck
### Generator
Usando o ficheiro **generator.hs** em **QuickCheck/generator.hs**, deve executar pelo terminal:

```
> ghci

> :l generator

> main
```
e é nessa mesma diretoria que é gerado o ficheiro **log.txt**.



### Hypothesis
Usando o ficheiro **hyp.py** em **Hypothesis/hyp.py**, deve executar pelo terminal:

```> python3 hyp.py```

e é nessa mesma diretoria que é gerado o ficheiro **sh_logs.txt**.

# Relatório
O relatório do projeto pode ser encontrado [aqui](https://github.com/venicexbish/ATS_PROJECT/blob/main/relat%C3%B3rio.pdf).


# Realizado por:
[Inês Ferreira](https://github.com/venicexbish) (A97372) 

[Joana Branco](https://github.com/joanabranco) (A96584)


