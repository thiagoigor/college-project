package br.com.salao.view;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TelaUserAdminView extends VBox{
	public AnchorPane paneMenuBar,paneBody;
	public MenuBar menuBar;
    public Menu mCadastrar, mEditar,mConsultar,mRelatorio;
    public MenuItem miAddCliente,miAddServico,miAddFuncionario, 
    miSetCliente, miSetServicoAgenda, miSetFuncionario,miSetServico, miSetEmpresa,miSetParamentros,
    	miFindCliente, miShowServicos, miShowAgendaGeral, miShowDadosUsuario,miFindFuncionario, 
    	
    	miRelServicos;
    
    public Button btAgendamento, btListarServicos, btAddCliente, btSair;
    public Separator sepDownButtons;
	
	public TelaUserAdminView(){
		// TODO Auto-generated constructor stub
		iniComponents();
		iniLayout();
	}
	
	private void iniComponents(){
		
		
		setPrefSize(1100, 680);
		paneMenuBar = new AnchorPane();
		paneMenuBar.setPrefSize(790, 50);
		paneBody = new AnchorPane();
		paneBody.setPrefSize(790, 500);
		
		menuBar = new MenuBar();
		
		
		mCadastrar = new Menu("Cadastro");
		mEditar = new Menu("Editar");
		mConsultar = new Menu("Consulta");
		mRelatorio = new Menu("Relat�rio");
		
		//Cadastros
		miAddCliente = new MenuItem("Novo cliente");
		miAddServico = new MenuItem("Servi�o");
		miAddFuncionario = new MenuItem("Funcion�rio");
		
		//Consultas
		miShowAgendaGeral = new MenuItem("Agendamentos");
		miShowDadosUsuario = new MenuItem("Dados de usu�rio");				
		miFindCliente = new MenuItem("Cliente");
		miShowServicos = new MenuItem("Servi�os");
		miFindFuncionario = new MenuItem("Funcion�rio");
		
		//Editar
		miSetCliente = new MenuItem("Cliente");
		miSetServicoAgenda = new MenuItem("Servi�o agendado");
		miSetServico = new MenuItem("Servi�o");
		miSetFuncionario = new MenuItem("Funcion�rio");
		miSetEmpresa = new MenuItem("Empresa");
		miSetParamentros = new MenuItem("Par�metros");
		
		//Rel�torios
		miRelServicos = new MenuItem("Faturamento");
		
		mCadastrar.getItems().addAll(miAddCliente,miAddServico,miAddFuncionario);
		mEditar.getItems().addAll(miSetCliente, miSetServicoAgenda,miSetServico,miSetFuncionario,miSetEmpresa,miSetParamentros);
		mConsultar.getItems().addAll(miFindCliente, miShowAgendaGeral, miShowServicos, miShowDadosUsuario, miFindFuncionario);
		mRelatorio.getItems().addAll(miRelServicos);
		
		
		btAgendamento = new Button("Agendamento");
		btListarServicos = new Button("Servi�os");
		btAddCliente = new Button("Cadastrar cliente");
		btAgendamento.setPrefSize(150, 80);
		btListarServicos.setPrefSize(150, 80);
		btAddCliente.setPrefSize(150, 80);
		
		btSair = new Button("Sair");
		btSair.setPrefSize(80, 40);
		
		sepDownButtons = new Separator();
		sepDownButtons.setPrefSize(1070,25);
		
		menuBar.getMenus().addAll(mCadastrar,mEditar,mConsultar,mRelatorio);
		paneMenuBar.getChildren().add(menuBar);
		
		paneBody.getChildren().addAll(btAgendamento,btListarServicos,btAddCliente,btSair,sepDownButtons);
		
		getChildren().addAll(paneMenuBar,paneBody);
		
	}
	
	private void iniLayout(){
		menuBar.setLayoutX(0);
		menuBar.setLayoutY(0);
		
		btAgendamento.setLayoutX(30);
		btAgendamento.setLayoutY(10);
		
		btListarServicos.setLayoutX(230);
		btListarServicos.setLayoutY(10);
		
		btAddCliente.setLayoutX(430);
		btAddCliente.setLayoutY(10);
		
		sepDownButtons.setLayoutX(15);
		sepDownButtons.setLayoutY(140);
		
		btSair.setLayoutX(1000);
		btSair.setLayoutY(10);
	}
	
}
