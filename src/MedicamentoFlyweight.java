package farmaciaflyweight;

public class MedicamentoFlyweight {

    private String nome;
    private String laboratorio;
    private String tipo;

    public MedicamentoFlyweight(String nome, String laboratorio, String tipo) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void exibirMedicamento() {
        System.out.println("Medicamento: " + nome +
                " | Laboratório: " + laboratorio +
                " | Tipo: " + tipo);
    }
}