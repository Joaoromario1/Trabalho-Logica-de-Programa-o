#include <stdio.h>
#include <stdlib.h>

void main(){
    int nota1, nota2, media, notaex;
    printf("Informe a primeira nota: ");
    scanf("%d", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%d", &nota2);

    media = (nota1 + nota2)/2;

    if(media >= 70){
        printf("Sua média foi: %d. Aprovado!!",media);
    }
    if(media >= 40 && media < 70){
        printf("Sua média foi: %d. Exame final!!\n",media);
        printf("Digite a nota do exame final: ");
        scanf("%d", &notaex);
        if(media + notaex >= 100){
            printf("Aprovado!!");
        }else{
            printf("Reprovado!!");
        }
    }if(media < 40){
        printf("Sua média foi: %d. Reprovado!!",media);
    }
    

}
