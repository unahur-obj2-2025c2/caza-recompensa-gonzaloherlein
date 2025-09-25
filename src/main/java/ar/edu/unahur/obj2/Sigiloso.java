package ar.edu.unahur.obj2;

public class Sigiloso extends TipoCazador{

    public Sigiloso(ICazador cazador) {
        super(cazador);
        
    }

    @Override
    protected Boolean doCazar(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    protected void doIntimidar(Profugo profugo) {
        profugo.disminuirHabilidad(5);
    }

    @Override
    public void aumentarExperiencia() {
    }

}
