package br.com.salao.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadastroServicoView extends Application{
	private AnchorPane pane;
	public Button btConfirmar, btCancelar;
	private Label lbServico, lbValor, lbTime;
	private TextField tfServico, tfValor, tfTime;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void iniComponets(){
		lbServico = new Label("Servi�o: ");
		lbValor = new Label("Valor: ");
		lbTime = new Label("Tempo(min): ");
		
		tfServico = new TextField();
		tfTime = new TextField();
		tfValor = new TextField();
		
		btCancelar = new Button("Cancelar");
		btConfirmar = new Button("Confirmar");
		
		pane = new AnchorPane();
		pane.setPrefSize(500, 350);
		
		pane.getChildren().addAll(lbServico,lbTime,lbValor,tfServico,tfTime,tfValor,btCancelar,btConfirmar);
	}
	private void iniLayout(){
		lbServico.setLayoutX(56);
		lbServico.setLayoutY(35);
		
		lbTime.setLayoutX(30);
		lbTime.setLayoutY(135);
		
		lbValor.setLayoutX(66);
		lbValor.setLayoutY(85);
		
		tfServico.setLayoutX(110);
		tfServico.setLayoutY(30);
		
		tfValor.setLayoutX(110);
		tfValor.setLayoutY(80);
		
		tfTime.setLayoutX(110);
		tfTime.setLayoutY(130);
		
		btCancelar.setLayoutX(275);
		btCancelar.setLayoutY(200);
		
		btConfirmar.setLayoutX(150);
		btConfirmar.setLayoutY(200);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		iniComponets();
		iniLayout();
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Cadastro de servi�o");
		stage.show();
	}
}
