package Ordenar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoas {

    
    private List<Pessoa> pessoaList;

    public OrdenarPessoas() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
     }

     public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;
     }

public static void main(String[] args) {
    OrdenarPessoas ordenarPessoas = new OrdenarPessoas();

    ordenarPessoas.adicionarPessoa("nome1", 17, 1.56);
     ordenarPessoas.adicionarPessoa("nome2", 19, 1.89);
          ordenarPessoas.adicionarPessoa("nome3", 18, 1.79);

        //   System.out.println(ordenarPessoas.ordenarPorIdade());
          System.out.println(ordenarPessoas.ordernarPorAltura());


}
    
}
