public class testPOO {
	public static void main(String[] args) {
		Person alberto=new Person("Alberto Trejo",22,"alberto.trejo@gmail.com","TEXL010101XY1","Domicilio conocido");
		
//		Person alberto=new Person();
//		alberto.name="Alberto Trejo";
//		alberto.age=22;
//		alberto.email="alberto.trejo@gmail.com";
//		alberto.rfc="TEXL010101XY1";
		
		Person hugo=new Person("Hugo Rojas",21);
		
//		System.out.println(	alberto.name+" "+
//							alberto.age+" "+
//							alberto.email+" "+
//							alberto.rfc+" "+
//							alberto.adress);
//		System.out.println(	hugo.name+" "+
//							hugo.age+" "+
//							hugo.email+" "+
//							hugo.rfc+" "+
//							hugo.adress);
		
		System.out.println(alberto.toString());
		System.out.println(hugo.toString());
		
		
	}//main
}//class testPOO
