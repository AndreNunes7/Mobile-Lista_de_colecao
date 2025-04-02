![tela1](https://github.com/user-attachments/assets/64992e1f-02d3-468a-a7db-f5343b2afb2d)# DesafioP1 - Lista de Itens com Imagens

![GitHub](https://img.shields.io/github/license/seu-usuario/desafiop1)  
![Android](https://img.shields.io/badge/Plataforma-Android-green)



## Descrição

`DesafioP1` é um aplicativo Android simples que permite ao usuário adicionar itens a uma lista, incluindo nome, valor e uma URL de imagem. Os itens são exibidos em uma `RecyclerView` com um layout de cartão, onde as imagens são carregadas dinamicamente usando a biblioteca Glide. O projeto foi desenvolvido em Kotlin e segue práticas modernas de design com Material Components.

### Funcionalidades
- Adicionar itens com nome, valor e URL de imagem.
- Visualizar a lista de itens em uma tela separada.
- Exibição de imagens carregadas da web em cada item.
- Interface amigável com cartões e botões estilizados.

## Capturas de Tela

| Tela Principal | Lista de Itens |
|----------------|----------------|
| ![tela1](https://github.com/user-attachments/assets/2474bafc-f6ec-43b1-ae4a-453477e83e1a) | ![tela2](https://github.com/user-attachments/assets/94fb15c1-4bea-4256-92e4-30a0ffc690df) |

*(Substitua os caminhos das imagens acima por capturas reais do seu app após adicioná-las ao repositório.)*

## Pré-requisitos

- Android Studio (versão recomendada: 2023.1.1 ou superior)
- SDK Android (API mínima: 21 - Android 5.0 Lollipop)
- Conexão com a internet para carregar imagens das URLs

## Instalação

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/desafiop1.git
   ```

Abra no Android Studio:
Abra o Android Studio e selecione "Open an existing project".

Navegue até a pasta clonada e selecione o projeto desafiop1.

2. **Sincronize as Dependências:**
Certifique-se de que o arquivo build.gradle (nível do módulo app) contém:
``` bash
dependencies {
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'com.github.bumptech.glide:glide:4.12.0'
}
```

Clique em "Sync Now" no Android Studio.

4. **Execute o Aplicativo:**
Conecte um dispositivo Android ou use um emulador.

Clique em "Run" (ícone de play) no Android Studio.


### Uso
1. **Adicionar um Item:**
- Na tela principal, preencha os campos:
- Nome do Item: Ex.: "Celular".

Valor do Item: Ex.: "999.99".

- URL da Imagem: Ex.: https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYjcRPkMu-QmjyKH8JOZFIp59mey4XkN6jmw&s.

Clique em "Adicionar à Lista".

2. **Visualizar a Lista:**
- Clique em "Ver Lista de Itens" para abrir a tela com a RecyclerView.

- Cada item exibe o nome, valor e a imagem carregada da URL.

3. **Interagir com os Itens:**
- Os botões "Vender" e "Editar" estão presentes em cada cartão (funcionalidade não implementada ainda).


#### Estrutura do Projeto

``` bash
desafiop1/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/desafiop1/
│   │   │   │   ├── MainActivity.kt         # Tela principal
│   │   │   │   ├── ListaActivity.kt       # Tela da lista
│   │   │   │   ├── ItemAdapter.kt         # Adaptador da RecyclerView
│   │   │   │   ├── Item.kt                # Modelo de dados
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml  # Layout da tela principal
│   │   │   │   │   ├── activity_lista.xml # Layout da lista
│   │   │   │   │   ├── item_card.xml      # Layout de cada item
│   │   │   ├── AndroidManifest.xml        # Manifesto do app
│   ├── build.gradle                       # Configurações do módulo
├── build.gradle                           # Configurações do projeto
└── README.md                              # Este arquivo

```

##### Dependências
- Glide: Para carregar imagens das URLs.

- Material Components: Para componentes de UI modernos (TextInputLayout, MaterialButton).

- CardView: Para o layout de cartões na RecyclerView.







   
