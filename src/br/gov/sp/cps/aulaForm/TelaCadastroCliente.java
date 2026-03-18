package br.gov.sp.cps.aulaForm;

//Importa a biblioteca Swing que contém os componentes gráficos
import javax.swing.*;

import br.gov.sp.cps.controllers.ClienteController;

//Declaração da classe que herda de JFrame
//JFrame representa uma janela gráfica no Java
public class TelaCadastroCliente extends JFrame {

 /**
	 * 
	 */
	private static final long serialVersionUID = 3380577686218387252L;
 // Declaração dos componentes que serão usados na tela

 JLabel lblNome, lblCpf, lblTelefone, lblEmail, lblSexo, lblObservacoes, lblTitulo;
 // JLabel serve para exibir textos na interface

 JTextField txtNome, txtCpf, txtTelefone, txtEmail;
 // JTextField cria campos de texto de uma linha

 JComboBox<String> cbSexo;
 // JComboBox cria uma lista suspensa (combo)

 JTextArea txtObservacoes;
 // JTextArea cria um campo de texto com múltiplas linhas

 JButton btnCadastrar, btnLimpar, btnSair;
 // JButton cria botões clicáveis

 // Construtor da classe (executa quando a tela é criada)
 public TelaCadastroCliente() {

     // Define o título da janela
     setTitle("Cadastro de Clientes");

     // Define o tamanho da janela (largura, altura)
     setSize(500, 400);

     // Centraliza a janela no meio da tela
     setLocationRelativeTo(null);

     // Define que o programa encerra ao fechar a janela
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     // Define layout nulo (permite posicionar componentes manualmente)
     setLayout(null);

     // ------------------------------
     // CRIAÇÃO DO TÍTULO DA TELA
     // ------------------------------

     // Cria o componente de texto
     lblTitulo = new JLabel("Cadastro de Clientes");

     // Define a posição e tamanho do componente
     // (x, y, largura, altura)
     lblTitulo.setBounds(170, 10, 200, 30);

     // Adiciona o componente à janela
     add(lblTitulo);

     // ------------------------------
     // CAMPO NOME
     // ------------------------------

     // Cria o rótulo "Nome"
     lblNome = new JLabel("Nome:");

     // Define posição do rótulo
     lblNome.setBounds(30, 50, 100, 25);

     // Adiciona na janela
     add(lblNome);

     // Cria o campo de texto para digitar o nome
     txtNome = new JTextField();

     // Define posição do campo
     txtNome.setBounds(130, 50, 250, 25);

     // Adiciona o campo na tela
     add(txtNome);

     // ------------------------------
     // CAMPO CPF
     // ------------------------------

     // Cria rótulo CPF
     lblCpf = new JLabel("CPF:");

     // Define posição
     lblCpf.setBounds(30, 90, 100, 25);

     // Adiciona na tela
     add(lblCpf);

     // Cria campo de texto para CPF
     txtCpf = new JTextField();

     // Define posição do campo
     txtCpf.setBounds(130, 90, 250, 25);

     // Adiciona o campo
     add(txtCpf);

     // ------------------------------
     // CAMPO TELEFONE
     // ------------------------------

     // Cria rótulo telefone
     lblTelefone = new JLabel("Telefone:");

     // Define posição
     lblTelefone.setBounds(30, 130, 100, 25);

     // Adiciona na tela
     add(lblTelefone);

     // Cria campo de texto telefone
     txtTelefone = new JTextField();

     // Define posição
     txtTelefone.setBounds(130, 130, 250, 25);

     // Adiciona na tela
     add(txtTelefone);

     // ------------------------------
     // CAMPO EMAIL
     // ------------------------------

     // Cria rótulo email
     lblEmail = new JLabel("E-mail:");

     // Define posição
     lblEmail.setBounds(30, 170, 100, 25);

     // Adiciona na tela
     add(lblEmail);

     // Cria campo de texto email
     txtEmail = new JTextField();

     // Define posição
     txtEmail.setBounds(130, 170, 250, 25);

     // Adiciona na tela
     add(txtEmail);

     // ------------------------------
     // COMBOBOX SEXO
     // ------------------------------

     // Cria rótulo sexo
     lblSexo = new JLabel("Sexo:");

     // Define posição
     lblSexo.setBounds(30, 210, 100, 25);

     // Adiciona na tela
     add(lblSexo);

     // Cria uma lista suspensa com opções
     cbSexo = new JComboBox<>(new String[]{"Masculino", "Feminino", "Outro"});

     // Define posição
     cbSexo.setBounds(130, 210, 150, 25);

     // Adiciona na tela
     add(cbSexo);

     // ------------------------------
     // ÁREA DE OBSERVAÇÕES
     // ------------------------------

     // Cria rótulo observações
     lblObservacoes = new JLabel("Observações:");

     // Define posição
     lblObservacoes.setBounds(30, 250, 100, 25);

     // Adiciona na tela
     add(lblObservacoes);

     // Cria área de texto para observações
     txtObservacoes = new JTextArea();

     // Define posição e tamanho da área
     txtObservacoes.setBounds(130, 250, 250, 50);

     // Adiciona na tela
     add(txtObservacoes);

     // ------------------------------
     // BOTÕES
     // ------------------------------

     // Cria botão cadastrar
     btnCadastrar = new JButton("Cadastrar");

     // Define posição
     btnCadastrar.setBounds(80, 320, 100, 30);

     // Adiciona na tela
     add(btnCadastrar);

     // Cria botão limpar
     btnLimpar = new JButton("Limpar");

     // Define posição
     btnLimpar.setBounds(200, 320, 100, 30);

     // Adiciona na tela
     add(btnLimpar);

     // Cria botão sair
     btnSair = new JButton("Sair");

     // Define posição
     btnSair.setBounds(320, 320, 100, 30);

     // Adiciona na tela
     add(btnSair);

 // Instanciando o controller
 ClienteController controller = new ClienteController(
         txtNome,
         txtCpf,
         txtTelefone,
         txtEmail,
         cbSexo,
         txtObservacoes
 );

 // Associando os eventos aos botões
 btnCadastrar.addActionListener(controller.acaoCadastrar());
 btnLimpar.addActionListener(controller.acaoLimpar());
 btnSair.addActionListener(controller.acaoSair());
}
 
 // Método principal que inicia o programa
 public static void main(String[] args) {

     // Cria um objeto da tela
     TelaCadastroCliente tela = new TelaCadastroCliente();

     // Torna a janela visível
     tela.setVisible(true);
 }
}