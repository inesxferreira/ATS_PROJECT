# ATS_PROJECT - GUIDE HOW TO USE
Neste ficheiro é possível seguir as difersas instruções para a boa execução do projeto.

## JUnit 
Usando o projeto **POO_22**, os testes unitários estão em **src/main/java** entre as classes a que diz respeito os testes.

Para a sua execução e verificação dos testes unitários deve:
1. Editar as configurações de execução, como na figura:
  ![Configuração](https://github.com/venicexbish/ATS_PROJECT/blob/main/junit1.png)

2. Definir para cada uma das classes, a configuração de execução;
3. Analisar valores dados no terminal.



## Test Coverage
Usando o projeto **POO_22**, os testes unitários estão em **src/main/java** entre as classes a que diz respeito os testes.

Para a sua execução e verificar o test coverage dos testes unitários deve:
1. Editar as configurações de execução, como no tópico **JUnit**;


2. Carregar no botão indicado na figura:
    ![TestCov](https://github.com/venicexbish/ATS_PROJECT/blob/main/testcoverage.png)
    
    
  
3. Observar os valores apresentados na tabela resultante.

## EvoSuite
Usando o projeto **POO_java8**, em **src/main/java** fazer o seguinte:
1. Carregar no botão direito da pasta em questão;
2. Executar "Run EvoSuite".

Os testes resultantes desta execução podem ser vistos em **.evosuite/best-tests** e em **.evosuite/tmp_2023_05_16_20_55_09/reports** encontram-se as estatísticas dos testes em causa.

**NOTA:** Este software apenas funciona em Java 8.


## QuickCheck
### Generator
Usando o ficheiro **generator.hs** em **Generators/QuickCheck/generator.hs**, deve executar pelo terminal:

```
> ghci

> :l generator

> main
```
e nessa mesma pasta é gerado o ficheiro **log.txt**.



### Hypothesis
Usando o ficheiro **hyp.py** em **Generators/Hypothesis/hyp.py**, deve executar pelo terminal:

```python3 hyp.py```

e nessa mesma pasta é gerado o ficheiro **sh_logs.txt**.


