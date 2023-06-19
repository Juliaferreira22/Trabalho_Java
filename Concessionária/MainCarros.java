import java.util.ArrayList;
import java.util.Scanner;

public class MainCarros  {

    ArrayList<Carro> carros;
    Scanner sc = new Scanner(System.in);

    public void cadastrar(){

        Carro novoCarro = new Carro();

        System.out.println("Digite a placa do carro: ");
        novoCarro.setplaca(sc.nextLine());

        System.out.println("Digite a marca do carro: ");
        novoCarro.setmarca(sc.nextLine());

        System.out.println("Digite a modelo do carro: ");
        novoCarro.setmodelo(sc.nextLine());

        System.out.println("Digite a cor do carro: ");
        novoCarro.setcor(sc.nextLine());

        System.out.println("Digite o valor do carro: ");
        novoCarro.setvalor(sc.nextInt());
        
        carros.add(novoCarro);

        System.out.println("---CARRO CADASTRADO----");

}

public void listar(){
    for(int i=0; i < carros.size(); ++i) {
        System.out.println("" + i + ": ");
        carros.get(i).imprimirDados();
    }

    System.out.println("---LISTA CARROS----");
}


public void atualiar(){
    System.out.println("Digite a posição que necessita de alteração:");
    int posicao = sc.nextInt();
    sc.nextLine();
    System.out.println("Digite os dados atualizados do carro:");

    System.out.println("Digite a placa do carro: ");
    carros.get(posicao).setplaca(sc.nextLine()); 

    System.out.println("Digite a marca do carro: ");
    carros.get(posicao).setmarca(sc.nextLine()); 

    System.out.println("Digite a modelo do carro: ");
    carros.get(posicao).setmodelo(sc.nextLine());

    System.out.println("Digite a cor do carro: ");
    carros.get(posicao).setcor(sc.nextLine()); 

    System.out.println("Digite o valor do carro: ");
    carros.get(posicao).setvalor(sc.nextInt());

        System.out.println("---CARRO ATUALIZADO----");
    
}

public void excluir(){
    System.out.println("Digite a posição que deseja apagar:");
    int posicao = sc.nextInt();
    carros.remove(posicao); 
}

public void menu(){

    while (true) {
    System.out.println("---- CONCESSIONÁRIA - CARROS ----");
    System.out.println("1 - Cadastrar Carro");
    System.out.println("2 - Listar Carro");
    System.out.println("3 - Atualizar Carro");
    System.out.println("4 - Apagar Carro");

    int opcao = sc.nextInt();
    sc.nextLine(); 

    switch (opcao) {
        case 1:
        this.cadastrar();
        break;

        case 2:
        this.listar();
        break;

        case 3:
        this.atualiar(); 
        break;

        case 4:
        this.excluir();
        break;
        
    }
}

}

}






    

