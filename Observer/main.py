from Observer.codigo.impl.Observador import observador
from Observer.codigo.impl.Observavel import observavel


if __name__ == "__main__":

    usuario = observavel()

    obsv1 = observador(1)
    obsv2 = observador(2)
    obsv3 = observador(3)

    usuario.registroObservador(obsv1)
    usuario.registroObservador(obsv2)
    usuario.registroObservador(obsv3)

    usuario.getphrase("Aula do Chris eh top")