import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppBasic extends Application {

    @Override
    public void start(Stage palco) {
        // Criar componentes
        Label rotulo = new Label("Bem-vindo ao JavaFX!");
        Button botao = new Button("Clique aqui");
        Label mensagem = new Label();

        // Configurar ação do botão
        botao.setOnAction(e -> {
            mensagem.setText("Olá, JavaFX!");
        });

        // Organizar layout
        VBox layout = new VBox(10); // Espaçamento de 10 pixels
        layout.getChildren().addAll(rotulo, botao, mensagem);

        // Configurar cena e palco
        Scene cena = new Scene(layout, 300, 200);
        palco.setTitle("Minha Primeira Aplicação JavaFX");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        // INSERIR: --module-path "/caminho/completo/para/javafx-sdk-21.0.7/lib" --add-modules javafx.controls
        // EM -> Edit Configurations... > "VM OPTIONS"
        launch(args);
    }
}