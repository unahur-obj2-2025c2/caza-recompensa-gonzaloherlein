package ar.edu.unahur.obj2;

public class Urbano extends TipoCazador{

    public Urbano(ICazador cazador) {
        super(cazador);
        
    }

    @Override
    protected Boolean doCazar(IProfugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
       profugo.dejarDeEstarNervioso();
    }

    @Override
    public void aumentarExperiencia() {
    }

}
