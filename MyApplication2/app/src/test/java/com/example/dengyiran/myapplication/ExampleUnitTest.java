package com.example.dengyiran.myapplication;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by dengyiran on 18/2/8.
 */

public class ExampleUnitTest {
    password_validator pv = new password_validator();
    @Test
    public void check1() throws Exception{
        assertEquals(0,pv.checklength("llwqeqeqewq"));
    }
    @Test
    public void check2() throws Exception{
        assertEquals(1,pv.checkequal("passwword"));
    }
    @Test
    public void check3() throws Exception{
        assertEquals(2,pv.checkdigits("231231233"));
    }
    @Test
    public void check4() throws Exception{
        assertEquals(3,pv.checklower("13123421ewqeq"));
    }
    @Test
    public void check5() throws Exception{
        assertEquals(4,pv.checkupper("12qweqeEQEW"));
    }
}
