package br.com.salao.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadastroEmpresaView extends AnchorPane {

	// Declara��o dos labels da empresa.
	private Label lbEmpresa, lbNomeFantasia, lbRazaoSocial, lbCNPJ,
			lbTelOneEmp, lbTelTwoEmp, lbEmailEmp, lbPaisEmp, lbEstadoEmp,
			lbCepEmp, lbCidadeEmp, lbBairroEmp, lbRuaEmp, lbNumeroEmp,
			lbComplementoEmp, lbCredNiver, lbCredFidel, lbFinalExpediente;

	// Declara��o dos labels do admin
	private Label lbAdmin, lbNome, lbCTPS, lbRG, lbCPF, lbCargo, lbSalario,
			lbDataNasc, lbTelOneAd, lbTelTwoAd, lbEmailAd, lbPaisAd,
			lbEstadoAd, lbCepAd, lbCidadeAd, lbBairroAd, lbRuaAd, lbNumeroAd,
			lbComplementoAd;

	public Button btCadastrar, btCancelar;

	public DatePicker dpDataNascimento;
	public ComboBox cbPaisEmp, cbEstadoEmp, cbPaisAd, cbEstadoAd, cbCargoAd;

	public TextField tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfTelOneEmp,
			tfTelTwoEmp, tfEmailEmp, tfCepEmp, tfCidadeEmp, tfBairroEmp,
			tfRuaEmp, tfNumeroEmp, tfComplementoEmp, tfCredNiver, tfCredFidel,
			tfFinalExpediente;

	public TextField tfNome, tfCTPS, tfRG, tfCPF, tfSalario, tfDataNasc,
			tfTelOneAd, tfTelTwoAd, tfEmailAd, tfPaisAd, tfEstadoAd, tfCepAd,
			tfCidadeAd, tfBairroAd, tfRuaAd, tfNumeroAd, tfComplementoAd;

	private Separator spEmpresa, spAdmin;

	public CadastroEmpresaView() {
		// TODO Auto-generated constructor stub
	}

	private void iniComponents() {
		lbEmpresa = new Label("Empresa");
		lbNomeFantasia = new Label("Nome Fantasia:* ");
		lbRazaoSocial = new Label("Raz�o social:* ");
		lbCNPJ = new Label("C.N.P.J:* ");
		lbTelOneEmp = new Label("Telefone: ");
		lbTelTwoEmp = new Label("Celular: ");
		lbEmailEmp = new Label("Email:");
		lbPaisEmp = new Label("Pa�s:* ");
		lbEstadoEmp = new Label("Estado:* ");
		lbCepEmp = new Label("CEP:* ");
		lbCidadeEmp = new Label("Cidade:* ");
		lbBairroEmp = new Label("Bairro:* ");
		lbRuaEmp = new Label("Rua:* ");
		lbNumeroEmp = new Label("N�mero:* ");
		lbComplementoEmp = new Label("Complemento: ");
		lbCredNiver = new Label("Cr�dito Anivers�rio: ");
		lbCredFidel = new Label("Cr�dito fidelidade: ");
		lbFinalExpediente = new Label("Hor�rio final de expediente:* ");
		
		
		lbAdmin = new Label("Administrador: ");
		lbNome = new Label("Nome:* ");
		lbCTPS = new Label("CTPS:* ");
		lbRG = new Label("RG:* ");
		lbCPF = new Label("CPF:* ");
		lbCargo = new Label("Cargo:* ");
		lbDataNasc = new Label("Data de nascimento:* ");
		lbTelOneAd = new Label("Telefone: ");
		lbTelTwoAd = new Label("Celular: ");
		lbEmailAd = new Label("Email: ");
		lbPaisAd = new Label("Pa�s:* ");
		lbEstadoAd = new Label("Estado:* ");
		lbCepAd = new Label("CEP:* ");
		lbCidadeAd = new Label("Cidade:* ");
		lbBairroAd = new Label("Bairro:* ");
		lbRuaAd = new Label("Rua:* ");
		lbNumeroAd = new Label("N�mero:* ");
		lbComplementoAd = new Label("Complemento: ");
		
		tfNomeFantasia = new TextField();
		tfRazaoSocial = new TextField();
		tfCNPJ = new TextField();
		tfTelOneEmp = new TextField();
		tfTelTwoEmp = new TextField();
		tfEmailEmp = new TextField();
		tfCepEmp = new TextField();
		tfCidadeEmp = new TextField();
		tfBairroEmp = new TextField();
		tfRuaEmp = new TextField();
		tfNumeroEmp = new TextField();
		tfComplementoEmp = new TextField();
		tfCredNiver = new TextField();
		tfCredFidel = new TextField();
		tfFinalExpediente = new TextField();
		
		tfNome = new TextField();
		tfCTPS = new TextField();
		tfRG = new TextField();
		tfCPF = new TextField();
		tfSalario = new TextField();
		tfDataNasc = new TextField();
		tfTelOneAd = new TextField();
		tfTelTwoAd = new TextField();
		tfEmailAd = new TextField();
		tfPaisAd = new TextField();
		tfEstadoAd = new TextField();
		tfCepAd = new TextField();
		tfCidadeAd = new TextField();
		tfBairroAd =  new TextField();
		tfNumeroAd = new TextField();
		tfComplementoAd = new TextField();
		
		dpDataNascimento = new DatePicker();
		setConfDatePicker();
		
		btCadastrar = new Button("Cadastrar");
		btCancelar = new Button("Cancelar");
		
		spEmpresa = new Separator();
		spEmpresa.setPrefSize(1070, 25);
		spAdmin = new Separator();
		spEmpresa.setPrefSize(1070, 25);
	}

	private void iniLayout() {
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