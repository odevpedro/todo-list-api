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
	

Nota: Quando criamos uma tarefa, naturalmente, ela "nasce" como pendente e depois de resolvermos podemos marca-la como completa.
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
//Para deletamos uma tarefa passamos o numero de seu id na url


```
___


## HealthCheck
`Rota de validação dos componentes` [http://localhost:8080/actuator/health](#get-1billingretrieve-billing-datajson) <br/>

**Resposta**

```
// 20210404234443
// http://localhost:8080/actuator/health

{
  "status": "UP",
  "components": {
    "db": {
      "status": "UP",
      "details": {
        "database": "H2",
        "validationQuery": "isValid()"
      }
    },
    "diskSpace": {
      "status": "UP",
      "details": {
        "total": 156219498496,
        "free": 4390440960,
        "threshold": 10485760,
        "exists": true
      }
    },
    "ping": {
      "status": "UP"
    }
  }
}

```
___

## Metrics
`Rota de validação dos componentes` [http://localhost:8080/actuator/metrics](#get-1billingretrieve-billing-datajson) <br/>

**Resposta**

```
// 20210404234544
// http://localhost:8080/actuator/metrics

{
  "names": [
    "hikaricp.connections",
    "hikaricp.connections.acquire",
    "hikaricp.connections.active",
    "hikaricp.connections.creation",
    "hikaricp.connections.idle",
    "hikaricp.connections.max",
    "hikaricp.connections.min",
    "hikaricp.connections.pending",
    "hikaricp.connections.timeout",
    "hikaricp.connections.usage",
    "http.server.requests",
    "jdbc.connections.active",
    "jdbc.connections.idle",
    "jdbc.connections.max",
    "jdbc.connections.min",
    "jvm.buffer.count",
    "jvm.buffer.memory.used",
    "jvm.buffer.total.capacity",
    "jvm.classes.loaded",
    "jvm.classes.unloaded",
    "jvm.gc.live.data.size",
    "jvm.gc.max.data.size",
    "jvm.gc.memory.allocated",
    "jvm.gc.memory.promoted",
    "jvm.gc.pause",
    "jvm.memory.committed",
    "jvm.memory.max",
    "jvm.memory.used",
    "jvm.threads.daemon",
    "jvm.threads.live",
    "jvm.threads.peak",
    "jvm.threads.states",
    "logback.events",
    "process.cpu.usage",
    "process.files.max",
    "process.files.open",
    "process.start.time",
    "process.uptime",
    "system.cpu.count",
    "system.cpu.usage",
    "system.load.average.1m",
    "tomcat.sessions.active.current",
    "tomcat.sessions.active.max",
    "tomcat.sessions.alive.max",
    "tomcat.sessions.created",
    "tomcat.sessions.expired",
    "tomcat.sessions.rejected"
  ]
}
```
___

OBS: Para rodarmos a aplicação: basta fazer o dowload do código desse repositório e importa-lo, em uma IDE, como maven project.

