package aula07;

/**
 *
 * @author igorm
 */
public class Lutador implements I_Luta{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nom, String nacio, int ida, float alt, float pes, int vit, int der, int em){
    
        this.setNome(nom);
        this.setNacionalidade(nacio);
        this.setIdade(ida);
        this.setAltura (alt);
        this.setPeso(pes);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(em);
    }
            
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacio) {
        this.nacionalidade = nacio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int ida) {
        this.idade = ida;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pes) {
        this.peso = pes;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
            }else if(this.getPeso() <=83.9){
                this.categoria = "Médio";
            }else if(this.getPeso() <= 120.2){
                this.categoria = "Pesado";
            }else{
                this.categoria = "Inválido";
            }
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    @Override
    public void apresentar() {
        System.out.println("---APRESENTAÇÃO---");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+ " anos");
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso()+ "kg");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());

    }

    @Override
    public void status() {
        System.out.println("----STATUS----");
        System.out.println(getNome());
        System.out.println("É peso: "+getCategoria());
        //if(this.getVitorias() != 1){
            System.out.println(getVitorias()+" Vitórias");
       // }else{
           // System.out.println(getVitorias()+" Vitória");
       // }
        //if(this.getDerrotas() != 1){
            System.out.println(getDerrotas()+" Derrotas");
        //}else{
            //System.out.println(getDerrotas()+" Derrota");
        //}
       // if(this.getEmpates() != 1){
            System.out.println(getEmpates()+" Empates");
        //}else{
           // System.out.println(getEmpates()+" Empate");
        //}
    }

    @Override
    public void ganherLuta() {
        this.setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates()+1);
    }
    
}
