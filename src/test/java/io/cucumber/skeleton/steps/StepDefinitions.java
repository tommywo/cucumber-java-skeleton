package io.cucumber.skeleton;

import io.cucumber.java.en.Given;

import org.junit.Assert;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
        Assert.fail();
    }
}
