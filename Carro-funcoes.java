public class CarroNovo {
    boolean ligado;
    boolean desligado ;
    boolean midia;
    boolean ar;
    boolean start = true;
    boolean stop = false;
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

    public void startStop(){
        stop = true;
        System.out.println("Start Stop ativado!");
    }
}
