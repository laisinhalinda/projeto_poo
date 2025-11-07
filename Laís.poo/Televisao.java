import java.util.ArrayList;

public class Televisao {
    private boolean ligada;
    private int volume;
    private int canalAtual;
    private ArrayList<Canal> canais;

    public Televisao() {
        ligada = false;
        volume = 10;
        canalAtual = 0;
        canais = new ArrayList<>();
    }

    public void adicionarCanal(Canal canal) {
        canais.add(canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada!");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void trocarCanal(int numero) {
        if (!ligada) {
            System.out.println("A TV está desligada!");
            return;
        }

        for (Canal c : canais) {
            if (c.getNumero() == numero) {
                canalAtual = numero;
                System.out.println("Canal trocado para: " + c);
                return;
            }
        }
        System.out.println("Canal não encontrado!");
    }

    public void mostrarInfo() {
        if (ligada) {
            System.out.println("TV ligada | Volume: " + volume + " | Canal atual: " + canalAtual);
        } else {
            System.out.println("TV desligada");
        }
    }
}

