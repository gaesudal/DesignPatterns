package inter;

public interface Subject {
	
	public void registerObserver (Observer o);
	public void removeObserver (Observer o);
	//옵저버 등록, 제거
	public void notifyObservers ();
	//주제 객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메소드
}
