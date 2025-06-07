# 📇 Projeto: Estrutura de Dados com Tabela Hash em Java

Este projeto implementa uma **tabela hash** em Java com tratamento de colisões via **listas encadeadas**, utilizando classes personalizadas para armazenar objetos do tipo `Contato`.

## 📁 Estrutura do Projeto

├── Contato.java # Classe que representa um contato (nome, telefone, email)

├── No.java # Nó de uma lista encadeada

├── Lista.java # Lista encadeada para tratar colisões na tabela hash

├── THash.java # Implementação da tabela hash com hashing e colisão

└── TabelaHashProjeto.java # Classe principal com execução e testes

## ⚙️ Funcionalidades

- Adicionar contato à tabela hash
- Remover contato pelo nome
- Buscar contato pelo nome
- Exibir todos os contatos da tabela
- Tratar colisões com listas encadeadas
- Impressão do estado interno da tabela
