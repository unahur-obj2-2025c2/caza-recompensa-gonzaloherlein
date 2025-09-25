package ar.edu.unahur.obj2;

public interface IProfugo {
    Integer getInocencia();

    Integer getHabilidad();

    Boolean esNervioso();

    void volverseNervioso();

    void dejarDeEstarNervioso();

    void reducirHabilidad();

    void disminuirInocencia();

    void entrenar();

    void aumentarHabilidad(Integer i);

    void setInocencia(Integer i);
}
