package trabalhojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TrabalhoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a velocidade permitida:");
        int vp = entrada.nextInt();
        System.out.println("Digite a velocidade do motorista:");
        int vm = entrada.nextInt();
        int multa;
        int taxa = 5;
        if(vm > vp){
            multa = (vm - vp)* taxa;
            System.out.println("A multa foi: "+multa);
        }else{
            System.out.println("Você não foi multado!!");
        }
    }
    
}
