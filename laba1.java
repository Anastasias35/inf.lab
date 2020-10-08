public class laba1{
	public static double random_2_8(){
	        return -2 + (double)Math.random()*(8-(-2));
        }
	public static double f1(double w){
		w=Math.cbrt(Math.tan(w/(Math.cos(w)+0.75)));
		return w;
	}
	public static double f2(double w){
		w=Math.log(Math.pow(Math.cos(2/(Math.exp(Math.abs(w)))),2));
		return w;
	}
	public static double f3(double w){
		w=Math.exp(Math.atan(0.1 *Math.sin(w)));
		return w;
	}
	public static void main (String args[]){

		long d[];
		double x[];
		double y[][];
		int a=4,b=15,c=19;
		y=new double[b][c];
		x= new double[c];
		d= new long[b];
		for (int i=0;i<b;++i){
			d[i]=a;
			++a;
		}
		for (int i=0;i<c;i++ ){
			x[i]=random_2_8();
		}
		for (int i=0;i<b;i++){
			for (int j=0;j<c;j++){
				if ((d[i]==6)|(d[i]==10)|(d[i]==14)|(d[i]==15)|(d[i]==16)|(d[i]==17)|(d[i]==18)){
					y[i][j]=f1(x[j]);
				}else if (d[i]==9) {
					y[i][j]=f2(x[j]);
				}else {
					y[i][j]=f3(x[j]);
				}
				System.out.printf("%3.2f",y[i][j]);

			}
			System.out.print("\n");
		}

	}
}
