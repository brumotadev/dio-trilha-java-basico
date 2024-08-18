package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamentoMultifuncional = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = equipamentoMultifuncional;
        Digitalizadora digitalizadora = equipamentoMultifuncional;
        Copiadora copiadora = equipamentoMultifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();



    }
}
