package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    

    // atributo

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    };

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : carrinhoDeCompras) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
 

public void exibirItems(){
    System.out.println(carrinhoDeCompras);
}

public void removerItem(String nome, int quantidade) {
    for (Item item : carrinhoDeCompras) {
        if (item.getNome().equals(nome)) {
            int quantidadeAtual = item.getQuantidade();
            if (quantidadeAtual <= quantidade) {
                carrinhoDeCompras.remove(item); 
            } else {
                item.setQuantidade(quantidadeAtual - quantidade); 
            }
            break; 
        }
    }
}



public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("maca ", 5.4, 10);

    carrinhoDeCompras.removerItem("maca", 2); 

    carrinhoDeCompras.exibirItems();


    System.out.println("valor total e : " + carrinhoDeCompras.calcularValorTotal());

   
}





    
}
