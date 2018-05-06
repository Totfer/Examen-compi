package compi;

public class Analizador {
     public static void main(String[] args) {
      crear();
   }
    private static void crear(){
        try {
            String src = "src/compi/";
            String opcFlex[] = { src + "lexico.jflex", "-d", src };
            JFlex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", src, "-parser", "parser", src + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
       } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
