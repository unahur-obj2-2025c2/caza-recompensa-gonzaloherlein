package ar.edu.unahur.obj2;

public class ProteccionLegal extends TipoHabilidad {

    public ProteccionLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    protected void doEntrenar() {
        profugo.setInocencia(40);
    }

}
