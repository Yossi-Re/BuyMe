import org.openqa.selenium.By;

import java.util.List;

public class HomeScreen extends BasePage {
    /**
     * Function that includes all steps required in "Step B"
     */

    public void setSearchForGift(){

        pickPrice();
        pickRegion();
        pickCategory();
        pressFindMeGift();



    }
public void pickPrice(){

        clickElement(By.name("500-750 ש\"ח"));
}
public void pickRegion(){
        clickElement(By.name("ת\"א והסביבה"));
}

    public void pickCategory() {

        clickElement(By.name("גיפט קארד למסעדות שף"));

    }

    public void pressFindMeGift() {
        clickElement(By.xpath("//*[@id=\"ember1858\"]"));

    }
}