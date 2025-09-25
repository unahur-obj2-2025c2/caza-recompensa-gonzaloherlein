package ar.edu.unahur.obj2;

import java.util.HashSet;
import java.util.Set;

public class Zona {
    private String nombre;
    private Set<Profugo> profugos;

    public Zona(String nombre, Set<Profugo> profugos){
        this.nombre = nombre;
        this.profugos = new HashSet<>(profugos);
    }

    public void cazadorActuaEnLaZona(ICazador cazador){
        profugos.stream().forEach(p -> cazador.capturar(p));
        profugos.clear();
    }

    public Set<Profugo> getProfugos() {
        return profugos;
    }

    
}
