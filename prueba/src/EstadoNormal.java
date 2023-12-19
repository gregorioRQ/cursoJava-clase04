class EstadoNormal implements EstadoCancion{

  @Override
  public String obtenerIcono() { 
    int codIcon[] = {0xD83C, 0xDFB5};
    String icon = new String(codIcon, 0, codIcon.length);
    return icon;
    
  }

  @Override
  public String obtenerLeyenda(Cancion cancion){
    return String.format("%s - %s - %s", cancion.getArtista(), cancion.getAlbum(), cancion.getTitulo());
  }

  @Override
  public void reproducir(Cancion cancion){
    cancion.aumentarReproducciones();
    if(cancion.getReproducciones() > 1000){
      cancion.cambiarEstado(new EstadoEnAuge());
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
