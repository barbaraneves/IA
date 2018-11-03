import java.util.ArrayList;

public class Model {
    private ArrayList<ArrayList<Action>> LA = new ArrayList<>();


    public void addToListAdj (State i, State f, int cost){
        for(int j = 0; j < LA.size(); j++){
            if(LA.get(j).get(0).getStateA().getEstado().equals(i.getEstado())){
                LA.get(j).add(new Action(i, f, cost));
                return;
            }
        }
        ArrayList<Action> newStates = new ArrayList<>();
        newStates.add(new Action(i, f, cost));
        LA.add(newStates);
    }

    public String printStates(){
        String mensagem  = "";
        for (ArrayList<Action> actions : LA) {
            for ( Action action : actions) {
                mensagem +=  action.getStateA().getEstado() + " " + action.getCost() + " " + action.getStateB().getEstado() + "\n";
            }
        }
        return mensagem;
    }

    public String getAdjFromCity (String city){
        String mensagem = "\nAs seguintes cidades são vizinhas a " + city + ":\n";
        for(int i = 0; i < LA.size() -1; i++){
            if(LA.get(i).get(0).getStateA().getEstado().equals(city)){

                for ( Action action : LA.get(i) ) {
                    mensagem += action.getStateB().getEstado() + " com o custo " + action.getCost() + ";\n";
                }
                return mensagem;
            }
        }
        return "Não foi possível encontrar a cidade. Verifique se o nome está correto e tente digitar novamente!";
    }

    public ArrayList<ArrayList<Action>> getLA() {
        return LA;
    }

    public void setLA(ArrayList<ArrayList<Action>> LA) {
        this.LA = LA;
    }
}
