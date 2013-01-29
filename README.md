website-EJB
===========

Este é um projeto de um website com JSF 2.0, EJB 3.1, JPA EclipseLink voltado para o aprendizado.

Por ser um projeto simples, o código é de fácil entendimento, qualquer aspirante a programador poderá entender.

Os dois módulos implementados moduleEJB para as regras de negócio e persistência e o front-end websiteWAR estão empacotados em um EAR (websiteEAR) para rápida implantação no servidor.


### Configuração do Banco de Dados
----------------------------------

Apenas é necessário criar um Banco de Dados.
Configurar o DataSource no servidor e indicar o BD no persistence.xml.
As tabelas são criadas automaticamente ao iniciar a aplicação, graças a implementação JPA com o EclipseLink.

### Servidor de aplicação
--------------------------

Em um primeiro momento, deve-se configurar o Classpath do projeto.
Deve-se indicar o local do JDK para compilar as classes e indicar as bibliotecas do servidor utilizado.

* Acesse a aplicação através da url http://localhost:8080/websiteWAR

O projeto executa no GlassFish 3.1.2, mas você pode utilizar o servidor que desejar.