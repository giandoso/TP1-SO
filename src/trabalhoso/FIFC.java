/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2015.1.08.029
 */
public class FIFC {
    List<Processo> FIFC = new ArrayList<>();

    public FIFC() {
    }
    
    void insereProcesso(Processo p){
        FIFC.add(p);
        System.out.println("Inserido, id: "+p.id+" de tamanho: "+p.tempoExecucao);
    }
    
    void removeProcesso(){
        if(!FIFC.isEmpty()){
            Processo p = FIFC.remove(0);
            System.out.println("Removido, id: "+p.id+" de tamanho: "+p.tempoExecucao);
        }else{
            System.out.println("Fila vazia");
        }
    }
    
    int getSize() {
        return FIFC.size();
    }
    
    
    
}
