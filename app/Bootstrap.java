
import models.User;
import play.*;
import play.jobs.*;
import play.test.*;

@OnApplicationStart
public class Bootstrap extends Job {

	@Override
	public void doJob() throws Exception {
		// check if database is empty
		if (0 == User.count()) {
			Fixtures.load("initial-data.yml");
		}
	}
}
