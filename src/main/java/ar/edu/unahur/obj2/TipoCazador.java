package ar.edu.unahur.obj2;

public abstract class TipoCazador implements ICazador{
    protected ICazador cazador;

    
    public TipoCazador(ICazador cazador) {
        this.cazador = cazador;
    }

    @Override
    public Boolean cazar(IProfugo profugo) {
        return cazador.cazar(profugo) && doCazar(profugo);
    }

    protected abstract Boolean doCazar(IProfugo profugo);

    @Override
    public void intimidar(IProfugo profugo) {
        cazador.intimidar(profugo);
        doIntimidar(profugo);
    }

    protected abstract void doIntimidar(IProfugo profugo);

    @Override
    public void capturar(IProfugo profugo) {
        if(this.cazar(profugo)){
            this.cazador.capturar(profugo);
        }else{
            this.intimidar(profugo);
        }
    }

    @Override
    public Integer getExperiencia() {
        return cazador.getExperiencia();
    }

    
}
