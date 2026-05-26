package farmaciaflyweight;

public class VendaMedicamento {

    private String lote;
    private int quantidade;
    private MedicamentoFlyweight medicamento;

    public VendaMedicamento(String lote,
                            int quantidade,
                            MedicamentoFlyweight medicamento) {
        this.lote = lote;
        this.quantidade = quantidade;
        this.medicamento = medicamento;
    }

    public void exibirVenda() {
        medicamento.exibirMedicamento();

        System.out.println("Lote: " + lote);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}