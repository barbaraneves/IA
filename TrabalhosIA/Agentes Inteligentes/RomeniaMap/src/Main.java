import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        ArrayList<State> states = new ArrayList<>();

        State a = new State("Arad"); //ok
        State z = new State("Zerind"); //ok
        State o = new State("Oradea"); //ok
        State t = new State("Timisoara"); //ok
        State l = new State("Lugoj"); //ok
        State m = new State("Mehadia"); //ok
        State d = new State("Drobeta"); //ok
        State c = new State("Craiova"); //ok
        State p = new State("Pitesti"); //ok
        State r = new State("Rimnicu Vilcea");
        State s = new State("Sibiu"); //ok
        State f = new State("Fagaras"); //ok
        State b = new State("Bucharest"); //ok
        State g = new State("Giurgiu"); //ok
        State u = new State("Urziceni"); //ok
        State v = new State("Vaslui"); //ok
        State i = new State("Iasi"); //ok
        State n = new State("Neamt"); //ok
        State h = new State("Hirsova"); //ok
        State e = new State("Eforie"); //ok


        Model model = new Model();

        model.addToListAdj(t, a, 118);
        model.addToListAdj(t, l, 111);
        model.addToListAdj(a, t, 118);
        model.addToListAdj(a, z, 75);
        model.addToListAdj(a, s, 140);
        model.addToListAdj(l, t, 111);
        model.addToListAdj(l, m, 70);
        model.addToListAdj(z, o, 71);
        model.addToListAdj(z, a, 75);
        model.addToListAdj(s, o, 151);
        model.addToListAdj(s, a, 140);
        model.addToListAdj(s, r, 80);
        model.addToListAdj(s, f, 99);
        model.addToListAdj(m, l, 70);
        model.addToListAdj(m, d, 75);
        model.addToListAdj(o, z, 71);
        model.addToListAdj(o, s, 151);
        model.addToListAdj(d, m, 75);
        model.addToListAdj(d, c, 120);
        model.addToListAdj(c, d, 120);
        model.addToListAdj(c, r, 146);
        model.addToListAdj(c, p, 138);
        model.addToListAdj(p, c, 138);
        model.addToListAdj(p, r, 97);
        model.addToListAdj(p, b, 101);
        model.addToListAdj(r, s, 80);
        model.addToListAdj(r, p, 97);
        model.addToListAdj(r, c, 146);
        model.addToListAdj(f, s, 99);
        model.addToListAdj(f, b, 211);
        model.addToListAdj(b, p, 101);
        model.addToListAdj(b, f, 211);
        model.addToListAdj(b, g, 90);
        model.addToListAdj(b, u, 85);
        model.addToListAdj(g, b, 90);
        model.addToListAdj(u, b, 85);
        model.addToListAdj(u, v, 142);
        model.addToListAdj(u, h, 98);
        model.addToListAdj(v, i, 92);
        model.addToListAdj(v, u, 142);
        model.addToListAdj(i, n, 87);
        model.addToListAdj(i, v, 92);
        model.addToListAdj(h, e, 86);
        model.addToListAdj(h, u, 98);
        model.addToListAdj(e, h, 86);
        model.addToListAdj(n, i, 87);


        int escolha;

        System.out.println("1 - Ver todas as cidades, destinos e suas respectivas distâncias.\n2 - Verificar cidades próximas a uma cidade escolhida e suas respectivas distâncias.");
        escolha = scanner.nextInt();
        scanner.nextLine();

        if(escolha == 1){
            System.out.println(model.printStates());
        }else{
            System.out.println("\nDigite o nome da cidade: \n(A primeira letra do nome da cidade deve ser maíuscula.)");
            String cidade = scanner.nextLine();
            System.out.println(model.getAdjFromCity(cidade));
        }















    }
}
