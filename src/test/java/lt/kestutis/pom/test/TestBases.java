package lt.kestutis.pom.test;

import lt.kestutis.pom.pages.Common;
import lt.kestutis.pom.utils.TestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;


    @Listeners(TestListener.class)
    public class TestBases {

        @AfterTest
        public void teardown() {

            Common.closeDriver();
        }
    }

