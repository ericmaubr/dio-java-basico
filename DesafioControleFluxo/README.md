## Desafio de Controle de Fluxo

Esse é o projeto para resolução do desafio de Controle de Fluxo (https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo)

Para a resolução desse desafio, foi necessária a criação de uma classe de exceção chamada ParametrosInvalidosException. Essa exceção deve ser lançada toda a vez que o segundo parâmetro for maior do que o primeiro, de acordo com a documentação.

Adicionei o tratamento para verificar se ambos parâmetros e entrada são inteiros. Caso não sejam, uma mensagem é impressa no console do usuário.

Utilizei o finally para garantir que o Scanner é fechado sempre, evitando memory leak.

Adicionei uma funcionalidade complementar para a leitura dos parâmetros via linha de comando. Para isso, criei um método chamado lerEntrada, isolando a leitura do método main.

O método lerEntrada verifica se há 2 parâmetros de entrada na linha de comando. Caso tenha, processa esses parâmetros, caso contrário, irá solicitar os parâmetros para o usuário via terminal.
