package model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;


public class EmpresaServicio {

    private Set <Universidad>universidades = new HashSet();
    private Set <Profesional>profesionales = new HashSet();
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

    public void removerProfesionales(List<Profesional> profesionales){
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
        return prof.stream().filter(p -> p.getHonorarios() > this.getHonorarioReferencia()).collect(toList());
    }

    public Profesional profesionalMasBarato(){
        return profresionalesSortedByHonorarios().get(0);
    }

    public List<String> universidadesFormadoras(){
        return casaEstudioProfesionalesWithoutNull()
                .stream()
                .map(p -> p.getCasaEstudios())
                .collect(toList());
    }

    public long cantidadProfEstudioEn(Universidad universidad){
        return casaEstudioProfesionalesWithoutNull()
                .stream()
                .filter(p -> p.getCasaEstudios().equals(universidad.getNombre()))
                .count();
    }

    public boolean provinciaCubierta(String provincia){
        return provinciasCubiertasProfesionalesWithoutNull().contains(provincia);
    }

    private List<Profesional> profresionalesSortedByHonorarios(){
        return profesionales
                .stream()
                .sorted(comparing(Profesional::getHonorarios))
                .collect(toList());
    }

    private List<Profesional> casaEstudioProfesionalesWithoutNull(){
        return profesionales.
                stream()
                .filter(p -> (p.getCasaEstudios() != null))
                .collect(toList());
    }

    private List<Profesional> provinciasCubiertasProfesionalesWithoutNull(){
        return profesionales
                .stream()
                .filter(p -> (p.getProvincias() !=null))
                .collect(toList());
    }

//    private List<String> provinciasPWithoutNull(){
//        return profesionales
//                .stream()
//                .map(p -> (p.getProvincias())).toString();
//    }



    @Override
    public String toString() {
        return "EmpresaServicio{" +
                "universidades=" + universidades +
                ", profesionales=" + profesionales +
                ", honorarioReferencia=" + honorarioReferencia +
                '}';
    }
}
