class P9{
          public static void main(String[] args){
	int space = -1, star = 6;
	for(int i=1; i<=5; i++){
	      star--;
	       space ++;
	      for(int j = 1;  j<=space; j++){
		System.out.print(" ");
	      }
	      for(int j=1; j<= star; j++){
		System.out.print("*");
	      }
	      System.out.println();
                    }
           }
}