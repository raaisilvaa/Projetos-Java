package projeto_jw_central;

public class ParesDeNomes_Carrinhos {
  public static void main(String[] args) {
    String[] nomesIrmaos = {
      "Bruno",
      "Christian",
      "Eder",
      "Edilson",
      "Juninho",
      "Genova",
      "Marinho",
      "Paulo",
      "Rinaldo",
      "Valdecir",
      "Junior",
    };

    for (int indice = 0; indice < nomesIrmaos.length; indice++) {
      for (int parceiro = indice + 1; parceiro < nomesIrmaos.length; parceiro++) {
        System.out.println(nomesIrmaos[indice] + " e " + nomesIrmaos[parceiro]);
      }
    }
  }
}
