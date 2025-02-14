# **Armazenador de Dados**

## **Índice**
<div align="center">

- [Sobre](#sobre)  
- [Descrição](#descrição)  
- [Pré-requisitos](#pré-requisitos)  
- [Passo a Passo para Rodar o Projeto](#passo-a-passo-para-rodar-o-projeto)  

</div

## **[Sobre](#índice)**
O projeto **Armazenador de Dados** foi desenvolvido para armazenar e gerenciar informações de produtos com uma interface gráfica simples, utilizando **Java**.

## **[Descrição](#índice)**
O sistema foi desenvolvido em **Java**, utilizando **Swing** para a interface gráfica e um sistema de armazenamento baseado em arquivos de texto. Ele permite que usuários realizem operações básicas de **CRUD (Criar, Ler, Atualizar e Deletar)** em produtos.

### **Principais Funcionalidades**:
- Cadastro de produtos com **nome** e **quantidade**.
- Listagem dos produtos cadastrados.
- Atualização de informações dos produtos.
- Remoção de produtos do sistema.
- Interface gráfica interativa desenvolvida com **Swing**.
- Persistência de dados em arquivos locais (`produtos.txt`).

O sistema conta com diferentes permissões para os usuários, possibilitando:
- **Usuário comum**: Pode visualizar os produtos cadastrados.
- **Administrador**: Pode adicionar, editar e excluir produtos do sistema.

## **[Pré-requisitos](#índice)**

### **Tecnologias Utilizadas**
- **Java** (JDK 8 ou superior)
- **Maven** (para gerenciamento de dependências)
- **Swing** (para interface gráfica)

## **[Passo a Passo para Rodar o Projeto](#índice)**

1. **Baixe e instale o JDK 8 ou superior**, se ainda não tiver instalado.
2. **Clone ou copie o repositório** para sua máquina.
3. **Abra o projeto em uma IDE Java**, como **IntelliJ IDEA** ou **Eclipse**.
4. **Compile e execute o projeto** utilizando o Maven:
   ```sh
   mvn clean install
Execute o programa a partir do arquivo .jar gerado:
sh
Copiar
Editar
java -jar target/Trabalho_final_v2-1.0-SNAPSHOT.jar
A interface gráfica será aberta e você poderá utilizar o sistema para gerenciar os produtos.
Feito por José Matheus ✌
Veja meu LinkedIn
