public abstract class Honda{

    private String marca;

    private String nome;

    public abstract String marcaDeCarro();

    public void imprimirMarca() {
        System.out.println("Honda");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}