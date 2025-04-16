package revisao;

import java.util.HashSet;
import java.util.Set;

public class TesteCarro {

	public static void main(String[] args) {
		Marca marca1 = new Marca("Ford");
		Marca marca2 = new Marca("Honda");
		Marca marca3 = new Marca("Honda");

		Modelo modelo1 = new Modelo("Fit", 2015, "12323", 52000., "XLS", marca2);

//		System.out.println(modelo1);
		Set<Marca> marcas = new HashSet<>();
		
		marcas.add(marca1);
		marcas.add(marca2);
		marcas.add(marca3);
		
		
//		

//		List<Marca> marcas = new ArrayList<>();
//		marcas.add(marca1);
//		marcas.add(marca2);
//		marcas.set(1, new Marca("Toyota"));
//		
//		List<Marca> marcas = Arrays.asList(marca1, marca2);
//		marcas.set(1, new Marca("Toyota"));

		for (Marca m : marcas) {
			System.out.println(m);
		}
//		
//		for (int i = 0; i < marcas.size(); i++) {
//			System.out.println(i+ "-"+ marcas.get(i));
//		}
//		
	}

}
