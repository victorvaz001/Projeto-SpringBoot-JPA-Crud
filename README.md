# Projeto-SpringBoot-JPA-Crud

## Tecnologias

1 - Java 1.8<br>
2 - Spring Boot<br>
3 - JPA<br>
4 - Hibernate<br>
8 - Rest, Restfull<br>
9 - PostgreSQL<br>

#Informações

* Não contem telas, para teste da API foi utilzado o PostMan, chamando os metodos do IndexController
* Projeto criado com Spring boot starter 2.3.0
* O projeto já está configurado para gerar tabelas automaticas com Hibernate
* Contem a classe IndexController.java, anotada com o @RestController para aceitar os metodos REST
* UsuarioRepository extendendo o CrudRepository passando uma classe e um ID como parametro, para utilizar os metodos do CRUD
* Usuario Modelo, com o @Entity para o Hibernate criar está classe no banco de dados, gerando um autoIncrement id chave primaria
* application.properties estão a configuração de persistencia
