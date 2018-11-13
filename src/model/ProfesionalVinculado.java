package model;

public class ProfesionalVinculado extends Profesional {

    public static final String TIPO_PROFESIONAL = "Vinculado";

    public ProfesionalVinculado(){
        System.out.println("Profesional Vinculado instanciado");
    }

    public String getTipoProfesional(){
        return this.TIPO_PROFESIONAL;
    }

    @Override
    public String toString() {
        return "ProfesionalVinculado{" +
                "casaEstudios='" + casaEstudios + '\'' +
                ", honorarios=" + honorarios +
                ", provinciasHabilitadas=" + provinciasHabilitadas +
                '}';
    }
}
