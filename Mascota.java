public class Mascota {

    private String nombre, color, textura;
    private float tamano, peso;
    private int edad;

    // public void saludar(){
    // System.out.println("hola, soy "+nombre+" tengo "+edad+" años" +" mi color es:
    // "+color);
    // }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
