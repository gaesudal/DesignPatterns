package inter;

public interface Observer {
	
	public void update(float temperature, float humidity, float pressure);
	// 기상 정보가 변경되었을 때 옵저버한테 전달되는 상태 값들
}
