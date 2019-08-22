import java.util.Scanner;




class p1{
    public static void main(String[] args) {
    Scanner sc = new Scanner();
    double a = sc.nextDouble();
    System.out.println("Enter the value of A: ");
    
    double b = sc.nextDouble();
    System.out.println("Enter the value of B: ");
    
    double c = sc.nextDouble();
    System.out.println("Enter the value of c: ");

    double d= (b*b)-(4.0*a*c);
    if(d=0){
        System.out.println("D = "+d);
        double z = -b/2.0*a;
        System.out.println("Z = "+z); 
    }
    else if (d<0) {
        double X = (-b+Math.sqrt(d))/(4.0*a*c);
        double y = (-b-Math.sqrt(d))/(4.0*a*c);
        System.out.println("X ="+x);
        System.out.println("X ="+y);
    } else {
        System.out.println("No Solution");
    }
        
    
}
}
