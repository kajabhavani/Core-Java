package javalang1;

public class DemoonAutobox {
	static Integer I=0;
	public static void main(String[] args) {
        int m=I;
        System.out.println(m);
        Integer X=10;
        Integer Y=X;
        X++;
        System.out.println(X);
        System.out.println(Y);
        System.out.println(X == Y);

        Integer X1=130;
        Integer X2=130;
        System.out.println(X1==X2);
        
        
		
	}

}
