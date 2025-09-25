package ar.edu.unahur.obj2;

public class Profugo implements IProfugo,IHabilidad{
    private Integer inocencia;
    private Integer habilidad;
    private Boolean esNervioso;
    
    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }

    @Override
    public void disminuirInocencia() {
        this.inocencia = Integer.max(0, this.inocencia - 2);
    }

    @Override
    public void reducirHabilidad() {
        this.habilidad = Integer.max(0, this.habilidad - 5);
    }

    @Override
    public void entrenar() {
       
    }

    @Override
    public void volverseNervioso() {
        this.esNervioso = Boolean.TRUE;
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = Boolean.FALSE;
    }

    @Override
    public void aumentarHabilidad() {
        this.habilidad = Integer.min(100, habilidad * 2);
    }

    @Override
    public void setInocencia(Integer i) {
        this.inocencia = i;
    }

    
}
