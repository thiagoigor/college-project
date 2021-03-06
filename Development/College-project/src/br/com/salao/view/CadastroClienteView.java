package br.com.salao.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CadastroClienteView extends Application{
	private AnchorPane pane;
	private Scene scene;
	private Label lbNome, lbDataNascimento, lbRg, lbTelOne, lbTelTwo, lbEmail;
	public TextField tfNome, tfRg, tfTelOne, tfTelTwo, tfEmail;
	public DatePicker dpDataNascimento;
	public Button btCadastrar, btCancelar, btAtualizar;
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		iniComponents();
		iniLayout();
		
		stage.setScene(scene);
		stage.setTitle("Cadastro de cliente");
		stage.show();
	}
	
	private void iniComponents(){
		lbNome = new Label("Nome:*");
		lbDataNascimento = new Label("Data de nascimento:*");
		lbRg = new Label("RG: ");
		lbTelOne = new Label("Telefone: ");
		lbTelTwo = new Label("Telefone: ");
		lbEmail = new Label("Email: ");
		
		btCadastrar = new Button("Cadastrar");
		btCancelar = new Button("Cancelar");
		btAtualizar = new Button("Atualizar");
		btAtualizar.setVisible(false);
		dpDataNascimento = new DatePicker();
		setConfDatePicker();
		
		tfNome = new TextField();
		tfNome.setPrefWidth(450);
		tfRg = new TextField();
		tfRg.setPrefWidth(200);
		tfTelOne = new TextField();
		tfTelOne.setPrefWidth(175);
		tfTelTwo = new TextField();
		tfTelTwo.setPrefWidth(200);
		tfEmail = new TextField();
		tfEmail.setPrefWidth(450);
		
		pane = new AnchorPane();
		pane.setPrefSize(700, 400);
		
		pane.getChildren().addAll(lbNome,lbDataNascimento,lbRg,lbTelOne,lbTelTwo,lbEmail,
				tfNome,dpDataNascimento,tfRg,tfTelOne,tfTelTwo,tfEmail, btCadastrar,btAtualizar ,btCancelar);
		
		scene = new Scene(pane);
	}
	private void iniLayout(){
		lbNome.setLayoutX(150);
		lbNome.setLayoutY(55);
		tfNome.setLayoutX(200);
		tfNome.setLayoutY(50);
		
		lbDataNascimento.setLayoutX(76);
		lbDataNascimento.setLayoutY(105);
		dpDataNascimento.setLayoutX(200);
		dpDataNascimento.setLayoutY(100);
		
		lbRg.setLayoutX(420);
		lbRg.setLayoutY(105);
		tfRg.setLayoutX(450);
		tfRg.setLayoutY(100);
		
		lbTelOne.setLayoutX(135);
		lbTelOne.setLayoutY(155);
		tfTelOne.setLayoutX(200);
		tfTelOne.setLayoutY(150);
		
		lbTelTwo.setLayoutX(392);
		lbTelTwo.setLayoutY(155);
		tfTelTwo.setLayoutX(450);
		tfTelTwo.setLayoutY(150);
		
		lbEmail.setLayoutX(152);
		lbEmail.setLayoutY(205);
		tfEmail.setLayoutX(200);
		tfEmail.setLayoutY(200);
		
		btCadastrar.setLayoutX(250);
		btCadastrar.setLayoutY(300);
		
		btCancelar.setLayoutX(375);
		btCancelar.setLayoutY(300);
		
		btAtualizar.setLayoutX(250);
		btAtualizar.setLayoutY(300);
	}
	
	private void setConfDatePicker(){
		String pattern = "dd/MM/yyyy";
		
		dpDataNascimento.setPromptText(pattern.toLowerCase());

		dpDataNascimento.setConverter(new javafx.util.StringConverter<LocalDate>() {
		     DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

		     @Override 
		     public String toString(LocalDate date) {
		         if (date != null) {
		             return dateFormatter.format(date);
		         } else {
		             return "";
		         }
		     }

		     @Override 
		     public LocalDate fromString(String string) {
		         if (string != null && !string.isEmpty()) {
		             return LocalDate.parse(string, dateFormatter);
		         } else {
		             return null;
		         }
		     }
		 });
	}
}
