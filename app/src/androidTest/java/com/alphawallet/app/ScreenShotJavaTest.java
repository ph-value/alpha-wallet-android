package com.alphawallet.app;

import static androidx.test.core.app.DeviceCapture.takeScreenshot;
import static androidx.test.core.graphics.BitmapStorage.writeToTestStorage;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.alphawallet.app.ui.HomeActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(AndroidJUnit4.class)
public class ScreenShotJavaTest {
    // a handy JUnit rule that stores the method name
    @Rule
    public TestName nameRule = new TestName();

    @Rule
    public ActivityScenarioRule<HomeActivity> activityScenarioRule =
            new ActivityScenarioRule<>(HomeActivity.class);

    /**
     * Captures and saves an image of the entire device screen to storage.
     */
    @Test
    public void saveDeviceScreenBitmap() throws IOException {
        writeToTestStorage(takeScreenshot(), getClass().getSimpleName() + "_" + nameRule.getMethodName());
    }
}

