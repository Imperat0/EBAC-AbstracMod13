import java.util.ArrayList;
import java.util.List;

public abstract class Carro {

    private String nome;
    private String marca;

    public abstract String marcaDeCarro();


    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.setNome("Civic");
        Chevrolet chevrolet = new Chevrolet();
        chevrolet.setNome("Chevete");
        Toyota toyota = new Toyota();
        toyota.setNome("Etios");

        List<String> carro = new ArrayList<>();
        carro.add(toyota.getNome());
        carro.add(chevrolet.getNome());
        carro.add(honda.getNome());
        System.out.println(carro);
    }

}
