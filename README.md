# gerenciaBanco - Sistema de Gerenciamento Bancário

## Descrição do Projeto
gerenciaBanco é uma aplicação Java simples para simulação de operações bancárias básicas. Este sistema permite criar contas bancárias, realizar depósitos e saques, bem como consultar informações da conta. Desenvolvido como uma aplicação de console, o TempBank demonstra conceitos básicos de programação orientada a objetos em Java.

## Funcionalidades

- **Criação de Conta**: O usuário pode criar uma nova conta bancária fornecendo número da conta (5 dígitos), CPF (11 dígitos) e nome do titular.
- **Depósito Inicial Opcional**: Durante a criação da conta, o usuário pode optar por fazer um depósito inicial.
- **Consulta de Saldo**: Visualização dos dados atualizados da conta, incluindo saldo disponível.
- **Operação de Depósito**: Possibilidade de realizar depósitos na conta.
- **Operação de Saque**: Realização de saques com taxa fixa de R$5,00 por operação.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

### 1. Bank.java
Classe que representa uma conta bancária com os seguintes atributos:
- `accountNumber`: número da conta (inteiro de 5 dígitos)
- `accountCPF`: CPF do titular (long de 11 dígitos)
- `accountHolder`: nome do titular da conta
- `accountBalance`: saldo atual da conta

Métodos principais:
- Construtores para diferentes cenários de criação de conta
- `deposit()`: método para realizar depósitos
- `withdraw()`: método para realizar saques (com taxa de R$5,00)
- `toString()`: método para exibição formatada dos dados da conta

### 2. GerenciaBanco.java
Classe principal que contém o método `main()` e implementa a interface com o usuário:
- Coleta os dados iniciais para criação da conta
- Apresenta um menu de opções para o usuário
- Processa as operações solicitadas pelo usuário

## Requisitos do Sistema

- Java Development Kit (JDK) 8 ou superior
- Ambiente de desenvolvimento compatível com Java (como NetBeans, IntelliJ IDEA ou Eclipse)

## Como Executar

1. Clone o repositório ou baixe os arquivos do projeto
2. Abra o projeto no seu IDE
3. Compile as classes Java
4. Execute a classe `GerenciaBanco`

## Fluxo de Uso

1. Ao iniciar, o sistema solicitará:
   - Número da conta (deve ter 5 dígitos)
   - Nome do titular
   - CPF (deve ter 11 dígitos)
   - Opção de depósito inicial

2. Após a criação da conta, um menu com as seguintes opções será exibido:
   - [1] Mostrar informações da conta
   - [2] Realizar depósito
   - [3] Realizar saque
   - [4] Sair

3. O usuário pode escolher qualquer uma das opções e realizar as operações correspondentes.

## Regras de Negócio

- O número da conta deve conter exatamente 5 dígitos
- O CPF deve conter exatamente 11 dígitos
- Cada operação de saque tem uma taxa fixa de R$5,00
- O saldo da conta é atualizado automaticamente após cada operação

## Exemplo de Uso

```
Enter account number (5 digits): 12345
Enter the account holder name: João Silva
Enter your CPF (11 digits): 12345678901
Is there an initial deposit (y/n)? y
Enter initial deposit value: 1000

Account data: Account: 12345, CPF: 12345678901, Holder: João Silva, Balance: $ 1000.0

What do you want to do?
[1] - Show account info
[2] - Deposit
[3] - Withdraw
[4] - Exit
```

## Possíveis Melhorias

- Implementar validação mais robusta dos dados de entrada
- Adicionar persistência de dados (banco de dados ou arquivo)
- Desenvolver interface gráfica de usuário (GUI)
- Implementar múltiplas contas e transferências entre elas
- Adicionar recursos de segurança, como autenticação, criptografia e autenticação
- Implementar histórico de transações
- Refatorar o código

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias ou corrigir bugs através de pull requests.
