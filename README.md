# Ponto de Venda
API para cadastrar: produtos, clientes e realizar vendas.
## Estrutura
### Produto
- id (integer)
- nome (string)
- custoCompra (float)
- valorVenda (float)
- quantidade (integer)
- deleted\_at (datetime)
### Cliente
- id (integer)
- tipo (integer)
- documento (string)
- nome (string)
- deleted\_at (datetime)
### Venda
- id (integer)
- cliente\_id (integer)
- produto\_id (integer)
- totalVenda (float)
- desconto (float)
- deleted (datetime)
## 

## Ações
- Cadastrar Produtos:
- Cadastrar Clientes
- Realizar Vendas:
  - Se não houver um cliente, o padrão será Consumidor 
  - Verificar se há estoque do produto vendido
  - Verificar se o desconto não é maior que o valorVenda
- Consultas (Todos ou especifico através do id): Utilizar filtro deleted\_at is null
  - Produtos
  - Clientes
  - Vendas
- Editar: Utilizar filtro deleted\_at is null; Apenas com id
  - Produtos
  - Clientes
- Excluir: Preencher a coluna deleted\_at com a data da exclusão (hoje)
  - Produtos
  - Clientes
  - Vendas
## Dependencias
### VendaService
Classe onde ficará toda a regra da venda
