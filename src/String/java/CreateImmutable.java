package String.java;

final class CreateImmutable {
	private int i;
	
	 CreateImmutable(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	 
	 public CreateImmutable M1(int i) {
		// TODO Auto-generated constructor stub
	    if(this.i==i) {
	    	return this;
	    }
	    else
	    	
	    	return(new CreateImmutable(i));
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateImmutable c=new CreateImmutable(10);
		CreateImmutable c1=c.M1(100);
		CreateImmutable c2=c.M1(10);
		System.out.println(c==c1);
		System.out.println(c1==c2);
		System.out.println(c==c2);

	}

}
