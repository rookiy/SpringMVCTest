package test.java.spittr.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import main.java.spittr.Spitter;
import org.junit.Test;

/**
 * Created by try on 2015/9/22.
 */
public class SpitterTest
{
    @Test
    public void shouldBeDifferent()
    {
        Spitter A = new Spitter("A", "12345", "a", "b");
        Spitter X = new Spitter("X", "12345", "x", "y");

        System.out.println(A + "\n" + X);

        assertNotEquals(A, X);
    }

}
