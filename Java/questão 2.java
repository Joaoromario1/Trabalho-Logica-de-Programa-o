package trabalhojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TrabalhoNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        int nota1 = entrada.nextInt();
        
        System.out.println("Digite a segunda nota:");
        int nota2 = entrada.nextInt();
         
        int media = (nota1 + nota2)/2;
        if(media >= 70){
            System.out.println("Aprovado!!");
        }else if(media >= 40 && media < 69){
            System.out.println("Exame final!!");
            System.out.println("Digite a nota do exame final:");
            int notaexame = entrada.nextInt();
            if(media + notaexame >= 100){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado!!");
            }
        }if(media<40){
            System.out.println("Reprovado!!");
        }
                
        
    }
    
}
