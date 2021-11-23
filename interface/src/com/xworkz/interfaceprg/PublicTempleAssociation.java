package com.xworkz.interfaceprg;

public class PublicTempleAssociation implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("Invoked slipper off");
		return false;
	}

	@Override
	public boolean dontTakePhoto() {
		System.out.println("Invoked dont take photo");
		return false;
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("Invoked maintain silence");
		return false;
	}
}
