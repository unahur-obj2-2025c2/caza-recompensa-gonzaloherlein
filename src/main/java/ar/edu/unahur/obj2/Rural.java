package ar.edu.unahur.obj2;

public class Rural extends TipoCazador{

    public Rural(ICazador cazador) {
        super(cazador);
    }

    @Override
    protected Boolean doCazar(Profugo profugo) {
        return profugo.getEsNervioso();
    }

    @Override
    protected void doIntimidar(Profugo profugo) {
        profugo.setEsNervioso(Boolean.TRUE);
    }

    @Override
    public void aumentarExperiencia() {
        cazador.aumentarExperiencia();
    }

}
