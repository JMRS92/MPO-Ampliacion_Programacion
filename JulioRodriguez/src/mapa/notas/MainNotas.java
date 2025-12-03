package mapa.notas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainNotas {

    private static final MyScanner sc = new MyScanner();
    private static ArrayList<Asignatura> asignatura = new ArrayList<>();
    private static final int cantidad = 2;

    public static void main(String[] args) {
        pedirAsigantura();
        Map<String, Asignatura> mapa = new HashMap<>();
        for (Asignatura asignatura : asignatura) {
            mapa.put(asignatura.getNombre(), asignatura);
        }

        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

        String clave = sc.pedirTexto("Ingrese el nombre del producto: ");
        boolean existe = mapa.containsKey(clave);
        if (existe) {
            Asignatura asignatura = mapa.get(clave);
            Asignatura.setNota(sc.pedirNumero("Ingrese la nueva nota: "));
        }

        for (String key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }


    }

    public static Asignatura addAsignatura() {
        String nombre = sc.pedirTexto("Introduce el nombre de la asignatura: ");
        int nota = sc.pedirNumero("Introduce la nota de la asigantura: ");

        return new Asignatura(nombre, nota);
    }

    public static void pedirProductos() {
        for (int i = 0; i < cantidad; i++) {
            Asignatura.add(addAsignatura());
        }
    }
}

