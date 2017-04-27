package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ButtonTest.class, ButtonTest1.class, GameTest.class, HackerTest.class, /*LevelTest.class,*/
		TestLoseScreen.class, TestMenu.class, TestPauseScreen.class, TestPlayer.class })
public class AllTests {

}
