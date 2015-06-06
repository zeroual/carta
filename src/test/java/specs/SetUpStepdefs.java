package specs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by abdellah on 06/06/15.
 */
public class SetUpStepdefs {


    private int res;

    @Given("^a user enter (\\d+) and (\\d+)$")
    public void a_user_enter_and(int a, int b) throws Throwable {
        res=a+b;
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(int c) throws Throwable {
        assertThat(res).isEqualTo(res);
    }
}
