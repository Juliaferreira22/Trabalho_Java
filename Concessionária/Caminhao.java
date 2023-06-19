public class Caminhao implements Automovel {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int valor;

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getplaca() {
        return  this.placa;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return this.marca;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return this.cor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }

    public int getvalor() {
        return this.valor;
    }

    
   public void imprimirDados() {
        System.out.print(placa + ' ' + marca + ' ' + modelo + ' ' + cor + ' '+ valor);
        System.out.println();
    }



    public Caminhao(String placa, String marca, String modelo, String cor, int valor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor; 
        
    }

    public Caminhao(){

    }

    @Override
    public void cadastar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastar'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public void atualiar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualiar'");
    }

    @Override
    public void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    

   
    
}
