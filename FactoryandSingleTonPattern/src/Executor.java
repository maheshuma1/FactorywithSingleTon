import org.testng.annotations.Test;

public class Executor {
	
	@Test
	public void testFetchDetails() {
		SingleTonMain SM = SingleTonMain.getrunner();
	}
	
	@Test
	public void testGetRequirement() {
		SingleTonMain sm = SingleTonMain.getDetails();
	}
}