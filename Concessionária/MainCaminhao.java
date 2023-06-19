import java.util.ArrayList;
import java.util.Scanner;

public class MainCaminhao {

    ArrayList<Caminhao> caminhoes;
    Scanner sc = new Scanner(System.in);

    public void cadastrar(){

        Caminhao novoCaminhao = new Caminhao();

        System.out.println("Digite a placa do caminhao: ");
        novoCaminhao.setplaca(sc.nextLine());

        System.out.println("Digite a marca do caminhao: ");
        novoCaminhao.setmarca(sc.nextLine());

        System.out.println("Digite a modelo do caminhao: ");
        novoCaminhao.setmodelo(sc.nextLine());

        System.out.println("Digite a cor do caminhao: ");
        novoCaminhao.setcor(sc.nextLine());

        System.out.println("Digite o valor do caminhao: ");
        novoCaminhao.setvalor(sc.nextInt());
        
        caminhoes.add(novoCaminhao);

        System.out.println("---CAMINHÃO CADASTRADO----");

}  

public void listar(){
    for(int i=0; i < caminhoes.size(); ++i) {
        System.out.println("" + i + ": ");
        caminhoes.get(i).imprimirDados();
    }

    System.out.println("---LISTA CAMINHÕES----");
}

public void atualiar(){
    System.out.println("Digite a posição que necessita de alteração:");
    int posicao = sc.nextInt();
    sc.nextLine();
    System.out.println("Digite os dados atualizados do caminhão:");

    System.out.println("Digite a placa do caminhão: ");
    caminhoes.get(posicao).setplaca(sc.nextLine()); 

    System.out.println("Digite a marca do caminhão: ");
    caminhoes.get(posicao).setmarca(sc.nextLine()); 

    System.out.println("Digite a modelo do caminhão: ");
    caminhoes.get(posicao).setmodelo(sc.nextLine());

    System.out.println("Digite a cor do caminhão: ");
    caminhoes.get(posicao).setcor(sc.nextLine()); 

    System.out.println("Digite o valor do caminhão: ");
    caminhoes.get(posicao).setvalor(sc.nextInt());

        System.out.println("---CAMINHÃO ATUALIZADO----");
    
}

public void excluir(){
    System.out.println("Digite a posição que deseja apagar:");
    int posicao = sc.nextInt();
    caminhoes.remove(posicao); 
}

public void menu(){

    while (true) {
    System.out.println("---- CONCESSIONÁRIA - CAMINHOES ----");
    System.out.println("1 - Cadastrar Caminhão");
    System.out.println("2 - Listar Caminhão");
    System.out.println("3 - Atualizar Caminhão");
    System.out.println("4 - Apagar Caminhão");

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
