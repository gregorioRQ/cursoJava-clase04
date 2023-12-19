public class EstadoEnTendencia implements EstadoCancion {

  @Override
  public String obtenerIcono() {
    int codIcon[] = {0xD83D, 0xDD25};
    String icon = new String(codIcon, 0, codIcon.length);
    return icon;
  }

  @Override
  public String obtenerLeyenda(Cancion cancion) {
    return String.format("%s - %s (%s - %d)", cancion.getTitulo(), cancion.getArtista(),
    cancion.getAlbum(), cancion.getAño());
  }

  @Override
  public void reproducir(Cancion cancion) {
    cancion.aumentarReproducciones();
        if (cancion.noFueReproducidaEnUltimas24Horas()) {
            cancion.cambiarEstado(new EstadoNormal());
        }
  }

  @Override
  public void darLike(Cancion cancion) {
    cancion.aumentarLikes();
  }

  @Override
  public void darDislike(Cancion cancion) {
    cancion.aumentarDislikes();
  }

 

}
