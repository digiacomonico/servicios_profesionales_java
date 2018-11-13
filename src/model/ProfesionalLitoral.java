package model;

public class ProfesionalLitoral extends Profesional {

    private static final String TIPO_PROFESIONAL = "Litoral";
    private static final int honorariosPorHora = 3000;

    public ProfesionalLitoral(){
        System.out.println("ProfesionalLitoral instanciado");
    }

    public String getTipoProfesional(){
        return this.TIPO_PROFESIONAL;
    }

    @Override
    public void setHonorarios(int horas) {
        this.honorarios = honorariosPorHora * horas;
    }

    @Override
    public String toString() {
        return "ProfesionalLitoral{" +
                "casaEstudios='" + casaEstudios + '\'' +
                ", honorarios=" + honorarios +
                ", provinciasHabilitadas=" + provinciasHabilitadas +
                '}';
    }
}
