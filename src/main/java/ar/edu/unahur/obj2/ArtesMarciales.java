package ar.edu.unahur.obj2;

public class ArtesMarciales extends TipoHabilidad {

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    protected void doEntrenar() {
        profugo.aumentarHabilidad(2 * profugo.getHabilidad());
    }

}
