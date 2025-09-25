package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class CazadorTest {
    
    Profugo profugo1 = new Profugo(6, 20, Boolean.TRUE);
    Profugo profugo3 = new Profugo(6, 20, Boolean.TRUE);
    Profugo profugo2 = new Profugo(6, 20, Boolean.FALSE);
    Profugo profugo4 = new Profugo(3, 15, Boolean.FALSE);
    Zona moron = new Zona("Moron", Set.of(profugo1,profugo2,profugo3,profugo4));
    ICazador cazador = new Cazador(8,null,null);
    ICazador rural = new Rural(cazador);
    
    @Test
    void testCazadorRuralPuedeCazarProfugo1() {
        assertTrue(rural.cazar(profugo1));
        moron.cazadorActuaEnLaZona(rural);
        assertEquals(0,moron.getProfugos().size());
    }

    @Test
    void testCazadorRuralNoPuedeCazarProfugo2YLoIntimida() {
        assertFalse(rural.cazar(profugo2));
        moron.cazadorActuaEnLaZona(rural);
        assertEquals(4,profugo2.getInocencia());
    }


    @Test
    void testExperienciaCazadorRuralDespuesDeActuarEnLaZona() {
        moron.cazadorActuaEnLaZona(rural);
        rural.aumentarExperiencia();
        assertEquals(27,rural.getExperiencia());
    }
}
