public class Usuario {
    public static void main(String[] args) {

        CarroNovo carro = new CarroNovo();

        carro.ligar();
        carro.ligarMidia();
        carro.ligarAr();
        carro.aumentarTempAr();
        carro.aumentarTempAr();
        carro.diminuirTempAr();
        carro.aumentarVolume();
        carro.aumentarVolume();
        carro.diminuirVolume();
        carro.startStop();
        carro.startStop();
        carro.startStop();

        System.out.println("Carro de apaixonado tem que ter um som");

    }
}
