package com.akn.MovieChallengeYassir;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;


public class DetailsMovie extends Base {
	
	@Test
	public void mainToDetailsmovie() {
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"image poster\"])[1]")).click();
		
		String titleMovie = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
		Assert.assertEquals(titleMovie, "Elemental");
	}
}
