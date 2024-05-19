package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();

        Impressora impressora1 = new Laserjet();
        impressora1.imprimir();

        Impressora impressora2 = new EquipamentoMultifuncional();
        impressora2.imprimir();

        //-----------------------------------------

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora3 = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora3.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
