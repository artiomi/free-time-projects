package office.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import office.tests.BuildingTest;
import office.tests.FlatTest;
import office.tests.RoomTest;
import office.tests.WindowTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BuildingTest.class, FlatTest.class, RoomTest.class, WindowTest.class })
public class ReachOfficeSuite {

}
