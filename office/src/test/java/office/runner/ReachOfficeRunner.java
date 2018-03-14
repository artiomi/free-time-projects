package office.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import office.suite.ReachOfficeSuite;

public class ReachOfficeRunner {
	public static void main(String[] args) {
		Result unitRunner = JUnitCore.runClasses(ReachOfficeSuite.class);

		for (Failure failure : unitRunner.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(unitRunner.wasSuccessful());
	}
}
