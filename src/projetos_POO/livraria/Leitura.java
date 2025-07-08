package projetos_POO.livraria;

public class Leitura {
   public static void main(String[] args) {
      Pessoa[] leitor = new Pessoa[2];
      Livro[] livro = new Livro[3];

      leitor[0] = new Pessoa("Raí", 60, "masculino");
      leitor[1] = new Pessoa("Irene", 40, "feminino");

      livro[0] = new Livro("Bíblia", "Jeová", 1025, leitor[0]);
      livro[1] = new Livro("Examine", "Jeová", 370, leitor[1]);

      System.out.println(livro[1].detalhes());
      livro[0].abrir();
      livro[0].folhear(200);
      livro[0].avancarPagina();
      livro[0].voltarPagina();
      livro[0].voltarPagina();
      System.out.println(livro[0].detalhes());
   }
}
