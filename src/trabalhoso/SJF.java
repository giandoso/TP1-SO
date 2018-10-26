/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 2015.1.08.029
 */
public class SJF {

    List<Processo> SJF = new ArrayList<>();

    public SJF() {
    }

    void insereProcesso(Processo p) {
        SJF.add(p);
        System.out.println("Inserido, id: " + p.id + " de tamanho: " + p.tempoExecucao);
        Collections.sort(this.SJF);
    }
    
    void removeProcesso(){
        if(!SJF.isEmpty()){
            Processo p = SJF.remove(0);
            System.out.println("Removido, id: "+p.id+" de tamanho: "+p.tempoExecucao);
        }else{
            System.out.println("Fila vazia");
        }
    }
    
    int getSize() {
        return SJF.size();
    }

}
