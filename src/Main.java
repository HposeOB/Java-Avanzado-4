import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        calcularDivision(4,0);
        mostrarProducto(9);
        abrirArchivo("/Users/mariano/Downloads/prueba.txt");
    }


    public static int calcularDivision(int dividendo, int divisor){
        int resultado= 0;
        try{
            resultado = dividendo / divisor;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        return resultado;
    }

    public static String mostrarProducto(int numeroProducto){
        String producto = "";
        String [] laptops = {"Razer", "Dell", "Samsung", "Lenovo", "Apple", "LG"};

        try{
            producto  = laptops[numeroProducto];
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        return producto;
    }

    public static void abrirArchivo(String ruta){
        try {
            File f = new File(ruta);
            FileInputStream fIS = new FileInputStream(f);
            System.out.println("file content: ");
            int r = 0;
            while((r = fIS.read())!=-1)
            {
                System.out.print((char)r);
            }
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}