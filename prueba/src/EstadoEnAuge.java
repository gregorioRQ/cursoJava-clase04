class EstadoEnAuge implements EstadoCancion {
  @Override
  public String obtenerIcono() {
    int[] codIcon = {0xD83D, 0xDE80};
    String icon = new String(codIcon, 0, codIcon.length);
      return icon;
  }

  @Override
  public String obtenerLeyenda(Cancion cancion) {
      return String.format("%s - %s (%s - %d)", cancion.getArtista(), cancion.getTitulo(),
      cancion.getAlbum(), cancion.getAño());
  }

  @Override
  public void reproducir(Cancion cancion) {
      cancion.aumentarReproducciones();
      if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
          cancion.cambiarEstado(new EstadoEnTendencia());
      }
  }

  @Override
  public void darLike(Cancion cancion) {
      cancion.aumentarLikes();
  }

  @Override
  public void darDislike(Cancion cancion) {
      cancion.aumentarDislikes();
      if (cancion.getDislikes() >= 5000) {
          cancion.cambiarEstado(new EstadoNormal());
      }
  }
}


