# Todo-List-Api 📝✔️
API simples, feita em java utilizando o framework Spring Boot, que nos ajuda a administrar listas de tarefas.

## Conteúdo
Conforme Socilicitado:
Criar uma API simples (em sua linguagem preferida) que armazene e atualize tarefas (TODO LIST API). (ex: GET,
PUT, POST, DELETE /todo)
	
## Tecnologias Usadas
Esse projeto foi criado usando:
* JAVA 11.0
* Spring Boot
* Actuator
	

Quando criamos uma tarefa, naturalmente, ela "nasce" como pendente e depois de resolvermos podemos marca-la como completa.
Desse modo foi criado um Enum cujo valor inicial é o padrão de todas as tarefas: pending

## End-Points
Temos os seguintes end-points, de acordo com as necessidades apresentadas na proposta:

## GET
`Listar todos as tarefas criadas` [curl http://localhost:8080/todo](#get-1billingretrieve-billing-datajson) <br/>

**Resposta**

```
//Serão listados todas as tarefas que foram previamente criadas

[
  {
    "id": 1,
    "titulo": "Organizar Material de estudo",
    "mensagem": "Definir o que será estudado e revisado",
    "status": "PENDING"
  },
  {
    "id": 2,
    "titulo": "Lista de compras",
    "mensagem": "Lembrar de fazer uma lista para o mercado",
    "status": "PENDING"
  },
  {
    "id": 3,
    "titulo": "Pagar Boletos",
    "mensagem": "Não esquecer de pagar as contas",
    "status": "PENDING"
  }
]


```
___

## POST
`Criar uma nova tarefa` [http://localhost:8080/todo](#get-1billingretrieve-billing-datajson) <br/>

**Corpo**

```
//Passamos os parametros que compõem a nossa entidade

{
	"titulo": "Organizar Material de estudo",
	"mensagem":"Definir o que sera estudado e revisado"
}

```
___

**Resposta**

```


  {
    "id": 1,
    "titulo": "Organizar Material de estudo",
    "mensagem": "Definir o que será estudado e revisado",
    "status": "PENDING"
  }

```
___


## PUT
`Alterar uma tarefa já criada` [http://localhost:8080/todo](#get-1billingretrieve-billing-datajson) <br/>

**Resposta**

```
//Além dos atributos podemos mudar o status da tarefa 

  {
    "id": 1,
    "titulo": "Organizar Material de estudo para sábado",
    "mensagem": "Definir o que será estudado e revisado",
    "status": "COMPLETED"
  }

```
___

## DELETE
`Deletar uma tarefa criada` [http://localhost:8080/todo/1](#get-1billingretrieve-billing-datajson) <br/>


```
//Para deletamos uma tarefa passando o numero de seu id na url


```
___
