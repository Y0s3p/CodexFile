
import java.io.*;

public class Fichero_pantalla {

    public static void main(String[] args) throws IOException {

        try {

            String fichero = "D:\\Proyectos Programacion\\Proyectos_IntelliJ\\Ejercicio_06\\src\\Fichero_pantalla.java";

            String extension = getFileExtension(new File("D:\\Proyectos Programacion\\Proyectos_IntelliJ\\Ejercicio_06\\src\\Fichero_pantalla.java"));

            int i = 0;

            if (extension.equals(".java")){

                //declarar fichero
                File fich = new File(fichero);
                //crear flujo etrada
                FileReader fread = new FileReader(fich);
                //Declarar fichero contenedor
                FileWriter fwrite = new FileWriter("D:\\Proyectos Programacion\\Proyectos_IntelliJ\\Ejercicio_06\\src\\java.cod");

                if (fich.isDirectory()){

                    System.out.println("No es un archivo, es un directorio");

                }else {

                    //leer caracter a caracter
                    while( (i = fread.read()) != -1){
                        System.out.println(i);

                        int asci = (int) ((char) i);

                        int j = i + (i/10))


                        (char) j

                        asci = (asci/10)+asci;

                        fwrite.write(Character.toString ((char) asci));

                    }

                    //cerrar el flujo
                    fread.close();
                    fwrite.close();

                }

            }else {

                System.out.println("El archivo no es .java");

            }


        }catch (IOException e){

            System.out.println("El archivo no existe");

        }


    }

    private static String getFileExtension(File file) {
        String extension = "";

        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }

        return extension;

    }

}
