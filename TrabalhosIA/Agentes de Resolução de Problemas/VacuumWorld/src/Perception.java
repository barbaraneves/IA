public class Perception {
	private boolean location;
	private boolean isDirty;
	
	public Perception(boolean location, boolean isDirty) {
		this.location = location;
		this.isDirty = isDirty;
	}

	public void getPerception(Environment environment){
		if(environment.isAgentLocation()){
			this.setLocation(true);
			if(environment.isDirtyA()){
				this.setDirty(false);
			}else{
				this.setDirty(true);
			}
		}else{
			this.setLocation(false);
			if(environment.isDirtyB()){
				this.setDirty(false);
			}else{
				this.setDirty(true);
			}
		}
	}

	public boolean isLocation() {
		return location;
	}

	public void setLocation(boolean location) {
		this.location = location;
	}

	public boolean isDirty() {
		return isDirty;
	}

	public void setDirty(boolean dirty) {
		isDirty = dirty;
	}
}
