package javalang1;

/*public class Autowidening {
  public static void m1(int...x)
  {
	 System.out.println("var-arg methods");
 }
  public static void m1(Integer I)
  {
	 System.out.println("autoboxing");
 }
  public static void m1(long l)
  {
	 System.out.println("widening");
 }
  public static void main(String[] args) {
	  int x=10;
	  m1(x);
 }
}*/
class test
{
	public static void m1(Object o){
		System.out.println("object version");
	}
	public static void main(String[] args){
	
		int x=10;
		m1(x);
	}
}
