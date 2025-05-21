import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static int n = 20;
    private static int[] vetor = new int[n];

    private static void cadRandom() {
        Random random = new Random();

        for(int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(100);
        }
        System.out.println("\nValores gerados com sucesso!");
    }

    private static void cadManual() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite os valores do vetor: \n");

        for(int i = 0; i < n; i++) {
            System.out.printf("Valor %d = ", (i+1));
            vetor[i] = scan.nextInt();
        }
        System.out.println("Valores gerados com sucesso!");
    }

    private static void printVetor() {
        System.out.println("\nVetor: ");
        for(int i: vetor) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private static void menuSort() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n**** Sorting Vetor ****");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Retornar");
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Sorts.bubbleSort(vetor);
                    System.out.println("\nVetor ordenado com sucesso!");
                    break;
                case 2:
                    Sorts.selectionSort(vetor);
                    System.out.println("\nVetor ordenado com sucesso!");
                    break;
                case 3:
                    Sorts.insertionSort(vetor);
                    System.out.println("\nVetor ordenado com sucesso!");
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        } while(opcao != 4);
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n**** System Sort Vetor ****");
            System.out.println("1 - Gerar 20 Valores Aleatorios");
            System.out.println("2 - Cadastrar 20 Valores Manual");
            System.out.println("3 - Mostrar Vetor");
            System.out.println("4 - Ordenar");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    cadRandom();
                    break;
                case 2:
                    cadManual();
                    break;
                case 3:
                    printVetor();
                    break;
                case 4:
                    menuSort();
                    opcao = 5;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        } while(opcao != 5);
    }
}
