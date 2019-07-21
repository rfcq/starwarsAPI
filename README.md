# StarwarsAPI
 
___________________________________
API desenvolvida usando SpringBoot e outras tecnologias, com persistência de dados utilizando o H2 Database.
___________________________________

Endpoints: 
Rebeldes

GET - Listar Usuários
http://localhost:8080/api/listRebels
Requisição para listar os rebeldes cadastrados

GET - Procurar por ID
http://localhost:8080/api/rebel/{id}
Substituir o {id} pelo id do rebelde que deseja localizar

POST - Adicionar Rebelde
http://localhost:8080/api/addRebel
Para adicionar, passar método POST com body no seguinte padrão: "id": "nome": "idade": "genero": "latitude": "longitude": "nome_base":

Inventario

GET - Listar Inventário
http://localhost:8080/api/inventario

GET - Lista Item
http://localhost:8080/api/listaitem/{id}

POST - Adiciona Item
http://localhost:8080/api/addItem

