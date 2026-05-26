package farmaciaflyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaMedicamento {

    private static Map<String, MedicamentoFlyweight> medicamentos = new HashMap<>();

    public static MedicamentoFlyweight getMedicamento(String nome,
                                                      String laboratorio,
                                                      String tipo) {

        String chave = nome + laboratorio + tipo;

        if (!medicamentos.containsKey(chave)) {
            medicamentos.put(chave,
                    new MedicamentoFlyweight(nome, laboratorio, tipo));
            System.out.println("Medicamento criado: " + nome);
        }

        return medicamentos.get(chave);
    }

    public static int getTotalMedicamentos() {
        return medicamentos.size();
    }
}