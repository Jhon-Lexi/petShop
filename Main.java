public class Main {
    public static void main(String[] prueba) {
        Mascota masc1 = new Mascota();
        // masc1.nombre="Merida";
        // masc1.edad = 4;
        // masc1.saludar();
        Mascota masc2 = new Mascota();
        // masc2.nombre="Yvett";
        // masc2.edad=2;
        // masc2.saludar();
        masc1.setNombre("Merida");
        masc2.setNombre("kaory");
        masc1.setColor("golondrino");
        masc2.setColor("miel");
        masc1.setEdad(4);
        masc2.setEdad(2);
        System.out.println("Nombre: " + masc1.getNombre());
        System.out.println("Edad: " + masc1.getEdad());
        System.out.println("Color: " + masc1.getColor());

        System.out.println("Nombre: " + masc2.getNombre());
        System.out.println("Edad: " + masc2.getEdad() + "años");
        System.out.println("Color: " + masc2.getColor());
    }
}