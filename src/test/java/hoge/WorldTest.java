package hoge;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WorldTest {
	World sut;
	
	@Before
	public void setup(){
		sut = new World();
	}
	
	@Test
	public void ウォールローゼを奪還する() {
		WingOfFreedom wingOfFreedom = new WingOfFreedom();
		assertThat(wingOfFreedom,is(sut.wallRose()));
		sut.壁外();
	}

}
