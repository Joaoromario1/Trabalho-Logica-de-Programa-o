#include <stdio.h>
#include <stdlib.h>

void main(){
    int vp, vm, multa;
    int taxa = 5;

    printf("Digite a velocidade permitida: ");
    scanf("%d", &vp);
    printf("Digite a velocidade do motorista: ");
    scanf("%d", &vm);
    multa = (vm - vp) * taxa;
    if(vm > vp){
        printf("Você recebeu uma multa de: %d reais", multa);

    }else{
        printf("Não há multa!");
    }
}
