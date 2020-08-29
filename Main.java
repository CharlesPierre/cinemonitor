class Main {
  public static void main(String[] args) {
    Filme filme = new Filme();

    filme.setTitulo("Os Vingadores");
    filme.setAno(2012);
    filme.setTipo("Aventura, Ação, Ficção Científica");

    System.out.println("Filme: " + filme.getTitulo());
    System.out.println("Lançado em: " + filme.getAno());
    System.out.println("Gênero: " + filme.getTipo());
  }
}