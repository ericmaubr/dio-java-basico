## Desafio UML - iPhone

Esse é o projeto para resolução do desafio de Controle de Fluxo (https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/poo)

Utilizei a ferramenta Mermaid para a criação do Diagrama UML.

Segue a resolução do desafio.

### Link direto do site do Mermaid

![](https://mermaid.ink/img/pako:eNqNkktuwjAQhq8SeRVU4AARQkJl00URKlVX2Qz2JBnJ8USOjVoop-miB-FidUJ4pgu8Go9_z3zz2AnJCkUiRqNRahw5jUn0UlYaSzQODr-HH44UR3OsIaPWpGXBBlPT_kiN1FDXc4LcQpmaKJzW08mi3dG3b6SXxzesLCvv2L76miToTtacyYSMQ5uBxOn04n5yLMHGgytPBb6-c9WoURIb6ALHK2fJ5FHZ3gZnmAvKrAKLuuD38DNjQ5IfYNGUh8RdbONLtHxNAQ6NwlsyCqEJ7DNbi8QfvI3_o1nABnNQbF-avAbdAzD4SWuyS8jJnOv1Vt8AKTp2ZcEbmK0hvqX1oGkLpxCDu5F1kxyPv6f9wfUl_Yb2Nb0ym1xiKEIjSyAV9rGtOxWuCIuYiiSYCjPw2qUiNfsghQCx-jJSJM56HArLPi9EkoGuw81XKgyhW8uTBBU14MeFb_d-_wfSZfg2?type=png)

### Código Markdown do Mermaid

```mermaid

---
title: Implementação do Desafio do iPhone
---

classDiagram
    class iPhone {
    }

    class ReprodutorMusical{
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet{
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet


```

## Implementação

Defini as interfaces conforme o desafio e implementei a classe iPhone.

Para testar, criei a classe UsuarioiPhone.
Apresento um menu com as opções que o usuário pode escolher e baseado nessa opção, faço a chamada do respectivo método na classe iPhone.
Utilizei a classe Scanner para fazer a leitura da entrada.

Segue o menu apresentado para o usuário

Escolha a ação do iPhone
1 - Tocar música
2 - Pausar música
3 - Selecionar música
4 - Fazer ligação telefônica
5 - Atender ligação telefônica
6 - Iniciar correio de voz
7 - Exibir página Web
8 - Adicionar nova aba no navegador
9 - Atualizar página do navegador
X - Sair do programa
