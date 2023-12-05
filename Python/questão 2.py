nota1 = int(input("Informe a 1ª nota: "))
nota2 = int(input("Informe a 2ª: "))

media = (nota1 + nota2) / 2
if media >= 70:
    print("Aprovado")
elif media <= 40:
    print("Terá que fazer o exame final")
    notafinal = int(input("Informe a nota final: "))
    if notafinal >= 70:
        print("Você foi aprovado!!")
    elif notafinal < 70:
        print("Reprovado")
else:
    print("Você está reprovado!!")
