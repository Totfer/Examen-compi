package compi;

import java.util.ArrayList;


public class TablaSimbolos {
    ArrayList<String> nombre = new ArrayList<String>();
    ArrayList<String>  direccion = new ArrayList<String>();

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(String nombres) {
        nombre.add(nombres);
    }

    public ArrayList<String> getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccions) {
        direccion.add(direccions);
    }

}
