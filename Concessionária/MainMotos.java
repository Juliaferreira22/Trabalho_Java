import java.util.ArrayList;
import java.util.Scanner;

public class MainMotos {

    ArrayList<Moto> motos;
    Scanner sc = new Scanner(System.in);

    public void cadastrar(){

        Moto novaMoto = new Moto();

        System.out.println("Digite a placa da moto: ");
        novaMoto.setplaca(sc.nextLine());

        System.out.println("Digite a marca da moto: ");
        novaMoto.setmarca(sc.nextLine());

        System.out.println("Digite a modelo da moto: ");
        novaMoto.setmodelo(sc.nextLine());

        System.out.println("Digite a cor da moto: ");
        novaMoto.setcor(sc.nextLine());

        System.out.println("Digite o valor da moto: ");
        novaMoto.setvalor(sc.nextInt());
        
        motos.add(novaMoto);

        System.out.println("---MOTO CADASTRADA----");

}

public void listar(){
    for(int i=0; i < motos.size(); ++i) {
        System.out.println("" + i + ": ");
        motos.get(i).imprimirDados();
    }

    System.out.println("---LISTA MOTOS----");
}

public void atualiar(){
    System.out.println("Digite a posição que necessita de alteração:");
    int posicao = sc.nextInt();
    sc.nextLine();
    System.out.println("Digite os dados atualizados da moto:");

    System.out.println("Digite a placa da moto: ");
    motos.get(posicao).setplaca(sc.nextLine()); 

    System.out.println("Digite a marca da moto: ");
    motos.get(posicao).setmarca(sc.nextLine()); 

    System.out.println("Digite a modelo da moto: ");
    motos.get(posicao).setmodelo(sc.nextLine());

    System.out.println("Digite a cor da moto: ");
    motos.get(posicao).setcor(sc.nextLine()); 

    System.out.println("Digite o valor da moto: ");
    motos.get(posicao).setvalor(sc.nextInt());

        System.out.println("---MOTO ATUALIZADA----");
    
}

public void excluir(){
    System.out.println("Digite a posição que deseja apagar:");
    int posicao = sc.nextInt();
    motos.remove(posicao); 
}

public void menu(){

    while (true) {
    System.out.println("---- CONCESSIONÁRIA - MOTOS ----");
    System.out.println("1 - Cadastrar Moto");
    System.out.println("2 - Listar Moto");
    System.out.println("3 - Atualizar Moto");
    System.out.println("4 - Apagar Moto");

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
