package poo_projetoFinal.test;

import poo_projetoFinal.model.Cliente;
import poo_projetoFinal.DAO.AnimalDAO;
import poo_projetoFinal.model.Animal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Animal> lista = new ArrayList<>();
        AnimalDAO animalDAO =new AnimalDAO();
        lista = animalDAO.listarAnimal();

        for (Animal animal : lista) {
            System.out.println("Animal: ");
            System.out.println("id: " +animal.getId());
            System.out.println("Tipo: " +animal.getTipo());
            System.out.println("Nome: " +animal.getNome());
            System.out.println("Raça: " +animal.getRaca());
            System.out.println("Cliente Cpf: " +animal.getCliente().getCpf());

        }

        Cliente cliente = new Cliente();
        Animal animal = new Animal();

        /*
        System.out.println("Cadastrar Animal");
        System.out.print("idAnimal: ");
        animal.setId(sc.nextInt());
        System.out.print("Tipo: ");
        sc.nextLine();
        animal.setTipo(sc.nextLine());
        System.out.print("Nome: ");
        animal.setNome(sc.nextLine());
        System.out.print("RAÇA: ");
        animal.setRaca(sc.nextLine());
        System.out.print("Cliente CPF: ");
        cliente.setCpf(sc.nextInt());
        animal.setCliente(cliente);

        animalDAO.cadastrarAnimal(animal);


        System.out.println("Alterar Animal");
        System.out.print("idAnimal de quem vai alterar: ");
        animal.setId(sc.nextInt());
        System.out.print("Tipo: ");
        sc.nextLine();
        animal.setTipo(sc.nextLine());
        System.out.print("Nome: ");
        animal.setNome(sc.nextLine());
        System.out.print("RAÇA: ");
        animal.setRaca(sc.nextLine());
        System.out.print("Cliente CPF: ");
        cliente.setCpf(sc.nextInt());
        animal.setCliente(cliente);
        animalDAO.alterarAnimal(animal);


        System.out.print("ID do Animal a ser escluído:");
        animal.setId(sc.nextInt());
        animalDAO.excluirAnimal(animal);
        */
    }

}