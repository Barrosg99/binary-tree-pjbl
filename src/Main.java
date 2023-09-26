import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scan = new Scanner(System.in);

        int option = -1;
        do {
            try {
                System.out.println(
                "1 - Inserir número\n2 - Procurar número\n3 - Remover número\n4 - Imprimir árvore\n0 - Encerrar programa");
                
                option = scan.nextInt();
                switch (option) {
                    case 1: {
                        System.out.print("Inserir: ");
                        bt.add(scan.nextInt());
                        break;
                    }
                    case 2: {
                        System.out.print("Procurar: ");
                        int number = scan.nextInt();
                        if (bt.search(number)) {
                            System.out.println(number + ": Encontrado");
                        } else {
                            System.out.println(number + ": Não ncontrado");
                        }
                        System.out.println();
                        break;
                    }
                    case 3: {
                        System.out.print("Remover: ");
                        int number = scan.nextInt();

                        if (!bt.search(number))
                            System.out.println(number + ": Não está na árvore");
                        else {
                            bt.remove(number);
                            System.out.println(number + ": Removido");
                        }
                        System.out.println();
                        break;
                    }
                    case 4: {
                        System.out.println();
                        bt.print();
                        System.out.println();
                    }
                }
            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente");
                option = -1;
                scan = new Scanner(System.in);
            }
            
        } while (option != 0);
        
        scan.close();        
    }
}
