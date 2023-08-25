package exercicio2;

import java.util.Scanner;



public class Principal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        	
       GarrafaDAO garrafaDAO = new GarrafaDAO(); 
        
       Garrafa garrafa = new Garrafa();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar");
            System.out.println("2. Inserir");
            System.out.println("3. Excluir");
            System.out.println("4. Atualizar");
            System.out.println("5. Sair");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Digite o id de inicio de listagem: ");
                	int id1 = sc.nextInt();
                	System.out.println("Digite o id de fim da listagem: ");
                	int id2 = sc.nextInt();
                	garrafaDAO.list(id1, id2);
                case 2:
               
                    System.out.println("Digite a cor da garrafa: ");
                    garrafa.setCor(sc.next());
                    System.out.println("Digite o preço da garrafa: ");
                    garrafa.setPreco(sc.nextInt());
                    System.out.println("Digite a marca da garrafa: ");
                    garrafa.setMarca(sc.next());
                    
                    garrafaDAO.insert(garrafa);
                    
                    break;

                case 3:
                    System.out.println("Digite o id da garrafa a ser excluida: ");
                    garrafaDAO.delete(sc.nextInt());
                    break;

                case 4:
                	System.out.println("Digite o ID da garrafa");
                	int id = sc.nextInt();
                    System.out.println("Digite a cor da garrafa: ");
                    garrafa.setCor(sc.next());
                    System.out.println("Digite o preço da garrafa: ");
                    garrafa.setPreco(sc.nextInt());
                    System.out.println("Digite a marca da garrafa: ");
                    garrafa.setMarca(sc.next());
                    
                    garrafaDAO.update(garrafa,id);
                    break;

                case 5:
                    sc.close();
                    return; // 

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
