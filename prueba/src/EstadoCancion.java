 interface EstadoCancion {
  String obtenerIcono();
  String obtenerLeyenda(Cancion cancion);
  void reproducir(Cancion cancion);
  void darLike(Cancion cancion);
  void darDislike(Cancion cancion);
}
