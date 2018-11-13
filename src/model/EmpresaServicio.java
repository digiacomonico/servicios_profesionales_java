package model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;


public class EmpresaServicio {

    private Set universidades = new HashSet();
    private Set profesionales = new HashSet();
    private int honorarioReferencia;


    public EmpresaServicio() {
        System.out.println("Empresa Servicio instanciada");
    }

    public int getHonorarioReferencia() {
        return honorarioReferencia;
    }

    public void setHonorarioReferencia(int honorarioReferencia) {
        this.honorarioReferencia = honorarioReferencia;
    }

    public void agregarProfesionales(List<Profesional> profesionales){
        this.profesionales.addAll(profesionales);
    }

    public void RemoverProfesionales(List<Profesional> profesionales){
        this.profesionales.removeAll(profesionales);
    }

    public void agregarUniversidades(List<Universidad> universidades) {
        this.universidades.addAll(universidades);
    }

    public void removerUniversidades(List<Universidad> universidades){
        this.universidades.removeAll(universidades);
    }

    public List<Profesional> profesionalesCaros(){
        List<Profesional> prof = new ArrayList<>();
        prof.addAll(this.profesionales);
        return prof.stream().filter(p -> p.getHonorarios() > this.getHonorarioReferencia()).collect(Collectors.toList());
    }

    public Profesional profesionalMasBarato(){
        List<Profesional> prof = new ArrayList<>();
        prof.addAll(this.profesionales);

        Comparator <Profesional> profesionalesPorHonorarios = Comparator.comparing(Profesional::getHonorarios);
        List<Profesional> sortedProfesional = prof.stream().sorted(profesionalesPorHonorarios).collect(Collectors.toList());

        return sortedProfesional.get(0);

        //prof.sort(Comparator.comparing(p -> p.getHonorarios())).collect(Collectors.toList());
        //peopleList.sort(Comparator.comparing(Person::getAge));
        //return prof.stream().sorted((p1,p2)->p1.getHonorarios().compareTo(p2.getHonorarios()))
    }


    @Override
    public String toString() {
        return "EmpresaServicio{" +
                "universidades=" + universidades +
                ", profesionales=" + profesionales +
                ", honorarioReferencia=" + honorarioReferencia +
                '}';
    }
}
