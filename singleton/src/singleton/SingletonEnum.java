package singleton;


/*
 * Thread-safety와 Serialization이 보장됨
 */
public enum SingletonEnum {

	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
	
}
