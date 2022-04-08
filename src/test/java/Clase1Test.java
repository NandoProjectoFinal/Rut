import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class Clase1Test {
private int[] rut;
private String[] DigitoVerificador;
    @BeforeEach
    public void init(){
         rut = new int[]{20901792,8989251,20366482};
        DigitoVerificador = new String[]{"29710902","1529898","28466302"};
    }
    @Test
    public void obtenerDigitoVerificador(){
        for (int i = 0; i < rut.length; i++) {
            String a = ""+Clase1.inverso(rut[i]);
            Assertions.assertEquals(DigitoVerificador[i].toLowerCase(Locale.ROOT),a);
            System.out.println(DigitoVerificador[i]+" Comparado con "+a);
        }
    }
    @AfterEach
    void tearDown(){
        rut= null;
        DigitoVerificador = null;

    }
}