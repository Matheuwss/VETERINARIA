package poo_projetoFinal.test;

import poo_projetoFinal.DAO.FuncionarioDAO;
import poo_projetoFinal.model.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        lista = funcionarioDAO.listarFuncionario();

        for (Funcionario funcionario : lista) {
            System.out.println("Funcionário: ");
            System.out.println("CRMV: "+funcionario.getCrmv());
            System.out.println("Nome: "+funcionario.getNome());
            System.out.println("Cargo: "+funcionario.getCargo());
            System.out.println("Idade: "+funcionario.getIdade());
            System.out.println("Salário: "+funcionario.getSalario());

        }

        Funcionario funcionario = new Funcionario();

        /*
        System.out.println("Alterar Funcionário");
        System.out.print("CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        System.out.print("Nome: ");
        sc.nextLine();
        funcionario.setNome(sc.nextLine());
        System.out.print("Cargo: ");
        funcionario.setCargo(sc.nextLine());
        System.out.print("Idade: ");
        funcionario.setIdade(sc.nextInt());
        System.out.print("Salário: ");
        funcionario.setSalario(sc.nextDouble());

        funcionarioDAO.cadastrarFuncionario(funcionario);


        System.out.println("Alterar Funcionário");
        System.out.print("CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        System.out.print("Nome: ");
        sc.nextLine();
        funcionario.setNome(sc.nextLine());
        System.out.print("Cargo: ");
        funcionario.setCargo(sc.nextLine());
        System.out.print("Idade: ");
        funcionario.setIdade(sc.nextInt());
        System.out.print("Salário: ");
        funcionario.setSalario(sc.nextDouble());

        funcionarioDAO.alterarFuncionario(funcionario);

        System.out.print("CRMV do funcionário a ser escluído:");
        funcionario.setCrmv(sc.nextInt());
        funcionarioDAO.excluirFuncionario(funcionario);
        */
    }

}