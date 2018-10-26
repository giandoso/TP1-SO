/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoso;

/**
 *
 * @author 2015.1.08.029
 */
public class Processo implements Comparable<Processo> {

    public int id;
    public int tempoExecucao;

    public Processo(int id, int tempoExecucao) {
        this.id = id;
        this.tempoExecucao = tempoExecucao;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }
   
    @Override
    public int compareTo(Processo o) {
        if (this.tempoExecucao > o.getTempoExecucao()) {
            return -1;
        }
        if (this.tempoExecucao < o.getTempoExecucao()) {
            return 1;
        }
        return 0;
    }
}