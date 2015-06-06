package specs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by abdellah on 06/06/15.
 */
@RunWith(Cucumber.class)

@CucumberOptions(
        format={"pretty", "html:target/cucumber/html", "json:target/cucumber/json/cucumber.json"}
        //,tags = {"@tag"}  //what tags to include(@)/exclude(@~)
)
public class CucumberTestsRunner {

}
