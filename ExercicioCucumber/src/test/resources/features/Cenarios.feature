#language: pt
Funcionalidade: Validar dados do produto


Cenário: Validar dados do produto
Dado que estou acessando o menu dresses
Quando seleciono o produto Printed Dress
E abro a página de detalhes do produto
Então os valores são exibidos no datasheet

Cenário: Realizar a compra do produto
Dado que estou realizando um fluxo de compra
Quando pesquiso
E coloco um produto no carrinho
E finalizo a compra
Então gero evidências de automação


