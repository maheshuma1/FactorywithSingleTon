import org.testng.annotations.Test;

public class Executor {
	
	@Test
	public void testGetRequirement() {
		SingleTonMain SM = SingleTonMain.getrunner();
	}
	
	@Test
	public void testFetchDetails() {
		SingleTonMain sm = SingleTonMain.getDetails();
	}
}