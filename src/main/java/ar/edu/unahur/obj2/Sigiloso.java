package ar.edu.unahur.obj2;

public class Sigiloso extends TipoCazador{

    public Sigiloso(ICazador cazador) {
        super(cazador);
        
    }

    @Override
    protected Boolean doCazar(IProfugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.reducirHabilidad();
    }

    @Override
    public void aumentarExperiencia() {
    }

}
