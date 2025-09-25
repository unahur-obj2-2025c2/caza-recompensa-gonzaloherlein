package ar.edu.unahur.obj2;

public class Rural extends TipoCazador{

    public Rural(ICazador cazador) {
        super(cazador);
    }

    @Override
    protected Boolean doCazar(IProfugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.volverseNervioso();
    }

    @Override
    public void aumentarExperiencia() {
        cazador.aumentarExperiencia();
    }

}
