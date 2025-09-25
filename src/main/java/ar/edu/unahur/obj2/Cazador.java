package ar.edu.unahur.obj2;

import java.util.HashSet;
import java.util.Set;

public class Cazador implements ICazador{
    private Integer experiencia;
    private Set<IProfugo> profugosCapturados;
    private Set<IProfugo> profugosIntimidados;
    
    public Cazador(Integer experiencia,Set<IProfugo> profugosCapturados,Set<IProfugo> profugosIntimidados) {
        this.experiencia = experiencia;
        this.profugosCapturados = new HashSet<>();
        this.profugosIntimidados = new HashSet<>();
    }


    @Override
    public Boolean cazar(IProfugo profugo) {
        return this.experiencia > profugo.getInocencia();
    }


    @Override
    public void intimidar(IProfugo profugo) {
        profugo.disminuirInocencia();
        this.profugosIntimidados.add(profugo);
    }

    public void aumentarExperiencia(){
        experiencia += minimoValorIntimidados() + (2 * profugosCapturados.size());
    }


    private Integer minimoValorIntimidados() {
        return this.profugosIntimidados.stream()
        .mapToInt(IProfugo::getHabilidad)
        .min()
        .orElse(0);
    }

    @Override
    public void capturar(IProfugo profugo) {
        profugosCapturados.add(profugo);
    }


    public Set<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }


    public Set<IProfugo> getProfugosIntimidados() {
        return profugosIntimidados;
    }


    @Override
    public Integer getExperiencia() {
        return experiencia;
    }
    
}