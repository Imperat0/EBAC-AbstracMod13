public class Carro {
    public static void main(String[] args) {
        Civic civ = new Civic();
        civ.setNome("civic");
        civ.setCor("cinza");
        civ.setMarca("Honda");
        System.out.println(civ);

        Hrv hr = new Hrv();
        hr.setNome("HRV");
        hr.setCor("Vermelho");
        hr.setMarca("Honda");
        System.out.println(hr);
    }

    public static void imprimir(Honda honda) {
        honda.imprimirMarca();
    }

}
