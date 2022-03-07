package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Inventario;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class Test_crear {
    @Test
    public void test01CreacionInventario(){
        Inventario inventario = new Inventario();
        assertNotNull(inventario);
    }

}
