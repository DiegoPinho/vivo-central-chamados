## O problema

> A Vivo quer reformular o sistema interno da central de atendimento. Hoje, quando um cliente liga, o atendente anota tudo em uma planilha e o controle se perde.
> 
> 
> O novo sistema precisa:
> 
> - registrar clientes, com nome, CPF e endereço completo (rua, cidade e CEP);
> - abrir chamados para esses clientes. Todo chamado nasce com um protocolo único no formato `VIVO-0001`, gerado automaticamente pelo sistema, e com status `ABERTO`;
> - lidar com tipos diferentes de chamado, porque cada um tem uma regra de prazo (SLA) própria:
>     - Técnico: registra qual é o equipamento do cliente. Se o cliente está totalmente sem sinal, o prazo é de 24 horas. Se é só lentidão, 48 horas;
>     - Financeiro: registra o valor que o cliente está contestando. Acima de R$ 500,00 o prazo é de 48 horas; abaixo disso, 120 horas;
>     - Comercial: registra qual produto o cliente quer contratar. Prazo fixo de 96 horas.
> - saber que alguns chamados precisam ser escalados para outra área, e outros não:
>     - um chamado técnico com o cliente sem sinal vai para o Field Service;
>     - um chamado financeiro contestando mais de R$ 1.000,00 vai para a Auditoria Financeira;
>     - chamado comercial nunca escala.
> - exibir um painel com todos os chamados abertos, apontar qual é o mais urgente (menor prazo) e informar quantos chamados já passaram pelo sistema.