import com.npru.se65.id65012.HumanBeing;

public class TestDrive {

	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(156);
		hb.setWeight(66);
		hb.calculateBMI();
		System.out.println("BMI : "+hb.getBmi());
		System.out.println(hb.analyzeBmi());
	}

}
