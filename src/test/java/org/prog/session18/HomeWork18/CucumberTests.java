package org.prog.session18.HomeWork18;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/HomeWork18",
        glue = "org.prog.session18.HomeWork18"
)
public class CucumberTests extends AbstractTestNGCucumberTests {

}
