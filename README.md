# DSA Lab

An educational collection of Java lab exercises for learning data structures and algorithms. The repository currently includes an `Array` exercise folder.


## Requirements

- Java Development Kit (JDK)
- Eclipse IDE (optional)
- JavaFX SDK only for JavaFX-based programs

> **Version note:** Eclipse Neon is an old release and may not work well with Java 23. For a new setup, use a current Eclipse release compatible with your installed JDK. JavaFX SDK versions should also be compatible with the JDK version in use. A separate JRE is generally unnecessary when installing a JDK, which includes the Java runtime.

## Java and Eclipse Installation

### 1. Install a JDK

Download and install [Java JDK 23 for Windows](https://download.oracle.com/java/23/archive/jdk-23.0.2_windows-x64_bin.exe). For the latest supported Java version, choose a JDK release compatible with your Eclipse version.

### 2. Install a JRE (optional)

If you specifically need a standalone JRE, download it from [Oracle Java Downloads](https://javadl.oracle.com/webapps/download/AutoDL?BundleId=251656_7ed26d28139143f38c58992680c214a5). Most development setups can use the runtime included with the JDK.

### 3. Install Eclipse

The original environment used [Eclipse Neon](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/neon/3/eclipse-java-neon-3-win32-x86_64.zip). Since Neon is an older release, a current Eclipse IDE for Java Developers is recommended for newer JDKs.

## JavaFX Setup and Execution

### 1. Download the JavaFX SDK

Download the [JavaFX SDK](https://gluonhq.com/products/javafx/) and extract it. The commands below assume it is located at:

```text
C:\javafx-sdk-24.0.1\
```

Change this path to match your JavaFX SDK location. Use a JavaFX SDK compatible with your JDK.

### 2. Compile a JavaFX program from the terminal

Replace `filedirectory\fileName.java` with the path to your Java source file:

```powershell
javac --module-path "C:\javafx-sdk-24.0.1\lib" --add-modules javafx.controls,javafx.fxml filedirectory\fileName.java
```

### 3. Run the JavaFX program

Replace `fileName` with the main class name. If the class declares a package, use its fully qualified name, such as `package.name.ClassName`.

```powershell
java --module-path "C:\javafx-sdk-24.0.1\lib" --add-modules javafx.controls,javafx.fxml fileName
```

## Configure JavaFX in Eclipse

### Add JavaFX as a user library

1. Open Eclipse and go to **Window → Preferences**.
2. Navigate to **Java → Build Path → User Libraries**.
3. Select **New**, enter a name such as `JavaFX`, and confirm.
4. Select the new library and choose **Add External JARs**.
5. Browse to the `lib` directory inside the extracted JavaFX SDK.
6. Select the JavaFX JAR files required by your program. Common ones include `javafx.base.jar`, `javafx.controls.jar`, `javafx.fxml.jar`, and `javafx.graphics.jar`. Add `javafx.media.jar`, `javafx.swing.jar`, or `javafx.web.jar` only if the program uses those modules.
7. Choose **Open** to add the JARs.

### Add the library to a project

For a new project, create a Java project, then open its **Properties → Java Build Path → Libraries**. For an existing project, right-click the project and open the same settings. In either case, choose **Add Library → User Library**, select **JavaFX**, then apply the changes.

The Java project name and package name do not have to match. Ensure the source file's public class name matches its filename, and use the correct fully qualified class name when launching a packaged class.

## JavaFX Example

Save this as `JAVAFX.java`:

```java
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JAVAFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button button = new Button("Say 'Hello World'");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
```

## Troubleshooting

- **“Add External JARs” is disabled:** Create the user library first, then select it before adding JARs.
- **Eclipse reports JavaFX errors:** Confirm the required JavaFX JARs are included and that your JavaFX SDK is compatible with the JDK.
- **The program does not launch:** Confirm that the needed JavaFX modules are included and that the launch configuration points to a class extending `Application`.
- **The main class cannot be found:** Check the working directory, class name, and package. Use the fully qualified class name for packaged classes.

## License

This repository is maintained for educational purposes. Feel free to use the code for learning, but give credit if you share it.

For questions, reach out to the repository maintainer. Happy learning!