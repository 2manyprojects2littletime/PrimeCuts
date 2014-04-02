import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTests {
	
	public Project project;
	public final Object NULL_CUTLIST = null;
	
	@Before
	public void setup() {
		project = new Project();
	}
	
	@Test
	public void testThatProjectIsCreated() {
		assertNotNull(project);
	}
	
	@Test
	public void testThatNewProjectIsEmpty() {
		assertTrue(project.isEmpty());
	}
	
	@Test
	public void testThatProjectCanGenerateCutlist() {
		assertEquals(project.generateCutlist(), NULL_CUTLIST);
	}
}
