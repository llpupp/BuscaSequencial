import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        BuscaSequencial.buscarElementos(num);
    }
    private static void buscarElementos(int num) {

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        for (int i=0; i<=elementos.length-1; i++) {

            if(elementos[i] == num) {
            System.out.println("Achei  " +num+ "  na posicao " + i);
            break;
            }else if(elementos.length == i+1) {
            System.out.println("Numero  " +num+ " nao encontrado! ");
            }
        }
        
    }
}