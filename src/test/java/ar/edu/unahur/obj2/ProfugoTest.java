package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfugoTest {
    IProfugo profugo = new Profugo(5, 5, Boolean.TRUE);
    IProfugo profugoArtesMarciales = new ArtesMarciales(profugo);
    IProfugo profugoArtesMarcialesConEntrenamientoElite = new EntrenamientoElite(profugoArtesMarciales);
    IProfugo profugoArtesMarcialesConEntrenamientoEliteConProteccionLegal = new ProteccionLegal(profugoArtesMarcialesConEntrenamientoElite);
    @Test
    void testEntrenarProfugoConArtesMarciales() {
        profugoArtesMarciales.entrenar();
        assertEquals(10,profugo.getHabilidad());
    }

    @Test
    void testEntrenarProfugoConArtesMarcialesConEntrenamientoElite() {
        profugoArtesMarcialesConEntrenamientoElite.entrenar();
        assertEquals(10,profugo.getHabilidad());
        assertFalse(profugo.esNervioso());
    }

    @Test
    void testEntrenarProfugoConArtesMarcialesConEntrenamientoEliteConProteccionLegal() {
        profugoArtesMarcialesConEntrenamientoEliteConProteccionLegal.entrenar();
        assertEquals(10,profugo.getHabilidad());
        assertFalse(profugo.esNervioso());
        assertEquals(40,profugo.getInocencia());
    }
}
