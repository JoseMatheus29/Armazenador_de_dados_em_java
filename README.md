<h1 align="center">Readme</h1>
<h1 align="center">Armazenador de Dados</h1>

<p align="center">
    <a href="#Sobre">Sobre</a> |
    <a href="#Descrição">Descrição</a> |
    <a href="#Pré-requisitos">Pré-Requisitos</a> |
    <a href="#Passo-Passo">Passo-Passo</a>
</p>

# Sobre
<p id="Sobre">O projeto <strong>Armazenador de Dados</strong> foi desenvolvido para armazenar e gerenciar informações de produtos com uma interface gráfica simples, utilizando <strong>Java</strong>.</p>

# Descrição
<p id="Descrição">O sistema foi desenvolvido em <strong>Java</strong>, utilizando <strong>Swing</strong> para a interface gráfica e um sistema de armazenamento baseado em arquivos de texto. Ele permite que usuários realizem operações básicas de <strong>CRUD (Criar, Ler, Atualizar e Deletar)</strong> em produtos.</p>

<p><strong>Principais Funcionalidades:</strong></p>
<ul>
    <li>Cadastro de produtos com <strong>nome</strong> e <strong>quantidade</strong>.</li>
    <li>Listagem dos produtos cadastrados.</li>
    <li>Atualização de informações dos produtos.</li>
    <li>Remoção de produtos do sistema.</li>
    <li>Interface gráfica interativa desenvolvida com <strong>Swing</strong>.</li>
    <li>Persistência de dados em arquivos locais (<code>produtos.txt</code>).</li>
</ul>

<p><strong>Permissões dos Usuários:</strong></p>
<ul>
    <li><strong>Usuário comum:</strong> Pode visualizar os produtos cadastrados.</li>
    <li><strong>Administrador:</strong> Pode adicionar, editar e excluir produtos do sistema.</li>
</ul>

# Pré-requisitos
<p id="Pré-requisitos">Para rodar o projeto é necessário ter instalado em seu computador:</p>

<ul>
    <li><strong>Java (JDK 8 ou superior)</strong></li>
    <li><strong><a href="https://maven.apache.org/">Maven</a></strong> (para gerenciamento de dependências)</li>
    <li><strong>Swing</strong> (para interface gráfica, já incluído no Java)</li>
    <li>Uma IDE para executar o projeto:</li>
        <ul>
            <li><a href="https://www.jetbrains.com/idea/download">IntelliJ IDEA</a></li>
            <li><a href="https://www.eclipse.org/downloads/">Eclipse</a></li>
            <li>Ou qualquer outra IDE compatível com Java</li>
        </ul>
</ul>

# Passo-Passo
<p id="Passo-Passo">Para rodar o projeto, siga os passos abaixo:</p>

<ol>
    <li><strong>Baixe e instale o JDK 8 ou superior</strong>, se ainda não tiver instalado.</li>
    <li><strong>Clone ou copie o repositório</strong> para sua máquina.</li>
    <li><strong>Abra o projeto em uma IDE Java</strong>, como IntelliJ IDEA ou Eclipse.</li>
    <li><strong>Compile e execute o projeto</strong> utilizando o Maven:</li>
    <pre><code>mvn clean install</code></pre>
    <li><strong>Execute o programa</strong> a partir do arquivo <code>.jar</code> gerado:</li>
    <pre><code>java -jar target/Trabalho_final_v2-1.0-SNAPSHOT.jar</code></pre>
    <li>A interface gráfica será aberta e você poderá utilizar o sistema para gerenciar os produtos.</li>
</ol>

<p>Feito por <strong>José Matheus</strong> ✌ 
<a href="https://www.linkedin.com/in/josé-matheus-de-lima-27706a1b6/">Veja meu Linkedin</a></p>
