package projetos_POO.livraria;

public class Livro implements Publicacao{
   private String titulo;
   private String autor;
   private long totalDePaginas;
   private long paginaAtual;
   private boolean aberto;
   private Pessoa leitor;

   public Livro(String titulo, String autor, long totalDePaginas, Pessoa leitor) {
      this.titulo = titulo;
      this.autor = autor;
      this.totalDePaginas = totalDePaginas;
      this.paginaAtual = 0;
      this.aberto = false;
      this.leitor = leitor;

   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public long getTotalDePaginas() {
      return totalDePaginas;
   }

   public void setTotalDePaginas(long totalDePaginas) {
      this.totalDePaginas = totalDePaginas;
   }

   public long getPaginaAtual() {
      return paginaAtual;
   }

   public void setPaginaAtual(long paginaAtual) {
      this.paginaAtual = paginaAtual;
   }

   public boolean isAberto() {
      return aberto;
   }

   public void setAberto(boolean aberto) {
      this.aberto = aberto;
   }

   public Pessoa getLeitor() {
      return leitor;
   }

   public void setLeitor(Pessoa leitor) {
      this.leitor = leitor;
   }

   public String detalhes() {
      return "Livro: " + this.titulo + "\n"
         + "Autor: " + this.autor + "\n"
         + "Total de Páginas: " + this.totalDePaginas + "\n"
         + "Página Atual: " + this.paginaAtual + "\n"
         + "Aberto: " + (this.aberto ? "Sim" : "Não") + "\n"
         + "Leitor: " + (this.leitor != null ? this.leitor.getNome() : "Nenhum");
   }

   @Override
   public void abrir() {
      if (!this.aberto) { // Só abre se não estiver aberto
         this.aberto = true;
         System.out.println("O livro '" + this.titulo + "' foi aberto.");
      } else {
         System.out.println("O livro '" + this.titulo + "' já está aberto.");
      }
   }

   @Override
   public void fechar() {
      if (this.aberto) { // Só fecha se estiver aberto
         this.aberto = false;
         System.out.println("O livro '" + this.titulo + "' foi fechado.");
      } else {
         System.out.println("O livro '" + this.titulo + "' já está fechado.");
      }
   }

   @Override
   public void folhear(int paginaDestino) {
      if (this.isAberto()) {
         if (paginaDestino >= 0 && paginaDestino <= this.totalDePaginas) {
            this.paginaAtual = paginaDestino;
            System.out.printf("Livro '%s' aberto na página %d.%n", this.titulo, paginaDestino);
         } else {
            System.out.printf("Não é possível ir para a página %d. O livro '%s' tem %d páginas (0 a %d).%n",
            paginaDestino, this.titulo, this.totalDePaginas, this.totalDePaginas);
         }
      } else {
         System.out.println("Não é possível folhear, pois o livro '" + this.titulo + "' está fechado.");
      }
   }

   @Override
   public void avancarPagina() {
      if(this.aberto) {
         if (this.paginaAtual < this.totalDePaginas) {
            this.paginaAtual++;
            System.out.println("Avançou para a página " + this.paginaAtual + " do livro '" + this.titulo + "'.");
         } else {
            System.out.println("Já está na última página do livro '" + this.
            titulo + "'. Não é possível avançar mais.");
         }
      } else {
         System.out.println("Não é possível avançar página, pois o livro '" + this.titulo + "' está fechado.");
      }
   }
   

   @Override
   public void voltarPagina() {
      if (this.aberto) {
         if (this.paginaAtual > 0) { // Só volta se não for a primeira página (ou antes dela)
            this.paginaAtual--;
            System.out.println("Voltou para a página " + this.paginaAtual + " do livro '" + this.titulo + "'.");
         } else {
            System.out.println("Já está na primeira página (ou antes do início) do livro '" + this.titulo + "'. Não é possível voltar mais.");
         }
      } else {
         System.out.println("Não é possível voltar página, pois o livro '" + this.titulo + "' está fechado.");
      }
   }
}
