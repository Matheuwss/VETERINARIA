package poo_projetoFinal.DAO;

import poo_projetoFinal.jdbc.ConnectionFactory;
import poo_projetoFinal.model.Funcionario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private Connection con;
    public FuncionarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }

    //método Cadastrar Funcionário (INSERT)
    public void cadastrarFuncionario(Funcionario funcionario){

        try {
            String sql = "INSERT INTO funcionario(crmv,nome,cargo,salario,idade) "
                    + "VALUES(?,?,?,?,?)";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcionario.getCrmv());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getCargo() );
            stmt.setDouble(4, funcionario.getSalario());
            stmt.setInt(5, funcionario.getIdade());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar " +e);
        }
    }

    //método Alterar Funcionário (UPDATE)
    public void alterarFuncionario(Funcionario funcionario){
        try {
            String sql = "UPDATE funcionario  set nome=?,cargo=?,salario=?,idade=? WHERE crmv=?";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo() );
            stmt.setDouble(3, funcionario.getSalario());
            stmt.setInt(4, funcionario.getIdade());
            stmt.setInt(5, funcionario.getCrmv());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " +e);
        }
    }

    //método Excluir Funcionário (DELETE)
    public void excluirFuncionario(Funcionario funcionario){
        try {
            String sql = "DELETE FROM funcionario WHERE crmv =? ";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, funcionario.getCrmv());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " +e);
        }
    }

    //método Listar Funcionário (SELECT)
    public List<Funcionario> listarFuncionario(){
        try {
            List<Funcionario>lista = new ArrayList<>();

            String sql = "SELECT * FROM funcionario";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Funcionario funcionario = new Funcionario();

                funcionario.setCrmv(rs.getInt("crmv"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));

                lista.add(funcionario);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

    public List<Funcionario> buscarFuncionarioPorNome(String nome){
        try {
            List<Funcionario>lista = new ArrayList<>();

            String sql = "SELECT * FROM funcionario WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Funcionario funcionario = new Funcionario();

                funcionario.setCrmv(rs.getInt("crmv"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));

                lista.add(funcionario);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

}