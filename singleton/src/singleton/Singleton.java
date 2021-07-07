package singleton;


/*
 * ���� �ν��Ͻ��� ��������� �ʾҴٸ� private���� ����� �����ڸ� �̿��ؼ� single ��ü�� ���� ����
 * uniqueInstance�� �� ��ü�� �����մϴ�. �̷��� �ϸ� �ν��Ͻ��� �ʿ��� ��Ȳ�� ��ġ�� ������ �ƿ� �ν��Ͻ��� �������� �ʰ� ����.
 * �̷� ����� "������ �ν��Ͻ� ����(lazy instantiation)" �̶�� �θ��ϴ�.
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
 * ����ȭ �ϸ� �ӵ� ������ ����
 * ����ȭ�� �ʿ��� ������ �޼ҵ尡 ���۵Ǵ� �� ���̱� �����̴�.
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
 * �ν��Ͻ��� �׻� ����Ѵٸ�, ó������ Singleton �ν��Ͻ��� ���� �������.
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
 * �ν��Ͻ��� �ִ��� Ȯ���ϰ�, ������ ����ȭ�� ������ ����.
 * �� ������� �ϸ� ó������ ����ȭ�� �˴ϴ�.
 * volatile Ű���带 ����ϸ� ��Ƽ�������� ������ uniqueInstance ������ Singleton �ν��Ͻ��� �ʱ�ȭ �Ǵ� ������ �ùٸ��� ����ǵ��� �� �� �ֽ��ϴ�.
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