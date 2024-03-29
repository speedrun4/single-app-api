# Single-api<br>
Esse repositório contém os arquivos do **back-end** do projeto Single-app, construído e ensinado pela Francisco Moura **Fullstack Angular e Spring**.<br>O Single-app é um software para controle e acompanhamento financeiro de receitas e despesas.<br>

<br>Ele foi desenvolvido com as seguintes tecnologias:

 - Back-end: **API REST** com o framework **Spring Boot** 2.5 no **Java** 16
 - Front-end: Single-Page Application (SPA) com **Angular** 14
 - Biblioteca de componentes **PrimeNG** na interface de usuário
 - Autenticação e autorização de usuário com **OAuth 2** e **JWT** (JSON Web Token)
 - Banco de dados **MariaDB** 10+
 - **Flyway** (migrações do banco de dados)
 - Jaspersoft **JasperReports** (relatórios em PDF)
 - Apache **Maven** (gerenciador de projetos e dependências)
 - Node.js e NPM (Node Package Manager) para controle de dependências e building do front-end.
 
 ### Funcionalidades do software
-  Categorias de Beneficiario
      - Buscar todas as categorias cadastradas
      -  Buscar uma categoria pelo código
      -  Criar uma nova categoria

 -   Pessoas
    
	    -   Buscar todas as pessoas cadastradas
	    -   Pesquisar pessoas pelo nome
	    -   Buscar uma pessoa pelo código
	    -   Cadastrar uma nova pessoa
	    -   Remover uma pessoa usando o código
	    -   Atualizar os dados de uma pessoa
	    
 -   Lançamentos Documentos
    
	    -  Buscar lançamentos
	    -  Buscar lançamentos pela descrição e data de vencimento
	    -  Buscar um lançamento pelo código
	    -  Criar um novo lançamento
	    -  Remover um lançamento
	    -  Atualizar um lançamento

- Relatórios em PDF com informações de lançamentos
- Envio de e-mail automático para lembrete de lançamentos próximos da data de vencimento
- Segurança
	- Registrar usuários pelo banco de dados com diferentes privilégios de acessos às funcionalidades

### Softwares usados no desenvolvimento

* [OpenJDK 16 - JVM HotSpot](https://adoptopenjdk.net)
* [Docker Desktop for Windows v3.0.0](https://www.docker.com/products/docker-desktop)
* [Eclipse IDE 2020-09 for Enterprise Java](https://www.eclipse.org/downloads/packages)
* [Postman 7.36](https://www.postman.com/downloads)
* [Jaspersoft Studio CE 6.12](https://community.jaspersoft.com/project/jaspersoft-studio/releases)

 ### URLs

**Observação**: Para executar as requisições no Postman é necessário primeiro gerar um token JWT/OAuth 2. Esse token então deve ser enviado junto com as requisições feitas nas URLs. A aplicação front-end resolve todos esses detalhes sem necessidade de intervenção do usuário.

- Screenshots com os passos usados no Postman:

  - Gerando um token:

**Authorization**

**Headers**

**Body**


  - Usando o token gerado em uma requisição:

|  URL |  Método | Descrição |
|----------|--------------|--------------|
|`http://localhost:8080/single-app-api/oauth/token`                             | POST | Solicita Access Token |
|`http://localhost:8080/single-app-api/oauth/token`                             | POST | Solicita Refresh Token |
|`http://localhost:8080/single-app-api/tokens/revoke`                           | DELETE | Revoga o token atual |
|`http://localhost:8080/single-app-api/people/`                                 | GET | Retorna todas as pessoas registradas no banco (com paginação) |
|`http://localhost:8080/single-app-api/people/`                                 | POST | Registra uma pessoa |
|`http://localhost:8080/single-app-api/people/{id}`                              | GET | Retorna o registro de uma pessoa baseada no ID dela |
|`http://localhost:8080/single-app-api/people/{id}`                              | DELETE | Deleta o registro de uma pessoa baseada no ID dela |
|`http://localhost:8080/single-app-api/people/{id}`                              | PUT | Atualiza o registro de uma pessoa baseado no ID dela |
|`http://localhost:8080/single-app-api/people/{id}/active`                              | PUT | Atualiza a propriedade ativo de uma pessoa baseada no ID dela, no corpo da requisição é preciso enviar um JSON com true ou false |
|`http://localhost:8080/single-app-api/categories`                              | GET | Retorna todas as categorias |
|`http://localhost:8080/single-app-api/categories`                              | POST | Registra uma categoria |
|`http://localhost:8080/single-app-api/categories/{id}`                           | GET | Retorna uma categoria baseado no ID |
|`http://localhost:8080/single-app-api/journalentries`                             | POST | Registra uma lançamento |
|`http://localhost:8080/single-app-api/journalentries`                             | GET  | Retorna todos os lançamentos (com paginação) |
|`http://localhost:8080/single-app-api/journalentries/{id}`                          | GET | Retorna um lançamento baseado no ID |
|`http://localhost:8080/single-app-api/journalentries/{id}`                          | DELETE | Deleta um lançamento baseado no ID |
|`http://localhost:8080/single-app-api/journalentries?summary`           | GET | Retorna lançamentos os lançamentos resumidos (o resultado só retorna o nome da pessoa ao invés do registro completo com endereço) |
|`http://localhost:8080/single-app-api/journalentries?description={searchparam}&dueDateFrom=YYYY-MM-DD&dueDateTo=YYYY-MM-DD`                       | GET| Faz uma pesquisa nos lançamentos com os parâmetros inseridos na URL(descrição e intervalos de data de vencimento) |
|`http://localhost:8080/single-app-api/journalentries/statistics/by-day`        | GET | Retorna estatísticas de lançamento baseado em um período de tempo |
|`http://localhost:8080/single-app-api/journalentries/statistics/by-category`  | GET | Retorna estatísticas de lançamento baseado em categorias |
|`http://localhost:8080/single-app-api/journalentries/reports/by-person?begin={YYYY-MM-DD}&end={YYYY-MM-DD}`                                                  | GET | Retorna um relatório em PDF baseado no período de tempo informado na URL  |
|`http://localhost:8080/single-app-api/states`                                 | GET  | Retorna todos os estados cadastrados no banco de dados |
|`http://localhost:8080/single-app-api/cities?state={id}` | GET | Retorna uma lista de cidades baseada no ID do estado passado por parâmetro |

---
## Como executar o projeto
Edite o arquivo `application.properties` em `single-app-api/src/main/resources` com as informações necessárias correspondentes às configurações da sua máquina (usuário/senha do banco de dados e também do provedor de email para envio automático do sistema).
O projeto foi construído com a IDE Eclipse. Para executá-lo:

1. Baixe e instale o Docker Desktop
2. Faça o Download do zip do projeto ou clone o repositório Git e extraia o conteúdo do arquivado compactado
3. Navegue até a pasta do projeto e abra o Prompt de Comando do Windows ou Terminal do GNU/Linux
4. Execute o comando `docker-compose up`. Ele irá criar um container chamado single-app_mariadb contendo a imagem do banco de dados MariaDB.
![docker-compose up](https://user-images.githubusercontent.com/37079133/103035859-f5df2000-4546-11eb-8311-41d8e62212a8.png)<br>
5. Para ter acesso ao banco de dados MariaDB, abra outra janela do Prompt de Comando/Terminal e execute o comando `docker exec -it mysql bash -l`, agora execute o comando `mysql -uroot -p`. O usuário do MariaDB nesse caso é o root, se for outro, altere o que está depois de -u. Digite a senha e pressione ENTER. Agora é possível criar e alterar *schemas*.
![docker mariadb](https://user-images.githubusercontent.com/37079133/103035861-f7104d00-4546-11eb-98ab-3739976e6731.png)<br>
6.  Abra o Eclipse IDE
7.  Importe o projeto baixado: Vá em File > Open Projects from File System. Selecione a pasta pela opção "Directory" e pressione Finish.
8.  Espere o Maven baixar todas as dependências.
9.  Abra a classe java "single-appApiApplication" e execute o método main.
10.  O projeto irá ser executado.
11.  Para testar os recursos das URLs acima, use alguma ferramenta de testes de API, como o **Postman**; ou execute o cliente do front-end.
---
### Autor
Feito por Francisco Moura. 👋🏽 Entre em contato! 11 981912734 mourajuniorf@gmail.com
