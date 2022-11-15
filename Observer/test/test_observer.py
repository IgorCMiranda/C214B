from codigo.impl.Observador import observador
from codigo.impl.Observavel import observavel

class TestObs():

    def teste_list_vazia(self):
        Observavel = observavel()

        assert len(Observavel.list_observers) == 0

    def test_list_1(self):

        Observavel = observavel()
        Observador = observador(10)
        Observavel.registroObservador(observador)

        assert len(Observavel.list_observers) == 1    

    def test_qntpalavras(self):

        Observavel = observavel()
        Observavel.getphrase('Aula do Chris zika')

        assert Observavel.qntpalavras == 4

    def test_qntmaiu(self):

        Observavel = observavel()
        Observavel.getphrase('Aula do Chris zika')

        assert Observavel.qntpalavrasmai == 2 