import abc
from codigo.impl.Observador import observador     

class texto(abc.ABC):
    
    def registroObservador(self, obs):
        pass
    def removeObservador(self, obs):
        pass
    def notificaObservador(self):
        pass

