qtdPessoas = int(input("Digite a quantidade de pessoas? "))
nome = []
idade = []
for i in range(0,qtdPessoas):
    nome.append(input("Nome: "))
    idade.append(input("Idade: "))
    idadeMaior = max(idade)
print(f'Quem tem a idade {idadeMaior} é a mais velha')
