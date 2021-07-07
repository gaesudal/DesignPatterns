package singleton;


/*
 * 아직 인스턴스가 만들어지지 않았다면 private으로 선언된 생성자를 이용해서 single 객체를 만든 다음
 * uniqueInstance에 그 객체를 대입합니다. 이렇게 하면 인스턴스가 필요한 상황이 닥치기 전에는 아예 인스턴스를 생성하지 않게 되죠.
 * 이런 방법을 "게으른 인스턴스 생성(lazy instantiation)" 이라고 부릅니다.
 */
//public class Singleton {
//
//	private static Singleton  uniqueInstance;
//	
//	private Singleton() {
//		
//	}
//	public static Singleton getInstance() {
//		if(uniqueInstance == null) {
//			uniqueInstance = new Singleton();
//		}
//		
//		return uniqueInstance;
//	}
//}

/*
 * 동기화 하면 속도 문제가 생김
 * 동기화가 필요한 시점은 메소드가 시작되는 때 뿐이기 떄문이다.
 */

//public class Singleton{
//	
//	private static Singleton uniqueInstance;
//	
//	private Singleton() {
//	
//	}
//	
//	public static synchronized Singleton getInstance() {
//		if (uniqueInstance == null) {
//			uniqueInstance = new Singleton();
//		}
//		return uniqueInstance;
//	}
//}
/*
 * 인스턴스를 항상 사용한다면, 처음부터 Singleton 인스턴스를 만들어도 상관없다.
 */
//public class Singleton{
//	
//	private static Singleton uniqueInstance = new Singleton();
//	
//	private Singleton() {
//	
//	}
//	
//	public static synchronized Singleton getInstance() {
//		
//		return uniqueInstance;
//	}
//}

/*
 * 인스턴스가 있는지 확인하고, 없으면 동기화된 블럭으로 들어간다.
 * 이 방식으로 하면 처음에만 동기화가 됩니다.
 * volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가 Singleton 인스턴스로 초기화 되는 과정이 올바르게 진행되도록 할 수 있습니다.
 */

//public class Singleton{
//	
//	private volatile static Singleton uniqueInstance;
//	
//	private Singleton() {
//	
//	}
//	
//	public static synchronized Singleton getInstance() {
//		if(uniqueInstance == null) {
//			synchronized (Singleton.class) {
//				if(uniqueInstance == null) {
//					uniqueInstance = new Singleton();
//				}
//			}
//		}
//		
//		return uniqueInstance;
//	}
//}

public class Singleton{
	private Singleton() {
		
	}
	
	private static class HOLDER {
		private static final Singleton uniqueInstance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return HOLDER.uniqueInstance;
	}
}