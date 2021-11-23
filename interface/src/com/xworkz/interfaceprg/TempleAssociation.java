package com.xworkz.interfaceprg;

public class TempleAssociation {

	private String name;
	private DevoteeRule devoteeRule;

	public TempleAssociation() {
		System.out.println("Invoked no-args constructor of Temple Association");
	}

	public TempleAssociation(String name, DevoteeRule devoteeRule) {
		super();
		this.name = name;
		this.devoteeRule = devoteeRule;
	}

	public void allowDevotees() {
		System.out.println("Invoked allow Devotees");
		if (devoteeRule != null) {
			System.out.println("Invoked devotee rule ".concat(name));
			System.out.println();
			System.out.println();
			boolean slipper = this.devoteeRule.slipperOff();
			if (slipper) {
				System.out.println("Slipper Ache bittidane");
				System.out.println();

			} else {
				System.err.println("Slipper ache bido le");
			}
			boolean photo = this.devoteeRule.dontTakePhoto();
			boolean silence = this.devoteeRule.maintainSilence();
			if (photo && silence) {
				System.out.println("Photo Tagitilla");
				System.out.println("Silence maintained");
			} else {
				System.err.println("Silence maintain mado");
				System.err.println("Photo Tagibedo");
			}

		} else {
			System.err.println("Ninu onda Devotee naa");
		}
	}
}
