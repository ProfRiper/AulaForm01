package br.gov.sp.cps.controllers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteController {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JComboBox<String> cbSexo;
    private JTextArea txtObservacoes;

    public ClienteController(
            JTextField txtNome,
            JTextField txtCpf,
            JTextField txtTelefone,
            JTextField txtEmail,
            JComboBox<String> cbSexo,
            JTextArea txtObservacoes) {

        this.txtNome = txtNome;
        this.txtCpf = txtCpf;
        this.txtTelefone = txtTelefone;
        this.txtEmail = txtEmail;
        this.cbSexo = cbSexo;
        this.txtObservacoes = txtObservacoes;
    }

    public ActionListener acaoCadastrar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                String telefone = txtTelefone.getText();
                String email = txtEmail.getText();
                String sexo = cbSexo.getSelectedItem().toString();
                String observacoes = txtObservacoes.getText();

                String mensagem = "Dados do Cliente:\n\n"
                        + "Nome: " + nome + "\n"
                        + "CPF: " + cpf + "\n"
                        + "Telefone: " + telefone + "\n"
                        + "E-mail: " + email + "\n"
                        + "Sexo: " + sexo + "\n"
                        + "Observações: " + observacoes;

                JOptionPane.showMessageDialog(null, mensagem);
            }
        };
    }

    public ActionListener acaoLimpar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtCpf.setText("");
                txtTelefone.setText("");
                txtEmail.setText("");
                txtObservacoes.setText("");
                cbSexo.setSelectedIndex(0);
                txtNome.requestFocus();

                JOptionPane.showMessageDialog(null, "Campos limpos com sucesso!");
            }
        };
    }

    public ActionListener acaoSair() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}