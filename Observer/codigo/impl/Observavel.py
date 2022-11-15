from codigo.interfaces.iObservavel import texto

class observavel(texto):
    def __init__(self):
        self.list_observers = []
        self.qntpalavras = 0
        self.qntpalavraspar = 0
        self.qntpalavrasmai = 0

    def registroObservador(self, obs):
        self.list_observers.append(obs)

    def removeObservador(self, obs):
        if obs in self.list_observers:
            self.list_observers.remove(obs)

    def notificaObservador(self):
        for i in self.list_observers:
            i.update(self)

    def split_phrase(self, phrase):
        return(len(phrase.split(" ")))

    def qnt_par(self, phrase):
        cont = 0
        for i in phrase.split(" "):
            if (len(i) % 2 == 0):
                cont += 1
        return cont

    def qnt_mai(self, phrase):
        contmaiu = 0
        for i in phrase.split(" "):
            if i[0].isupper == 0:
                contmaiu += 1
        return contmaiu

    def getphrase(self, phrase):
        self.qntpalavras = self.split_phrase(phrase)
        self.qntpalavraspar = self.qnt_par(phrase)
        self.qntpalavrasmai = self.qnt_mai(phrase)

        self.notificaObservador()
    
