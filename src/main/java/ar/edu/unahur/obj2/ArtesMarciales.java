package ar.edu.unahur.obj2;

public class ArtesMarciales extends TipoHabilidad {

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    protected void doEntrenar() {
        profugo.aumentarHabilidad();
    }

    @Override
    public void aumentarHabilidad() {
        profugo.aumentarHabilidad();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public void disminuirInocencia() {
        profugo.disminuirInocencia();
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInocencia() {
        
        return profugo.getInocencia();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
    }

    @Override
    public void setInocencia(Integer i) {
        profugo.setInocencia(i);
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }

    
}
