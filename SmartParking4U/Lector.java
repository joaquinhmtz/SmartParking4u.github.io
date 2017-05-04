import java.io.*;

public class Lector {

    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private String sDato;   

    public int leeInt() {

        int numInt=0;
        
        try {
            sDato = br.readLine();
            numInt = Integer.parseInt(sDato);
        } catch(NumberFormatException e){
            System.out.println("El numero ingresado no es correcto");
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
            System.out.println("El monto ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        
        if (numFloat<0)
            numFloat=0;

        return numFloat;
    }

    public String leeCadena() {

        try {
            sDato = br.readLine();
        } catch (IOException e) {}
        
        return sDato;
    }
}