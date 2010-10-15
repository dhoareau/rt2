public class Action extends Entry  {
	
	private String resultType ;
	private Object result ;
	
	public Action(String actionName, String resultType) {
		super(actionName) ;
		this.resultType = resultType ;
	}
	public void launch() {
		this.printEntry() ;
		if (resultType.equals("String")) { 
			this.result = Util.readString() ;
		} else if (resultType.equals("int")) {
			this.result = new Integer(Util.readInt()) ;
		}

	}
	
	public Object getResult() { return this.result ;}
	
}