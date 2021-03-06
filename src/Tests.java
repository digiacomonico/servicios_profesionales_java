import model.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tests {

    public static void main(String [] args){
        ProfesionalLibre pepe = new ProfesionalLibre();
        ProfesionalVinculado ana = new ProfesionalVinculado();
        ProfesionalLitoral nico = new ProfesionalLitoral();
        Universidad UBA = new Universidad("Universidad de Buenos Aires");
        EmpresaServicio EmpresaA = new EmpresaServicio();

        Set<String> provs = new HashSet<>();
        provs.add("Buenos Aires");
        provs.add("Rio Negro");

        nico.setProvincias(provs);

        nico.setCasaEstudios("Universidad de Buenos Aires");
        pepe.setCasaEstudios("Universidad de Buenos Aires");
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

        System.out.println(EmpresaA.provinciaCubierta("Buenos Aires"));
//        System.out.println(UBA.toString());
//        System.out.println(EmpresaA.toString());
//        System.out.println("La cantidad de profesionales que estudiaron en la UBA son: " + EmpresaA.cantidadProfEstudioEn(UBA));
//
//        System.out.println("La(s) universidad(es) formadora(s) es/son: " + EmpresaA.universidadesFormadoras());
//        System.out.println("El profesional mas barato es: " + EmpresaA.profesionalMasBarato());
//        System.out.println("El/los profesional(es) caro(s) es/son: " + EmpresaA.profesionalesCaros());
//

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
