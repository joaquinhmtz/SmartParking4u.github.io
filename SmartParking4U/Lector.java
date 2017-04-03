import java.io.*;

public class Lector {


    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private String sDato = "";
    private int [] numero = new int[20];
    Cajon lugar = new Cajon();

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

    public void leeIntArreglo() {
        int i = 0;
        try{
            sDato = br.readLine();
            numero[i] = Integer.parseInt(sDato);
        }catch(IOException e) {}
        //return numero[i];
    }

}