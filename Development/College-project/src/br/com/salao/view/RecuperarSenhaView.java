package br.com.salao.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RecuperarSenhaView extends AnchorPane{
	private Label lbCpf, lbDataNascimento;
	public TextField tfCpf;
	public DatePicker dpDataNascimento;
	public Button btConfirmar, btCancelar;
	
	public RecuperarSenhaView(){
		iniComponents();
		iniLayout();
	}
	
	
	private void iniComponents(){
		setPrefSize(1100, 680);
		lbCpf = new Label("CPF:*");
		lbDataNascimento = new Label("Data de nascimento:*");
		tfCpf = new TextField();
		dpDataNascimento = new DatePicker();
		setConfDatePicker();
		
		btConfirmar = new Button("Confirmar");
		btCancelar = new Button("Cancelar");
		
		getChildren().addAll(lbCpf,lbDataNascimento,tfCpf,dpDataNascimento,btConfirmar,btCancelar);
	}
	
	private void iniLayout(){
		lbCpf.setLayoutX(400);
		lbCpf.setLayoutY(100);
		lbDataNascimento.setLayoutX(293);
		lbDataNascimento.setLayoutY(150);
		tfCpf.setLayoutX(450);
		tfCpf.setLayoutY(95);
		
		dpDataNascimento.setLayoutX(450);
		dpDataNascimento.setLayoutY(145);
		
		btConfirmar.setLayoutX(400);
		btConfirmar.setLayoutY(295);
		
		btCancelar.setLayoutX(500);
		btCancelar.setLayoutY(295);
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
