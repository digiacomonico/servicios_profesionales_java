package model;

public class ProfesionalLibre extends Profesional {

    private Integer totalRecaudado = 0;
    private static final String TIPO_PROFESIONAL = "Libre";

    public ProfesionalLibre() {
        System.out.println("ProfesionalLibre instanciado");
    }

    public Integer getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(Integer valor) {
        this.totalRecaudado = valor + totalRecaudado;
    }

    public String getTipoProfesional(){
        return TIPO_PROFESIONAL;
    }

    @Override
    public void setHonorarios(int valor) {
        this.honorarios = valor;
        this.setTotalRecaudado(valor);
    }

    @Override
    public String toString() {
        return "ProfesionalLibre{" +
                "totalRecaudado=" + totalRecaudado +
                ", casaEstudios='" + casaEstudios + '\'' +
                ", honorarios=" + honorarios +
                ", provinciasHabilitadas=" + provincias +
                '}';
    }
}

