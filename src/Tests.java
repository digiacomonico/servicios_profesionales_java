import model.*;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void main(String [] args){
        ProfesionalLibre pepe = new ProfesionalLibre();
        ProfesionalVinculado ana = new ProfesionalVinculado();
        ProfesionalLitoral nico = new ProfesionalLitoral();
        Universidad UBA = new Universidad("Universidad de Buenos Aires");
        EmpresaServicio EmpresaA = new EmpresaServicio();

        pepe.setHonorarios(1500);
        nico.setHonorarios(1);
        List<Profesional> profVinculados = new ArrayList<>();
        profVinculados.add(ana);
        UBA.agregarProfesionales(profVinculados);

        UBA.setHonorariosRecomendados(3000);


        List<Profesional> profEmp = new ArrayList<>();
        profEmp.add(pepe);
        profEmp.add(ana);
        profEmp.add(nico);
        EmpresaA.agregarProfesionales(profEmp);

        List<Universidad> unis = new ArrayList<>();
        unis.add(UBA);
        EmpresaA.agregarUniversidades(unis);

//        System.out.println(nico.toString());
//        System.out.println(UBA.toString());
//        System.out.println(EmpresaA.toString());

        System.out.println("El/los profesional(es) caro(s) es: " + EmpresaA.profesionalesCaros());


//        List<String> provinciasProf = new ArrayList<>();
//        provinciasProf.add("Buenos Aires");
//        provinciasProf.add("Tierra del Fuego");
//        nico.agregarProvincias(provinciasProf);
//
//        List<Profesional> profesionalesUni = new ArrayList<>();
//        profesionalesUni.add(nico);
//        UBA.agregarProfesionales(profesionalesUni);
//
//        List<String> provinciasUni = new ArrayList<>();
//        provinciasUni.add("Buenos Aires");
//        UBA.agregarProvincias(provinciasUni);
//
//        List<Profesional> profesionalesEmp = new ArrayList<>();
//        profesionalesEmp.add(nico);
//        EmpresaA.agregarProfesionales(profesionalesEmp);
//
//        List<Universidad> universidades = new ArrayList<>();
//        universidades.add(UBA);
//        EmpresaA.agregarUniversidades(universidades);






    }
}
