package ar.edu.unahur.obj2;

public interface ICazador {
    Boolean cazar(IProfugo profugo);
    void intimidar(IProfugo profugo);
    void capturar(IProfugo profugo);
    void aumentarExperiencia();
    Integer getExperiencia();
}
