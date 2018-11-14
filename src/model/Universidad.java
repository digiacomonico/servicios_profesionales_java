package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Universidad {
    private String nombre;
    private int honorariosRecomendados;
    private String ubicacionProvincia;
    private int donacionesRecibidas = 0;
    private Set provinciasHabilitadas = new HashSet();
    private Set profesionales = new HashSet();
    private static final String VINCULADO = "Vinculado";

    public Universidad(String nombre) {
        this.nombre = nombre;
        System.out.println("Universidad" + nombre + " instanciada");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHonorariosRecomendados() {
        return honorariosRecomendados;
    }

    public void setHonorariosRecomendados(int honorariosRecomendados) {
        this.honorariosRecomendados = honorariosRecomendados;
        getProfesionalesVinculados()
                .stream()
                .forEach(p -> p.setHonorarios(honorariosRecomendados));
    }


    public String getUbicacionProvincia() {
        return ubicacionProvincia;
    }

    public void setUbicacionProvincia(String ubicacionProvincia) {
        this.ubicacionProvincia = ubicacionProvincia;
    }

    public int getDonacionesRecibidas() {
        return donacionesRecibidas;
    }

    public void setDonacionesRecibidas(int valor) {
        this.donacionesRecibidas = donacionesRecibidas + valor;
    }

    public void agregarProvincias(List<String> provincias){
        this.provinciasHabilitadas.addAll(provincias);
    }

    public void agregarProfesionales(List<Profesional> profesionales){
        this.profesionales.addAll(profesionales);
    }

    private List<Profesional> getProfesionalesVinculados(){

        List<Profesional> profVinculados = new ArrayList<>();
        profVinculados.addAll(this.profesionales);
        return profVinculados.stream().filter(p -> p.getTipoProfesional().equals(VINCULADO)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", honorariosRecomendados=" + honorariosRecomendados +
                ", ubicacionProvincia='" + ubicacionProvincia + '\'' +
                ", donacionesRecibidas=" + donacionesRecibidas +
                ", provinciasHabilitadas=" + provinciasHabilitadas +
                ", profesionales=" + profesionales +
                '}';
    }
}
