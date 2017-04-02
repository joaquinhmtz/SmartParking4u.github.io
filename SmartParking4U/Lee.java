import java.io.*;

public class Lector {


    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private String sDato = "";
    private int dia;
    private int mes;
    private int anio;


    private int leeInt() {

        int numInt=0;
        
        try {
            sDato = br.readLine();
            numInt = Integer.parseInt(sDato);
        } catch(NumberFormatException e){
            System.out.println("El caracter ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        return numInt;
    }

    private float leeFloat() {

        float numFloat=0;
        
        try {
            sDato = br.readLine();
            numFloat = Float.parseFloat(sDato);
        } catch(NumberFormatException e){
            System.out.println("El caracter ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        return numFloat;
    }

    private String leeString() {
        
        try {
            sDato = br.readLine();
        } catch (IOException e) {}
        return sDato;
    }

    public int leeOption() {
        int opt = 0;
        try{
            dato = br.readLine();
            opt = Integer.parseInt(dato);
        }catch(IOException e) {}
        return opt;
    }
    public int leeDia() {
        try{
            dato = br.readLine();
            dia = Integer.parseInt(dato);
        }catch(IOException e) {}
        return dia;
    }
    public int leeMes() {
        try{
            dato = br.readLine();
            mes = Integer.parseInt(dato);
        }catch(IOException e) {}
        return mes;
    }
    public int leeAnio() {
        try{
            dato = br.readLine();
            anio = Integer.parseInt(dato);
        }catch(IOException e) {}
        return anio;
    }

}