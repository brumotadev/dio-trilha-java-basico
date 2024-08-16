
// classe abstrata é quando a classe não sabe como alguma das coisas acontecem
public abstract class Veiculo {

    private String chassi;
    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // metodo abstrato porquen ão sei o que ele faz
    public abstract void ligar();
}
