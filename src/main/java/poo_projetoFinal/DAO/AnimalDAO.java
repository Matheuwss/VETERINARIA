package poo_projetoFinal.DAO;

import poo_projetoFinal.jdbc.ConnectionFactory;
import poo_projetoFinal.model.Cliente;
import poo_projetoFinal.model.Animal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    private Connection con;
    public AnimalDAO(){
        this.con = new ConnectionFactory().getConnection();
    }

    //método Cadastrar Animal (INSERT)
    public void cadastrarAnimal(Animal animal){
        try {
            String sql = "INSERT INTO animal(idanimal,tipo,nome,raca,cliente_cpf) "
                    + "VALUES(?,?,?,?,?)";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, animal.getId());
            stmt.setString(2, animal.getTipo());
            stmt.setString(3, animal.getNome());
            stmt.setString(4, animal.getRaca());
            stmt.setInt(5, animal.getCliente().getCpf());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar " +e);
        }
    }

    //metodo Alterar Animal (UPDATE)
    public void alterarAnimal(Animal animal){
        try {
            String sql = "UPDATE animal  set tipo=?,nome=?,raca=?,cliente_cpf=? WHERE idanimal=?";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, animal.getTipo());
            stmt.setString(2, animal.getNome());
            stmt.setString(3, animal.getRaca());
            stmt.setInt(4, animal.getCliente().getCpf());
            stmt.setInt(5, animal.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " +e);
        }
    }

    //método Excluir Animal (DELETE)
    public void excluirAnimal(Animal animal){
        try {
            String sql = "DELETE FROM animal WHERE idanimal =? ";

            //tratar e executar os comandos SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, animal.getId());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso");

        } catch ( SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " +e);
        }
    }

    //método Listar Animal (SELECT)
    public List<Animal> listarAnimal(){
        try {
            List<Animal>lista = new ArrayList<>();

            String sql = "SELECT * FROM animal";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Animal animal = new Animal();
                Cliente cliente = new Cliente();

                animal.setId(rs.getInt("idanimal"));
                animal.setTipo(rs.getString("tipo"));
                animal.setNome(rs.getString("nome"));
                animal.setRaca(rs.getString("raca"));
                cliente.setCpf(rs.getInt("cliente_cpf"));
                animal.setCliente(cliente);

                lista.add(animal);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

    public List<Animal> listarAnimalPorNome(String nome){
        try {
            List<Animal>lista = new ArrayList<>();

            String sql = "SELECT * FROM animal WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Animal animal = new Animal();
                Cliente cliente = new Cliente();

                animal.setId(rs.getInt("idanimal"));
                animal.setTipo(rs.getString("tipo"));
                animal.setNome(rs.getString("nome"));
                animal.setRaca(rs.getString("raca"));
                cliente.setCpf(rs.getInt("cliente_cpf"));
                animal.setCliente(cliente);

                lista.add(animal);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " +e);
            return null;
        }
    }

}