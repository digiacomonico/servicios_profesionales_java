package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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


    @Override
    public String toString() {
        return "EmpresaServicio{" +
                "universidades=" + universidades +
                ", profesionales=" + profesionales +
                ", honorarioReferencia=" + honorarioReferencia +
                '}';
    }
}
