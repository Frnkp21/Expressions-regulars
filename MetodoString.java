import java.io.*;

public class MetodoString {
    public static void main(String[] args) throws IOException {

        String file = "santako.txt";
        BufferedReader bfr = new BufferedReader(new FileReader(file));

        String line = "";

        while ((line = bfr.readLine()) != null) {
            int papanoel = co(line, "<]:-DOo");
            int reno = co(line, ">:o)");
            int follet = co(line, "<]:-D");

            StringBuilder salida = new StringBuilder();
            if (papanoel > 0) {
                salida.append("Pare Noel (").append(papanoel).append(") ");
            }
            if (reno > 0) {
                salida.append("Ren (").append(reno).append(") ");
            }
            if (follet > 0 && papanoel == 0 && reno == 0) {
                salida.append("Follet (").append(follet).append(") ");
            }

            System.out.println(salida.toString().trim());
        }
    }
    public static int co(String line, String patron) {
        int c = 0;
        int i = 0;

        while ((i = line.indexOf(patron, i)) != -1) {
            c++;
            i++;
        }
        return c;
    }
}