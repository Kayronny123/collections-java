package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    // atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();

    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removeTarefas= new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if( t.getDescricao().equalsIgnoreCase(descricao)){
                removeTarefas.add(t);
            }
        
        }
        tarefaList.removeAll(removeTarefas);
    };

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    };
    
    public void obterDescricaoTarefas(){
     System.out.println(tarefaList);
    };

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");


        listaTarefa.removerTarefa("tarefa 1");

        listaTarefa.obterDescricaoTarefas();
        System.out.println("numero total é: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
