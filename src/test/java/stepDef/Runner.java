package stepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\YUVARAJ\\eclipse-workspace\\SeleniumProject\\Task\\src\\test\\resources\\Feature\\HomePage.feature",
glue ="stepDef",plugin ="html:target")

public class Runner {

}

