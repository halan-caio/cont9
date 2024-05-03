package com.sinerji.Comparison;

import com.sinerji.enums.C100;
import com.sinerji.enums.C190;
import com.sinerji.enums.D100;
import com.sinerji.enums.D190;

public class Difference {
	private String line;
	private int position;
	private String fromFileOne;
	private String fromFileTwo;
	private Enum<?> enumType;

	public Difference(String line, int position, String fromFileOne, String fromFileTwo) {
		this.line = line;
		this.position = position;
		this.fromFileOne = fromFileOne;
		this.fromFileTwo = fromFileTwo;
	}

	private Enum<?> getTypeEnum(String line) {
		switch (line) {
			case "C100":
				enumType = Enum.valueOf(C100.class, line);
				break;
			case "C190":
				enumType = Enum.valueOf(C190.class, line);
				break;
			case "D100":
				enumType = Enum.valueOf(D100.class, line);
				break;
			case "D190":
				enumType = Enum.valueOf(D190.class, line);
				break;

			default:
				break;
		}
		return enumType;
	}

	@Override
	public String toString() {
		Enum<?> enumType = getTypeEnum(line);
		String methodName = ""; // Coloque aqui o nome do método que deseja chamar

		// Faça um cast do tipo Enum<?> para o tipo específico do seu enum
		// e chame o método desejado
		if (enumType instanceof C100) {
			// Chame o método desejado
			methodName = C100.getNameColumnById(position); // Substitua "getSomeMethod()" pelo nome do método desejado
		} else if (enumType instanceof C190) {
			// Chame o método desejado
			methodName = C190.getNameColumnById(position); // Substitua "getSomeMethod()" pelo nome do método desejado
		} else if (enumType instanceof D100) {
			// Chame o método desejado
			methodName = D100.getNameColumnById(position); // Substitua "getSomeMethod()" pelo nome do método desejado
		} else if (enumType instanceof D190) {
			// Chame o método desejado
			methodName = D190.getNameColumnById(position); // Substitua "getSomeMethod()" pelo nome do método desejado
		}

		return "Difference found at line " + line + ", Column: " + position + " name: " + methodName +
				": '" + fromFileOne + "' vs '" + fromFileTwo + "'";
	}

}
