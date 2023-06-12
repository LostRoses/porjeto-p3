package P3.code.controller;

public class Remedio extends Produto {
    private String info;

    public Remedio(String nome, int preco, String codigo, int estoque, String info) {
        super(nome, preco, codigo, estoque);
        this.info = info;
    }

    public String getInfo() {
        return "Caso os sintomas piorem, consulte um médico. \n" + info;
    }
}
