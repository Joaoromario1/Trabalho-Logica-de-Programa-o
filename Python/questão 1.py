vp = int(input("Digite a velocidade maxima da avenidade: "))
vm = int(input("Digite a velocidade do motorista: "))
if vp < vm:
    multa = (vm - vp) * 5 
    print(f'A multa é de: {multa} reais') 
elif vm <= vp:
    print("Não há multa")
