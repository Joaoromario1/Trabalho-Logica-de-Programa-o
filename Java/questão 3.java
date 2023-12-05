package trabalhojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MaisVelho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas:");
        int tamanho = entrada.nextInt();
        
        int [] idades = new int [tamanho];
        String [] nomes = new String [tamanho];
        
        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o nome da pessoa:");
            nomes[i] = entrada.next();
            
            System.out.println("Digite a idade da pessoa:");
            idades[i] = entrada.nextInt();
        }
        int maisVelho = 0;
        
        for(int i = 1; i < tamanho; i++){
            if(idades[i] > idades[maisVelho]){
                maisVelho = i;
            }
        }
        System.out.println("O mais velho é:"+nomes[maisVelho]);
        
    }
    
}
