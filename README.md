# Pedra, Papel e Tesoura

Este é um aplicativo simples do jogo "Pedra, Papel e Tesoura" desenvolvido em Java utilizando o Android Studio. O jogo permite que o usuário jogue contra o aplicativo e descubra quem vence.

## Capturas de Tela
![image](https://github.com/user-attachments/assets/de7c20d2-d8f9-400e-86e6-8568e8022362)


## Funcionalidades

- O usuário pode escolher entre Pedra, Papel ou Tesoura.
- O aplicativo gera automaticamente sua jogada.
- Exibe o resultado da partida (Vitória, Derrota ou Empate).

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Android Studio**: Ambiente de desenvolvimento integrado (IDE).
- **XML**: Para definir o layout do aplicativo.

## Estrutura de Arquivos

### Código-fonte Principal
- **`MainActivity.java`**: Contém a lógica principal do jogo, como a escolha aleatória do aplicativo e a determinação do vencedor.

### Layout
- **`activity_main.xml`**: Define a interface do usuário, incluindo botões e imagens.

## Lógica do Jogo

- **Pedra vence Tesoura**
- **Tesoura vence Papel**
- **Papel vence Pedra**

Se ambas as escolhas forem iguais, o jogo resulta em empate.
