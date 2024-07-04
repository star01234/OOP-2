import com.npru.se65.id65001.HumanBeing;

public class TestDive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(175);
		hb.setWeight(69);
		hb.calculateBMi();
		System.out.println("BMI : "+hb.getBmi());
		System.out.println(hb.analyzeBmi());
	}

}
