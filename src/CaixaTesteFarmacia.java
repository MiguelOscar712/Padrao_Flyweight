package farmaciaflyweight;

public class CaixaTesteFarmacia {

    public static void main(String[] args) {

        System.out.println("      CAIXA DE TESTE FARMÁCIA");


        System.out.println("\nTESTE 01 - Criar medicamento");

        MedicamentoFlyweight m1 =
                FabricaMedicamento.getMedicamento(
                        "Dipirona",
                        "Neo Química",
                        "Analgésico"
                );

        if (m1 != null) {
            System.out.println("TESTE 01 APROVADO");
        } else {
            System.out.println("TESTE 01 REPROVADO");
        }


        System.out.println("\nTESTE 02 - Reutilizar Flyweight");

        MedicamentoFlyweight m2 =
                FabricaMedicamento.getMedicamento(
                        "Dipirona",
                        "Neo Química",
                        "Analgésico"
                );

        if (m1 == m2) {
            System.out.println("TESTE 02 APROVADO");
            System.out.println("Mesmo objeto reutilizado.");
        } else {
            System.out.println("TESTE 02 REPROVADO");
        }


        System.out.println("\nTESTE 03 - Criar novo medicamento");

        MedicamentoFlyweight m3 =
                FabricaMedicamento.getMedicamento(
                        "Amoxicilina",
                        "Medley",
                        "Antibiótico"
                );

        if (m3 != null) {
            System.out.println("TESTE 03 APROVADO");
        } else {
            System.out.println("TESTE 03 REPROVADO");
        }


        System.out.println("\nTESTE 04 - Criar vendas");

        VendaMedicamento venda1 =
                new VendaMedicamento("L001", 10, m1);

        VendaMedicamento venda2 =
                new VendaMedicamento("L002", 5, m2);

        VendaMedicamento venda3 =
                new VendaMedicamento("L003", 7, m3);

        venda1.exibirVenda();
        venda2.exibirVenda();
        venda3.exibirVenda();

        System.out.println("TESTE 04 APROVADO");


        System.out.println("\nTESTE 05 - Total de Flyweights");

        int total = FabricaMedicamento.getTotalMedicamentos();

        System.out.println("Total encontrado: " + total);

        if (total == 2) {
            System.out.println("TESTE 05 APROVADO");
        } else {
            System.out.println("TESTE 05 REPROVADO");
        }


        System.out.println("      TODOS OS TESTES FINALIZADOS");
    }
}