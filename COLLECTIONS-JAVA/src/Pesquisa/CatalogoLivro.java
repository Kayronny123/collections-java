package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    
    // atributos

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    };

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
       
       List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    };
 
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorAno.add(l);
                }
            }
        }
        return livroPorAno;
    }



    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2018);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2019);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2022);

        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2018, 2022));

        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 2"));
    }
}
