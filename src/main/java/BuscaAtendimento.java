import com.google.gson.JsonParser;
import com.google.gson.JsonObject;
public class BuscaAtendimento {

    AtendimentoSerivce atendimentoSerivce;

    public BuscaAtendimento(AtendimentoSerivce atendimentoSerivce){ this.atendimentoSerivce = atendimentoSerivce;}

    public Atendimento buscaAtendimento(String nome){
        String atendimentoJson = atendimentoSerivce.busca(nome);

        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        return new Atendimento(jsonObject.get("nome").getAsString(),
                jsonObject.get("horaAtendimento").getAsInt(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean validationTime (int horaAtendimento){
        boolean validTempo = atendimentoSerivce.validationTime(horaAtendimento);

        if(validTempo) return true;
        else return false;
    }

    public boolean validationPeriodo(String periodo){
        boolean validPeriodo = atendimentoSerivce.validationPeriodo(periodo);

        if(validPeriodo) return true;
        return false;
    }

}
