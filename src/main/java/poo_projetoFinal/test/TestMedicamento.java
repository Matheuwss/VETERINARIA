package poo_projetoFinal.test;

import poo_projetoFinal.DAO.MedicamentoDAO;
import poo_projetoFinal.model.Funcionario;
import poo_projetoFinal.model.Medicamento;
import poo_projetoFinal.model.Animal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestMedicamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Medicamento> lista = new ArrayList<>();
        MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
        lista = medicamentoDAO.listarMedicamento();

        for (Medicamento medicamento : lista) {
            System.out.println("Medicamento: ");
            System.out.println("ID: "+medicamento.getId());
            System.out.println("Nome: "+medicamento.getNome());
            System.out.println("QTD: "+medicamento.getQuantidade());
            System.out.println("Valor: "+medicamento.getValor());
            System.out.println("Funcionario CRMV: "+medicamento.getFuncionario().getCrmv());
            System.out.println("Animal ID: "+medicamento.getAnimal().getId());

        }

        Funcionario funcionario = new Funcionario();
        Animal animal = new Animal();
        Medicamento medicamento = new Medicamento();

        /*
        System.out.println("Cadastrar Medicamento");
        System.out.print("idMedicamento: ");
        medicamento.setId(sc.nextInt());
        System.out.print("Nome: ");
        medicamento.setNome(sc.nextLine());
        System.out.print("Qtd: ");
        medicamento.setQuantidade(sc.nextInt());
        System.out.print("Valor: ");
        medicamento.setValor(sc.nextDouble());
        System.out.print("Funcionario CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        medicamento.setFuncionario(funcionario);

        System.out.print("Animal ID: ");
        animal.setId(sc.nextInt());
        medicamento.setAnimal(animal);

        medicamentoDAO.cadastrarMedicamento(medicamento);

        System.out.println("Alterar Medicamento");
        System.out.print("idMedicamento de quem vai alterar: ");
        medicamento.setId(sc.nextInt());
        System.out.print("Nome: ");
        sc.nextLine();
        medicamento.setNome(sc.nextLine());
        System.out.print("Qtd: ");
        medicamento.setQuantidade(sc.nextInt());
        System.out.print("Valor: ");
        medicamento.setValor(sc.nextDouble());

        System.out.print("Funcionário CRMV: ");
        funcionario.setCrmv(sc.nextInt());
        medicamento.setFuncionario(funcionario);

        System.out.print("Animal ID: ");
        animal.setId(sc.nextInt());
        medicamento.setAnimal(animal);
        medicamentoDAO.alterarMedicamento(medicamento);

        System.out.print("ID do medicamento a ser escluído:");
        medicamento.setId(sc.nextInt());
        medicamentoDAO.excluirMedicamento(medicamento);
        */
    }

}