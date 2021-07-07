package singleton;


/*
 * Thread-safety�� Serialization�� �����
 */
public enum SingletonEnum {

	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}
	
}
