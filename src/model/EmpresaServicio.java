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
        return profresionalesSortedByHonorarios().get(0);
    }

    public List<String> universidadesFormadoras(){
        return casaEstudioProfesionalesWithoutNull().stream().map(p -> p.getCasaEstudios()).collect(Collectors.toList());
    }


//    public int cantidadProfEstudioEn(Universidad){
//        List<Universidad> univ = new ArrayList<>();
//        univ.addAll(this.universidades);
//
//        List<Profesional> prof = new ArrayList<>();
//        prof.addAll(this.profesionales);
//
//        prof.stream().filter(p -> p.getCasaEstudios() == univ.stream().filter(u -> u.getNombre()));
//        return 1;
//    }


    private List<Profesional> profresionalesSortedByHonorarios(){
        List<Profesional> prof = new ArrayList<>();
        prof.addAll(this.profesionales);
        Comparator <Profesional> profesionalesPorHonorarios = Comparator.comparing(Profesional::getHonorarios);
        return prof.stream().sorted(profesionalesPorHonorarios).collect(Collectors.toList());
    }

    private List<Profesional> casaEstudioProfesionalesWithoutNull(){
        List<Profesional> prof = new ArrayList<>();
        prof.addAll(this.profesionales);
        return prof.stream().filter(p -> (p.getCasaEstudios() !=null)).collect(Collectors.toList());
    }

    private void a(){
        List<Profesional> prof = new ArrayList<>();
        prof.addAll(this.profesionales);
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
