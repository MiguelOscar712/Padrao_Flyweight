package farmaciaflyweight;

public class Main {

    public static void main(String[] args) {

        MedicamentoFlyweight m1 =
                FabricaMedicamento.getMedicamento(
                        "Dipirona",
                        "Neo Química",
                        "Analgésico"
                );

        MedicamentoFlyweight m2 =
                FabricaMedicamento.getMedicamento(
                        "Dipirona",
                        "Neo Química",
                        "Analgésico"
                );

        MedicamentoFlyweight m3 =
                FabricaMedicamento.getMedicamento(
                        "Amoxicilina",
                        "Medley",
                        "Antibiótico"
                );

        VendaMedicamento venda1 =
                new VendaMedicamento("L001", 10, m1);

        VendaMedicamento venda2 =
                new VendaMedicamento("L002", 5, m2);

        VendaMedicamento venda3 =
                new VendaMedicamento("L003", 7, m3);

        venda1.exibirVenda();
        venda2.exibirVenda();
        venda3.exibirVenda();

        System.out.println(
                "Total de objetos Flyweight criados: " +
                        FabricaMedicamento.getTotalMedicamentos()
        );
    }
}