public class App {
    public static void main(String[] args) throws Exception {
        Cancion cancion = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002);

       /*    
        for (int i = 0; i < 50002; i++) {
            cancion.reproducir();
            cancion.aumentarLikes();
        }


     
       for(int i = 0; i<5002; i++){
            cancion.darDislike();;
        }
        */  
        cancion.noFueReproducidaEnUltimas24Horas();
        cancion.obetenerIconoYLeyenda();
    }
}
