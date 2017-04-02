import java.io.*;

public class Lector {


    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private String sDato = "";
    private int dia;
    private int mes;
    private int anio;


    public int leeInt() {

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

    public float leeFloat() {

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

    public String leeString() {
        
        try {
            sDato = br.readLine();
        } catch (IOException e) {}
        return sDato;
    }

    public int leeOption() {
        int opt = 0;
        try{
            sDato = br.readLine();
            opt = Integer.parseInt(sDato);
        }catch(IOException e) {}
        return opt;
    }
    public int leeDia() {
        try{
            sDato = br.readLine();
            dia = Integer.parseInt(sDato);
        }catch(IOException e) {}
        return dia;
    }
    public int leeMes() {
        try{
            sDato = br.readLine();
            mes = Integer.parseInt(sDato);
        }catch(IOException e) {}
        return mes;
    }
    public int leeAnio() {
        try{
            sDato = br.readLine();
            anio = Integer.parseInt(sDato);
        }catch(IOException e) {}
        return anio;
    }

}