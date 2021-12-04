package poo_projetoFinal.test;

import poo_projetoFinal.model.Funcionario;
import poo_projetoFinal.DAO.ClienteDAO;
import poo_projetoFinal.model.Cliente;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestCliente {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        List<Cliente> lista = new ArrayList<>();
        ClienteDAO clienteDAO = new ClienteDAO();
        lista = clienteDAO.listarCliente();

        for (Cliente cliente : lista) {
            System.out.println("Cliente: ");
            System.out.println("CPF: "+cliente.getCpf());
            System.out.println("Nome: "+cliente.getNome());
            System.out.println("Telefone: "+cliente.getTelefone());
            System.out.println("Endereço: "+cliente.getEndereco());
            System.out.println("Funcionário CRMV: "+cliente.getFuncionario().getCrmv());

        }

        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();

        /*
        System.out.println("Cadastrar Cliente");
        System.out.print("CPF: ");
        cliente.setCpf(sc.nextInt());
        System.out.print("Nome: ");
        sc.nextLine();
        cliente.setNome(sc.nextLine());
        System.out.print("Telefone: ");
        cliente.setTelefone(sc.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(sc.nextLine());
        System.out.print("Funcionário CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        cliente.setFuncionario(funcionario);

        clienteDAO.cadastrarCliente(cliente);


        System.out.println("Alterar Cliente");
        System.out.print("CPF de quem vai alterar: ");
        cliente.setCpf(sc.nextInt());
        System.out.print("Nome: ");
        sc.nextLine();
        cliente.setNome(sc.nextLine());
        System.out.print("Telefone: ");
        cliente.setTelefone(sc.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(sc.nextLine());
        System.out.print("Funcionário CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        cliente.setFuncionario(funcionario);
        clienteDAO.alterarCliente(cliente);


        System.out.print("CPF do cliente a ser escluído:");
        cliente.setCpf(sc.nextInt());
        clienteDAO.excluirCliente(cliente);
        */
    }

}