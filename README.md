# Api com SpringBoot JPA

## Tecnologias

* Java 1.08<br>
* Spring Boot<br>
* Rest, RestFull<br>
* JPA<br>
* Hibernate<br>
* PotgreSQL<br>

## Observações

* Classe com metodo main, com as anotações necessarias para trabalhar com Hibernate SpringBoot, Rest, SpringMvc<br>
* Projeto já está configurado para criar tabelas automaticas com Hibernate<br>
* Back-end<br>
* Classe modelo Usuario modelo<br>
* IndexController anotado com o @RestController para manipular os metodos REST e @RequestMapping para usuario<br>
* applications.properties configurado para trabalhar com o Hibernate e postgres<br>


## Testes
* Nao e necessario criar tabelas, o projeto ja está configurado para criaçao automatica
* Testes da API foram feitos com o Postman
* Para testes com o arquivo .jar, abrir o arquivo .jar que eseta no projeto, ir no navedor e digitar, http://localhost:8080/cursospringapi/usuarios/
* Para testar o projeto, devera ter o postgres e criar um banco de dados com usuario e senha, alterar o no arquivo de persistencia

