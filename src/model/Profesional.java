package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Profesional {
    protected String casaEstudios;
    protected Integer honorarios;
    protected Set provinciasHabilitadas = new HashSet();


    public Profesional() {
        System.out.println("Profesional instanciado");
    }

    public String getTipoProfesional(){
        return "Profesional Generico: Sin Tipo";
    }

    public Integer getHonorarios() {
        return this.honorarios;
    }

    public void setHonorarios(int honorarios) {
        this.honorarios = honorarios;
    }

    public String getCasaEstudios() {
        return this.casaEstudios;
    }

    public void setCasaEstudios(String casaEstudios) {
        this.casaEstudios = casaEstudios;
    }


    public void agregarProvincias(List<String> provincias){
        this.provinciasHabilitadas.addAll(provincias);
    }



    @Override
    public String toString() {
        return "Profesional{" +
                "casaEstudios='" + casaEstudios + '\'' +
                ", honorarios=" + honorarios +
                ", provinciasHabilitadas=" + provinciasHabilitadas +
                '}';
    }
}
