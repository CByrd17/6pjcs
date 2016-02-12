package chapter1.declareClassMembers.protectedAndDefaultMembers.somethingElse;

import chapter1.declareClassMembers.protectedAndDefaultMembers.certification.OtherClass;

class AccessClass extends OtherClass{

	public static void main(String[] args) {
		OtherClass o = new OtherClass();
		//Won't work, testIt has default access so it's not visible in this package
		//o.testIt();
	}

}
