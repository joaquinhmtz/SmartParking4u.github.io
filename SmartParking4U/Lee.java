public class Lee {


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        String sDato;


    private int leeInt() {

        int numInt=0;
        
        try {
            sDato = flujoE.readLine();
            numero = Integer.parseInt(sDato);
        } catch(NumberFormatException e){
            System.out.println("El caracter ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        return numInt;
    }

    private float leeFloat() {

        float numFloat=0;
        
        try {
            sDato = flujoE.readLine();
            numero = Float.parseFloat(sDato);
        } catch(NumberFormatException e){
            System.out.println("El caracter ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        return numFloat;
    }

    private String leeString() {
        
        try {
            sDato = flujoE.readLine();
        } catch (IOException e) {}
        return sDato;
    }

}