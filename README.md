<a id="about"></a>

## Sobre


   Avaliação referente a disciplina de Padrões de Projeto, ministrada pelo professor [Frederico Barboza](http://lattes.cnpq.br/2897532678011764), por meio do repositorio que se encontra [aqui](https://github.com/pooinf008/INF011-2022.1).

<a id="features"></a>

## Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

<h3>Primeira Expecificação 🟢</h3>
     <p>
      Uma rede de academias está solicitando a confecção de um sistema, que suporte a prescrição de programas de treinamento, aulas, agendamento de avaliação, etc. Num       primeiro momento, o foco é a prescrição de programas de treinamento. Para isso, a equipe de projeto propôs o seguinte esquema de classes, que
      descreve os tipos de equipamentos disponíveis na academia e os exercícios que fazem parte dos programas de treinamento.
    </p>
    
   <ul>
        <li> I. Forneça um esquema de criação de equipamentos que possa, sendo extensível, criar os tipos de
        equipamentos atualmente previstos. O esquema de criação deve fornecer um ponto único de criação
        dos equipamentos. 🟢
        <li> II. Será necessário fornecer o tipo de equipamento, um identificador e a quantidade destes
        equipamentos disponíveis na academia. 🟢
        <li> III. O esquema de criação deve funcionar de forma que se for chamado mais de uma vez para o mesmo
        identificador, ao invés de criar novo objeto, ele deverá recuperar o objeto existente, atualizar a
        quantidade, adicionando a nova quantidade passada na criação e retorná-lo. 🟢
        <li> IV. Para garantir a extensibilidade, deve ser mantido arquivo de configuração, em um formato
        chave=valor, onde serão colocados como chaves os tipos de equipamento e como valor, a classe
        que os representa. Por exemplo: Maquina=br.edu.ifba.inf011.aval1.Maquina. 🟢
        <li> V. Forneça um esquema de criação de Exercícios, que permita a criação de exercícios, indicando o seu
        nome, os seus tipos (Resistido, Funcional, Cardiovascular, Mobilidade), os grupos musculares
        envolvidos (quando for o caso) e os equipamentos que são utilizados na sua execução. A quantidade
        de parâmetros é variável e exceto pelo nome, todos os parâmetros são opcionais. 🟢
     </ul>         
                
##### Legenda
- 🟢 = `Feito`.
- 🟠 = `Fazendo`.
- 🔴 = `Pendente/Falta`.

<a id="technologies-used"></a>

## Tecnologias Utilizadas

Esse projeto foi desenvolvido utilizando a seguinte tecnologia, e pacotes:

- [Java](https://www.java.com/pt-BR/)

<a id="how-to-use"></a>

## Como clonar e importar

- Faça um fork do projeto
- Abra o terminal do Visual Studio Code
- Digite (troque cerqueirav pelo nome do seu usuário): git clone https://github.com/cerqueirav/design-patterns/
- Nome da pasta: design-patterns


<a id="how-to-contribute"></a>

## Como contribuir

- Fork este repositório,
- Crie sua branche com sua contribuição: `git checkout -b my-feature`
- Commit suas mudanças: `git commit -m 'feat: My new feature' `
- Push sua branch: `git push origin my-feature`

<h4 align="center">
    Made by <a href="https://github.com/cerqueirav" target="_blank">Victor Cerqueira</a>
</h4>
