package chapter1.declareClassMembers.nonaccessMemberModifiers.synchronizedMethods;

public class Record {

	public synchronized Record retrieveUserInfo(int id) {
		return this;
	}
}
