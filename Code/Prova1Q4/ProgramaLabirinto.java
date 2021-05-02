import java.util.Scanner;
public class ProgramaLabirinto {
    static char[][] labirintor = { 
    {'*','E','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}, 
    {'*','@','*','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','*'},
    {'*','@','*','*','*','*','*','@','@','@','*','@','@','@','*','*','*','*','*','*','*','*','@','*','*','*','*','@','*','@','*','@','*'},
    {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','@','@','@','*','@','@','@','@','@','*','@','@','@','@','*','@','*','@','*'},
    {'*','@','*','*','*','*','*','*','*','@','*','@','*','*','*','*','@','*','@','*','*','*','*','*','*','*','*','*','*','@','@','@','*'},
    {'*','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','@','@','*','@','@','*','@','@','@','@','*','*','*','@','*'},
    {'*','@','*','*','*','*','*','@','*','*','*','@','*','@','*','*','@','*','*','@','@','@','*','*','@','*','*','@','@','*','*','@','*'},
    {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','*','@','@','@','@','*','@','@','*','@','@','@','*'},
    {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','S','*','*','*','*','*','*'} 
    };

    //MÉTODO MAIN
    public static void main(String[]args){
        mostrarLabirinto(); //Exibe o labirinto 
        Passo rat1 = new Passo("Rato 1"); //Cria thread do rato, passa o nome e o mapa
        //Passo rat2 = new Passo("Rato 2", 1000);//2 rato
        //Passo rat3 = new Passo("Rato 3", 1000);//3 rato
        //baixo cima esq direita
        rat1.setInicio();
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(1);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
        rat1.step(3);
        rat1.printarLabirinto();
    }//Fim main

    //Printar labirinto original
    public static void mostrarLabirinto(){
        for (int i=0;i<9;i++){
            for(int j=0;j<33;j++){
                System.out.printf("%c",labirintor[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

    }//Fim printarLabirinto
}//Fm classe
