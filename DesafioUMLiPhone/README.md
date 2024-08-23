## Desafio UML - iPhone

Esse é o projeto para resolução do desafio de Controle de Fluxo (https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/poo)

Utilizei a ferramenta Mermaid para a criação do Diagrama UML.

Segue a resolução do desafio

### Link direto do site do Mermaid

![](https://mermaid.ink/img/pako:eNqNkktuwjAQhq8SeQUqcIAIIaGyYVGEStVVNoM9SUZyPJFjoxbKabroQbhYnRAeabrAq_H498w3j4OQrFDEYjweJ8aR0xhHy6LUWKBxcPo5fXOkOFpgBSk1Jq1zNpiY5kdipIaqWhBkForEROE0nlYWHc6-Yy29Pb5iaVl5x_bFVyRBt7L6TKdkHNoUJM5mN_eTYwl2MLzzlOCrrqtCjZLYQBt3sHGWTBYVzW14ZbmRzEuwqHN-Cz9TNiT5ARRNWcjbxja-QMv3XODQKOyyUghNYJ_ZWiR-5_3gP5oV7DADxXZZ5zXoHoDBD9qSXUNG5lqvt7oDpOjclRXvYL6FQZfWg6Y9XEIM_0ysHeRk8jXrz60v6Te0r-mVWecSIxEaWQCpsI5N3YlwedjDRMTBVJiC1y4RiTkGKQSIzaeRInbW40hY9lku4hR0FW6-VGEI7VZeJKioBj_ve7P2x18x7_gL?type=png)

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
