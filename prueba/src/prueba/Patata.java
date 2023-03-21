package prueba;

public class Patata {
	public static void main(String[] args) {
        String palabra = "patata";

        for (int i = 0; i < 8; i++) {
            System.out.println(palabra);
            palabra += "a";
        }
    }
}
