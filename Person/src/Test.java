
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		Person saori=new Person();

		saori.name="吉田紗央里";
		saori.age=29;
		saori.address="埼玉県";
		saori.bathday="1988,09,15";
		saori.gender="female";
		saori.phoneNamber="090-1111-1111";

		System.out.println(saori.address);
		System.out.println(saori.bathday);
		System.out.println(saori.phoneNamber);


		taro.talk();
		taro.run();
		saori.walk();

		Robot aibo=new Robot();
		aibo.name="aibo";

		Robot asimo=new Robot();
		asimo.name="asimo";

		Robot pepper=new Robot();
		pepper.name="pepper";

		Robot doraemon=new Robot();
		doraemon.name="doraemon";

		doraemon.run();
		doraemon.talk();







	}

}
