#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void main(){
    int num_pessoas;

    printf("Digite a quantidade de pessoas:");
    scanf("%d", &num_pessoas);

    char nomes[num_pessoas][50];
    int idades[num_pessoas];

    for(int i =0; i < num_pessoas; i++){
        printf("Digite o nome da pessoa: ");
        scanf("%s",nomes[i]);

        printf("Digite a idade da pessoa: ");
        scanf("%d", &idades[i]);

    }
    int maisVelho = 0;

    for(int i = 1; i < num_pessoas; i++){
        if(idades[i] > idades[maisVelho]){
            maisVelho = i;
        }
    }
    printf("A pessoa mais velha é: %s",nomes[maisVelho]);
}
