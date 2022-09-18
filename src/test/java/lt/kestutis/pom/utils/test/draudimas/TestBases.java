package lt.kestutis.pom.utils.test.draudimas;

import lt.kestutis.pom.utils.pages.Common;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;


    @Listeners(TestListener.class)
    public class TestBases {

        @AfterTest
        public void teardown() {

            Common.closeDriver();
        }
    }

