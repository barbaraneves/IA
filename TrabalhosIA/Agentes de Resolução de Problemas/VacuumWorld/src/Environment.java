public class Environment {
	private boolean isDirtyA;
	private boolean isDirtyB;
	private boolean agentLocation;
	
	public Environment(boolean isDirtyA, boolean isDirtyB, boolean agentLocation) {
		this.isDirtyA = isDirtyA;
		this.isDirtyB = isDirtyB;
		this.agentLocation = agentLocation;
	}

	public void updateEnvironment(Action a, Perception p, Environment e){
		if(a.getName().equals("Aspirar")){
			if(p.isLocation() == true) {
				e.isDirtyA = true;
			}
			else{
				e.isDirtyB = true;
			}
		}
		else if(a.getName().equals("Esquerda")){
			e.agentLocation = true;
		}
		else if(a.getName().equals("Direita")){
			e.agentLocation = false;
		}
	}

	public String showEnvironment(Environment e){
		String environment = "|----------|----------|\n";


		if(e.isAgentLocation() == true){
			String agentInformation = "|  Agent   |          |\n";
			environment += agentInformation;
		}else{
			String agentInformation = "|          |  Agent   |\n";
			environment += agentInformation;
		}

		if(e.isDirtyA() == true){
			String isDirtyA = "|  Clean   |";
			environment += isDirtyA;
		}else{
			String isDirtyA = "|  Dirty   |";
			environment += isDirtyA;
		}

		if(e.isDirtyB() == true){
			String isDirtyB = "  Clean   |\n";
			environment += isDirtyB;
		}else{
			String isDirtyB = "  Dirty   |\n";
			environment += isDirtyB;
		}

		environment += "|----------|----------|";

		return environment;
	}

	public boolean isDirtyA() {
		return isDirtyA;
	}

	public void setDirtyA(boolean dirtyA) {
		isDirtyA = dirtyA;
	}

	public boolean isDirtyB() {
		return isDirtyB;
	}

	public void setDirtyB(boolean dirtyB) {
		isDirtyB = dirtyB;
	}

	public boolean isAgentLocation() {
		return agentLocation;
	}

	public void setAgentLocation(boolean agentLocation) {
		this.agentLocation = agentLocation;
	}


}
