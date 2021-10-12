package mathObject;

public class Math {
	private static final double a = 0;
	public int sum(int n1,int n2) {
		int result;
	   result=n1+n2;
	   return result;
	   
	   
	   
	   
	   
	   
	   
	   
   }
	public int sub(int n1,int n2) {
		int result;
	   result=n1-n2;
	   return result;	
 }
      public int multiply(int n1,int n2) { 
		int result;
	   result=n1*n2;
	   return result;

	}
      public double divide(double n1,double n2) { 
  		double result;
  	   result=n1/n2;
  	   return result;


      }
 private double pi;
private double h;
 public Math() {
	    this.pi=3.14785;
	    
	 
 }
public double getPi() {
	 return pi;
	 
}

public double areaOfCircle(double r) {
	return this.getPi()*r*r;
	
	
}

public double areaOfCircle1(double r) {
	return this.getPi()*r*r*r*4.0/3.0;
	
}

public double volumeOfSphere(double r) {
	return this.getPi()*r*r*r*4/3;
	
	
}
public double areaOfRectangularPrism(double a,double b,double h) {
	return a*b*h;
}
public double areaOfRectangularPrism1(double a,double b) {
	return a*b/2;
	
}
public double areaOfRectangularPrism2(double a,double b,double c) {
 return a+b+c;
} 
 public int interiorAngleOfPolygon(int n ) {
	 return (n-2)/n*180;

}
public int factoriyel(int f) {
	int result=1;
	for(int i=1;i<=f;i++) {
          result=result*i;
          
	}
 return result;

   }
public int sumOfSmallNumbers(int a) {
	int result=0;
	for(int i=1;i<a;i++) {
		 result+=i;
		
	}
    return result;
	}
public int TheSumOfTheNumbersBetween(int a,int b) {
	int result=0;
	for(int i=a+1;i<b;i++) {
	       result+=i;
}
   return result;
}
}


