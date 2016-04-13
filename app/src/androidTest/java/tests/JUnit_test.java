package tests;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.chenboy3.lab3checkoff.MainActivity;
import com.example.chenboy3.lab3checkoff.R;

/**
 * Created by chenboy3 on 4/13/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        assertEquals(mainActivity.add(3,5), 8);
        assertEquals(mainActivity.add(0,0), 0);
    }
}
