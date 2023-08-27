
public class CarroNovo {
    boolean ligado;
    boolean desligado;
    boolean midia;
    boolean ar;
    boolean start;
    boolean stop;
    int count = 0;
    int temperaturaAr = 20;
    int volume = 10;

    public void ligar() {
        ligado = true;
        System.out.println("Seu carro foi ligado!");
    }

    public void ligarMidia() {
        midia = true;
        System.out.println("Seu multimída foi ligado!");
    }

    public void ligarAr() {
        ar = true;
        System.out.println("Arcondicionado Ativado!");
    }

    public void aumentarTempAr() {
        temperaturaAr++;
        System.out.println("Temperatura atual: " + temperaturaAr);
    }

    public void diminuirTempAr() {
        temperaturaAr--;
        System.out.println("Temperatura atual: " + temperaturaAr);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void startStop() {
        count++;
        if (count > 1) {
            System.out.println("================================");
            System.out.println("Start stop desativado!         =");
            System.out.println("Veículo pronto para seguir!    =");
            System.out.println("================================");
            count = 0;
        } else {
            stop = true;
            System.out.println("================================");
            System.out.println("Start Stop ativado!            =");
            System.out.println("O veículo está parado!         =");
            System.out.println("================================");
        }
    }

}
