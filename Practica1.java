package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        List<Integer> listaElementos = new ArrayList<>();
        while (it.hasNext()) {
            listaElementos.add(it.next());
        }

        Set<Integer> resultado = new HashSet<>();

        for (int i = 0; i < listaElementos.size(); i++) {
            int num = listaElementos.get(i);
            if (num == 0) {continue;}

            for (int j = 0; j < listaElementos.size(); j++) {
                if (i == j) {continue;}
                int otroNum = listaElementos.get(j);
                if (otroNum != 0 && num % otroNum == 0) {
                    resultado.add(num);
                    break;
                }
            }
        }
        return resultado;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
