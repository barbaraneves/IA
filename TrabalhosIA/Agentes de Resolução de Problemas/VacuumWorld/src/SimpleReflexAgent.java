public class SimpleReflexAgent extends Agent{

    public Action aspiradorDePoReativoSimples (Perception perception){
        if(perception.isDirty()){
            Action action = new Action("Aspirar");
            return action;
        }
        else if(perception.isLocation()){
            Action action = new Action("Direita");
            return action;
        }
        else{
            Action action = new Action("Esquerda");
            return action;
        }

    }
}
