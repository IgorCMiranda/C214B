public class Atendimento {

    private  String nome;

    private int horaAtendimento;

    private String periodo;

    public Atendimento(String nome, int horaAtendimento, String periodo){
        this.nome = nome;
        this.horaAtendimento = horaAtendimento;
        this.periodo = periodo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoraAtendimento() {
        return horaAtendimento;
    }

    public void setHoraAtendimento(int horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }




}
