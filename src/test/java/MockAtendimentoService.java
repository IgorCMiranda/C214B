public class MockAtendimentoService implements AtendimentoSerivce{

    @Override
    public String busca(String nome) {
        if(nome.equals("Pedro")) return AtendimentoConst.PEDRO;
        return AtendimentoConst.AMANDA;
    }

    @Override
    public boolean validationTime(int time){
        if(time >= 0 && time <= 24) return true;
        return false;
    }

    @Override
    public boolean validationPeriodo(String periodo){
        if(periodo.equals("noturno") || periodo.equals("integral")) return true;
        return false;
    }
}
