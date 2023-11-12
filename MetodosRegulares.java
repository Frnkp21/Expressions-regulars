import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MetodosRegulares {
    public static void main(String[] args) {
        try {
            String nombreArchivo = "santako.txt";
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;


            while ((linea = br.readLine()) != null) {
                int pareNoel = contarCoincidencias(linea, "*<]:-DOo");
                int rencontador = contarCoincidencias(linea, ">:o)");
                int folletcontador = contarCoincidencias(linea, "<]:-D$");


                String salida = formarSalida(pareNoel, rencontador, folletcontador);
                System.out.println(salida);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }


    public static int contarCoincidencias(String input, String pattern) {
        int contador = 0;
        int index = input.indexOf(pattern);
        while (index != -1) {
            contador++;
            index = input.indexOf(pattern, index + 1);
        }
        return contador;
    }

    public static String formarSalida(int pareNoel, int ren, int follet) {
        StringBuilder output = new StringBuilder();
        if (pareNoel > 0) {
            output.append("Pare Noel (").append(pareNoel).append(") ");
        }
        if (ren > 0) {
            output.append("Ren (").append(ren).append(") ");
        }
        if (follet > 0) {
            output.append("Follet (").append(follet).append(") ");
        }
        return output.toString().trim();
    }
}

