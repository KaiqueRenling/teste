# RennerOnGoing.
Os sub tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologia Utilizadas

- Java  https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html
- Appium  http://appium.io/
- Selenium Web Driver
  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
- Maven  https://maven.apache.org/
- JSON  https://jsonformatter.org/
- Criar Readme   https://stackedit.io/
- ChromeDriver - WebDriver for Chrome
  https://chromedriver.chromium.org/downloads
- OBS: Fazer o download da mesma versão do navegador Chrome instalada em seu computador, criar a pasta drivers e colar chromerdriver.exe.
- Se seu Chrome caso for atualizado automaticamente você tem que atualizar seu Web Driver Chrome também.
- Antes de executar o projeto ir na classe **FrameworkConfig -> IRNRobotsTollConfig** mudar o caminho do seu Webdriver.
- Código completo fica assim:   .driverPath("C:\\drivers\\chromedriver.exe")
    - .driverPath("Caminho do Chrome Web Driver em seu computador")
    - Obs: **utilizar aspas duplas**, no lugar das aspas simples no caminho do seu webdriver.

##	Configurações para executar o projeto:

##  Feature config:
### Feature -> Edit Configurations:
**Main class:** io.cucumber.core.cli.Main
**Glue:** br.com.renner.cucumber.desktop.steps
**Feature or folder path:** C:\Projetos\rennerongoing\Web\tests
Obs: Caminho da feature em seu computador.
**Program arguments:**  --plugin org.jetbrains.plugins.cucumber.java.run.CucumberJvm5SMFormatter
**Working directory:** $MODULE_WORKING_DIR$
**Use classpath of module:** com.br.rennerongoing

##  Folder project:
- A pasta **Web** precisa ficar VERDE, clicar com botão direito em cima dela marca ela como  **Mark directory as** --> **TEST SOURCE ROOT**.

- A pasta **src**, clicar com botão direito na pasta e marca ela como  **Mark directory as** --> **SOURCE ROOT**.

## POM dependecy:
- Adicionar no pom.xml dependecy.
- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
-  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
-  https://www.extentreports.com/docs/versions/3/java/index.html
-  https://robotframework.org/MavenPlugin/dependency-info.html
-  https://mvnrepository.com/artifact/org.testng/testng

## Testes Automatizados
Testes automatizados para simular o cadastro de um item e seu produto no PLM, automatizado o cadastro de um pedido de compra(nacional e internacional) no PLM e sua validação no MDM e RMS...

## Notas Gerais
- BeforeEach e AfterEach (Itens comuns a todos)
- Design Patterns chamado page objetos. Foi criado classes específicas para cada página que você tem na aplicação. Para resolver um problema de reaproveitamento de código.
- Primeiro princípio do PageObject. Tenha um atributo da classe que seja WebDrive.
- Segundo tenha um construtor que recebe o estado atual do seu navegador de fora e jogue pra dentro deste navegador. Métodos de interação com cada método da tela. Fluente Page. 
