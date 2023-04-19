public class Combo {
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo(){
        this.burguer = new Burguer();
        this.sobremesa = new Sobremesa();
        this.bebida = new Bebida();
    }
    public void CriarCombo(int tipo){
        switch(tipo) {
            case 1:
                burguer.setGramas(250);
                burguer.setDescricao("Shimeji");
                burguer.setPreco(25.00);
                sobremesa.setTamanho("Média");
                sobremesa.setDescricao("Taça de Sorvete");
                sobremesa.setPreco(20.00);
                bebida.setMl(500);
                bebida.setDescricao("Bebida Média");
                bebida.setPreco(10.00);
                break;
            case 2:
                burguer.setGramas(200);
                burguer.setDescricao("Frango");
                burguer.setPreco(20.00);
                sobremesa.setTamanho("Grande");
                sobremesa.setDescricao("Banana Split");
                sobremesa.setPreco(25.00);
                bebida.setMl(700);
                bebida.setDescricao("Bebida Grande");
                bebida.setPreco(15.00);
                break;
        }


    }
    @Override
    public String toString(){
        double ValorTotal = burguer.getPreco() + sobremesa.getPreco() + bebida.getPreco();
        return  "Burg: " + burguer.getDescricao() + "\r\n" +
                "Tamanho: " + burguer.getGramas() + " gramas" + "\r\n" +
                "Valor: " + burguer.getPreco() + "\r\n" +
                "Sobremesa: " + sobremesa.getTamanho() + "\r\n" +
                "Tamanho: " + sobremesa.getDescricao() + "\r\n" +
                "Valor: " + sobremesa.getPreco() + "\r\n" +
                "Bebida: " + bebida.getDescricao() + "\r\n" +
                "Tamanho: " + bebida.getMl() + "\r\n" +
                "Valor: " + bebida.getPreco() + "\r\n\r\n" +
                "Valor total do pedido: " + ValorTotal;

    }

}