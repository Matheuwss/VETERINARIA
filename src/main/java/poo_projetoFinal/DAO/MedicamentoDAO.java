package poo_projetoFinal.DAO;

import poo_projetoFinal.jdbc.ConnectionFactory;
import poo_projetoFinal.model.Funcionario;
import poo_projetoFinal.model.Medicamento;
import poo_projetoFinal.model.Animal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoDAO {

    private final Connection con;
    public MedicamentoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }

    //método Cadastrar Medicamento (INSERT)
    public void cadastrarMedicamento(Medicamento medicamento){
        try {
            String sql = "INSERT INTO medicamento(idmedicamento,nome,qtd,valor,funcionario_crmv,animal_idanimal) "
                    + "VALUES(?,?,?,?,?,?)";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, medicamento.getId());
            stmt.setString(2, medicamento.getNome());
            stmt.setDouble(3, medicamento.getQuantidade());
            stmt.setDouble(4, medicamento.getValor());
            stmt.setInt(5, medicamento.getFuncionario().getCrmv());
            stmt.setInt(6, medicamento.getAnimal().getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar " +e);
        }
    }

    //método Alterar Medicamento (UPDATE)
    public void alterarMedicamento(Medicamento medicamento){
        try {
            String sql = "UPDATE medicamento  set nome=?,qtd=?,valor=?,funcionario_crmv=?,animal_idanimal=? WHERE idmedicamento=?";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, medicamento.getNome());
            stmt.setInt(2, medicamento.getQuantidade() );
            stmt.setDouble(3, medicamento.getValor());
            stmt.setInt(4, medicamento.getFuncionario().getCrmv());
            stmt.setInt(5, medicamento.getAnimal().getId());
            stmt.setInt(6, medicamento.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " +e);
        }
    }

    //método Excluir Medicamento (DELETE)
    public void excluirMedicamento(Medicamento medicamento){
        try {
            String sql = "DELETE FROM medicamento WHERE idmedicamento =? ";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, medicamento.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " +e);
        }
    }

    //método Listar Medicamento (SELECT)
    public List<Medicamento> listarMedicamento(){
        try {
            List<Medicamento>lista = new ArrayList<>();

            String sql = "SELECT * FROM Medicamento";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Medicamento medicamento = new Medicamento();

                medicamento.setId(rs.getInt("idmedicamento"));

                medicamento.setNome(rs.getString("nome"));
                medicamento.setQuantidade(rs.getInt("qtd"));
                medicamento.setValor(rs.getInt("valor"));

                Funcionario funcionario = new Funcionario();
                funcionario.setCrmv(rs.getInt("funcionario_crmv"));
                medicamento.setFuncionario(funcionario);

                Animal animal = new Animal();
                animal.setId(rs.getInt("animal_idanimal"));
                medicamento.setAnimal(animal);
                lista.add(medicamento);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

    public List<Medicamento> listarMedicamentoporNome(String nome){
        try {
            List<Medicamento>lista = new ArrayList<>();

            String sql = "SELECT * FROM Medicamento WHERE nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Medicamento medicamento = new Medicamento();

                medicamento.setId(rs.getInt("idmedicamento"));

                medicamento.setNome(rs.getString("nome"));
                medicamento.setQuantidade(rs.getInt("qtd"));
                medicamento.setValor(rs.getInt("valor"));

                Funcionario funcionario = new Funcionario();
                funcionario.setCrmv(rs.getInt("funcionario_crmv"));
                medicamento.setFuncionario(funcionario);

                Animal animal = new Animal();
                animal.setId(rs.getInt("animal_idanimal"));
                medicamento.setAnimal(animal);
                lista.add(medicamento);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

}