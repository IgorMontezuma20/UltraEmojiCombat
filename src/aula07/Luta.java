package aula07;

import java.util.Random;

/**
 *
 * @author igorm
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //private String l1;
    //private String l2;

    public String getDesafiado() {
        return desafiado.toString();
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiado.toString();
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador  l1, Lutador l2){
        if(l1.getCategoria() .equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado =l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        
        if(this.aprovada){
                System.out.println("----DESAFIADO----");
            this.desafiado.apresentar();
                System.out.println("----DESAFIANTE----");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);
            System.out.println("======RESULTADO DA LUTA ======");
            
            switch(vencedor){
            
                case 0: //empate
            
                System.out.println("Empate");
                this.desafiado.empatarLuta();
                this.desafiado.empatarLuta();
                break;
            
                case 1: //Desafiado venceu
            
                System.out.println(this.desafiado.getNome()+ " venceu");
                this.desafiado.ganherLuta();
                this.desafiante.perderLuta();
                break;
            
                case 2: //Desafiante venceu
                
                System.out.println(this.desafiante.getNome()+" venceu");
                this.desafiante.ganherLuta();
               this.desafiado.perderLuta();
               break;
            
                default:
               break;
            }
            System.out.println("===============================");
        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }
}
