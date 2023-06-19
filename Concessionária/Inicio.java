import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    

    public static void main(String[] args) {

        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.println("---- CONCESSIONÁRIA ----");
            System.out.println("---- Escolha um automovel ----");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("0 - Sair\n");
          
            

            int opcao = menu.nextInt();
            
            switch (opcao) {
                case 1:
                MainCarros mc = new MainCarros();
                mc.carros = new ArrayList<Carro>();
                mc.menu();
                break;

                case 2:
                MainMotos mm = new MainMotos();
                mm.motos = new ArrayList<Moto>();
                mm.menu();
                break;

                case 3:
                MainCaminhao ma = new MainCaminhao();
                ma.caminhoes = new ArrayList<Caminhao>();
                ma.menu();
                break;


            }
            
            }

            Tipos_concessionarias vetorC[] = new Tipos_concessionarias[3];
            int i = 0;
            for(Tipos_concessionarias nome: Tipos_concessionarias.values()){
                vetorC[i] = nome;
                i++;
            }

            System.out.println("Digite uma concessionaria: ");
            Scanner sc = new Scanner(System.in);
            String nome = sc.nexLine();

            Tipos_concessionarias nova;
            nova = Tipos_concessionarias.valueOf(nome.toUpperCase()); 
      
}

}

