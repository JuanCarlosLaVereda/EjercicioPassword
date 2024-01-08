public class Password {
    private static int longitud = 10;
    private String contrasenya;

    //Constructores
    public Password(){
        do {
            contrasenya = generarPassword(longitud);
        } while (esFuerte());
    }
    public Password(int longitud){
        contrasenya = generarPassword(longitud);
    }

    //Getters
    public static int getLongitud() {
        return longitud;
    }
    public String getContrasenya() {
        return contrasenya;
    }

    //Setters
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    //Metodos
    public boolean esFuerte(){
        if (contrasenya.length()<10){
            return false;
        }

        int minusculas = 0;
        int mayus = 0;
        int numeros = 0;
        for (int i = 0; i<contrasenya.length(); i++){
            if (contrasenya.charAt(i)>= 'A' && contrasenya.charAt(i)<='Z'){
                mayus++;
            } else if (contrasenya.charAt(i)>='a' && contrasenya.charAt(i)<='z'){
                minusculas++;
            } else {
                numeros++;
            }
        }

        if (mayus>2 && minusculas>1 && numeros>4){
            return true;
        }
        return false;
    }

    private String generarPassword(int longitud){
        String aux = "abcdefghijqlmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String pass = "";
        for (int i=0; i<longitud; i++){
            pass += aux.charAt((int)(Math.random()*aux.length()));
        }
        return pass;
    }
}
