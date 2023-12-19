
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class Cancion {
  private EstadoCancion estado;
  private String titulo;
  private String artista;
  private String album;
  private int año;
  private int reproducciones;
  private int likes;
  private int dislikes;
  private LocalDateTime ultimaReproduccion;


  public Cancion(String titulo, String artista, String album, int año) {
    this.titulo = titulo;
    this.artista = artista;
    this.album = album;
    this.año = año;
    this.reproducciones = 0;
    this.likes = 0;
    this.dislikes = 0;
    this.ultimaReproduccion = null;
    this.estado = new EstadoNormal();
  }
   

  //Metodos delegados al estado actual
  public void obetenerIconoYLeyenda(){
    JOptionPane.showMessageDialog(null, estado.obtenerLeyenda(this),estado.obtenerIcono(), JOptionPane.DEFAULT_OPTION);
  }

  public void reproducir(){
    estado.reproducir(this);
    ultimaReproduccion = LocalDateTime.now();
  }

  public void darDislike(){
    estado.darDislike(this);
  }

  public void darLike(){
    estado.darLike(this);
  }

  // Métodos para obtener y aumentar reproducciones, likes y dislikes

    public boolean noFueReproducidaEnUltimas24Horas() {
        if (ultimaReproduccion == null) {
            return true;
        }
        return ChronoUnit.HOURS.between(ultimaReproduccion, LocalDateTime.now()) > 24;
    }

    public void cambiarEstado(EstadoCancion nuevoEstado) {
        this.estado = nuevoEstado;
    }

  public String getTitulo(){
    return this.titulo;
  }

  public String getArtista(){
    return this.artista;
  }

  public String getAlbum() {
    return this.album;
  }

  public int getAño(){
    return this.año;
  }

public int getReproducciones() {
  return this.reproducciones;
}

public int getLikes() {
  return this.likes;
}

public int getDislikes() {
  return this.dislikes;
}

public void aumentarReproducciones() {
  this.reproducciones++;
}

public void aumentarLikes() {
  this.likes++;
}

public void aumentarDislikes() {
  this.dislikes++;
}
}
