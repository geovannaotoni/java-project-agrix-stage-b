# Agrix: Sistema de Gestão de Fazendas da AgroTech 🌱🏞️
A AgroTech é uma empresa busca desenvolver tecnologias para aprimorar a eficiência no cultivo de plantações. O primeiro produto da empresa, o Agrix, é um sistema de gestão e monitoramento das fazendas participantes. Este projeto é a fase B do desenvolvimento do projeto.
- [Fase A](https://github.com/geovannaotoni/java-project-agrix-stage-a)
- [Fase B](https://github.com/geovannaotoni/java-project-agrix-stage-b)
- [Fase C](https://github.com/geovannaotoni/java-project-agrix-stage-c)

## 🏛️ Estrutura do Banco de Dados
Este modelo inclui as seguintes tabelas:
- **farm**: Representa uma fazenda.
- **crop**: Representa uma plantação e está em relacionamento N:1 ("muitos para um") com a tabela **farm**.
- **fertilizer**: Representa um fertilizante, e está em um relacionamento N:N ("muitos para muitos") com a tabela **crop**. Esse relacionamento é realizado através da tabela **crop_fertilizer**.

## ✅ Endpoints ajustados ou incluídos na Fase B:
* `POST /farms/{farmId}/crops`: Criação de plantações em uma fazenda.
* `GET /farms/{farmId}/crops`: Lista as plantações de uma fazenda específica.
* `GET /crops`: Retorna todas as plantações cadastradas.
* `GET /crops/{id}`: Retorna informações de uma plantação específica.
* `GET /crops/search?start=yyyy-MM-dd&end=yyyy-MM-dd`: Busca de plantações a partir da data de colheita.
* `POST /fertilizers`: Criação de um novo fertilizante.
* `GET /fertilizers`: Retorna todos os fertilizantes cadastrados.
* `GET /fertilizers/{id}`: Retorna informações de um fertilizante específico.
* `POST /crops/{cropId}/fertilizers/{fertilizerId}`: Associa uma plantação com um fertilizante.
* `GET /crops/{cropId}/fertilizers`: Retorna os fertilizante associados a uma plantação.

## ⚙️ Habilidades trabalhadas
Este projeto visa o desenvolvimento de uma aplicação Spring Boot com funcionalidades iniciais para gestão de fazendas e plantios. Ele aborda as seguintes habilidades:
- Implementação de rotas da API Rest usando o ecossistema Spring.
- Utilização de injeção de dependência para conectar camadas de controle, serviço e persistência.
- Utilização do Spring Data JPA para entidades e repositórios de persistência em banco de dados.
- Implementação de gerenciamento de erros no Spring Web.
- Criação de um Dockerfile para configurar a aplicação para execução no Docker.
- Estruturação do Banco de Dados.
- Utilização campos de data nas rotas da API e no banco de dados.
- Criação de testes unitários para garantir a qualidade e funcionamento correto da implementação, com cobertura de código adequada.

## 💻 Como Executar o Projeto
1. Clone o repositório.
2. Suba o ambiente com Docker Compose (ver abaixo).
3. Execute a aplicação Spring Boot.
4. Utilize ferramentas como Postman, Insomnia ou seu navegador para acessar os endpoints da API.
- O arquivo `Agrix.postman_collection.json` contém exemplos de requisições para todos os endpoints da aplicação.

## 🛠️ Configuração do Ambiente
Certifique-se de ter o Docker instalado na sua máquina antes de prosseguir.

1. Subir o ambiente:
```bash
docker-compose up -d
```
2. Encerrar o ambiente:
```bash
docker-compose down
```
