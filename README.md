website-EJB
===========

Este � um projeto de um website com JSF 2.0, EJB 3.1, JPA EclipseLink voltado para o aprendizado.

Por ser um projeto simples, o c�digo � de f�cil entendimento, qualquer aspirante a programador poder� entender.

Os dois m�dulos implementados moduleEJB para as regras de neg�cio e persist�ncia e o front-end websiteWAR est�o empacotados em um EAR (websiteEAR) para r�pida implanta��o no servidor.


### Configura��o do Banco de Dados
----------------------------------

Apenas � necess�rio criar um Banco de Dados.
Configurar o DataSource no servidor e indicar o BD no persistence.xml.
As tabelas s�o criadas automaticamente ao iniciar a aplica��o, gra�as a implementa��o JPA com o EclipseLink.

### Servidor de aplica��o
--------------------------

Em um primeiro momento, deve-se configurar o Classpath do projeto.
Deve-se indicar o local do JDK para compilar as classes e indicar as bibliotecas do servidor utilizado.

* Acesse a aplica��o atrav�s da url http://localhost:8080/websiteWAR

O projeto executa no GlassFish 3.1.2, mas voc� pode utilizar o servidor que desejar.