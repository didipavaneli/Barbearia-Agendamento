/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import dao.Conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;

import view.CadastroClienteView;


/**
 *
 * @author Adriano Pavaneli
 */
public class CadastroClienteController {
    private CadastroClienteView view;

    public CadastroClienteController(CadastroClienteView view) {
        this.view = view;
    }
    
    public void salvaCliente() throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formatter.parse(view.getTxtCadCliNascimento().getText());
        
        Cliente cliente = new Cliente(view.getTxtCadCliNome().getText() ,view.getTxtCadCliTelefone().getText(),view.getTxtCadCliEmail().getText(),view.getTxtCadCliRg().getText(),view.getTxtCadCliEndereco().getText(), view.getTxtCadCliCep().getText(), dataFormatada, view.getTxtCadcliSexo().getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clienteDao = new ClienteDAO(conexao);
            clienteDao.insert(cliente);
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClienteView.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
}
