from codigo.interfaces.iObservador import Observador
from codigo.impl.Observavel import observavel

class observador():
    def __init__(self, id):
        self.id = id

    def update(frase):
        print("Qnt de palavras:" + frase.qntpalavras)
        print("Qnt de palavras c/ carac par:" + frase.qntpalavraspar)
        print("Qnt de palavras cmc maiuscula:" + frase.qntpalavrasmai)
        print("\n")