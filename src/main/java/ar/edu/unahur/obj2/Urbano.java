package ar.edu.unahur.obj2;

public class Urbano extends TipoCazador{

    public Urbano(ICazador cazador) {
        super(cazador);
        
    }

    @Override
    protected Boolean doCazar(Profugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    protected void doIntimidar(Profugo profugo) {
       profugo.setEsNervioso(Boolean.FALSE);
    }

    @Override
    public void aumentarExperiencia() {
    }

}
