package ar.edu.unahur.obj2;

public class EntrenamientoElite extends TipoHabilidad {

    public EntrenamientoElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    protected void doEntrenar() {
        profugo.dejarDeEstarNervioso();
    }

}
