class Phone{
	String stdCode;
	long phoneNumber;
	public Phone(String stdCode,long phoneNumber){
		this.stdCode=stdCode;
		this.phoneNumber=phoneNumber;}
		public void display(){
		System.out.println("Phone no. is:"+this.stdCode+"-"+this.phoneNumber);
    }

}