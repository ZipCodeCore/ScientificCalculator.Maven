package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Inversion;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

  @Test
  public void changeSignTest()
  {
      Double expected = -12D;
      Double actual= Inversion.changeSign(12D);
      Assert.assertEquals(expected, actual);
  }
    @Test
    public void changeSignTest2()
    {
        Double expected = -129.6;
        Double actual= Inversion.changeSign(129.6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeSignTest3()
    {
        Double expected = 45D;
        Double actual= Inversion.changeSign(-45D);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inverseNumTest()
    {
        Double expected = 0.25;
        Double actual= Inversion.inverseNum(4D);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void inverseNumTest3()
    {
        Double expected = 4D;
        Double actual= Inversion.inverseNum(0.25);
        Assert.assertEquals(expected, actual);
    }

    /*@Test
    public void inverseNumTest2() {
        Double expected = 0.125;
        Double actual = Inversion.inverseNum(8D);
        Precision
        Assert.assertEquals(expected, actual);
    }*/


    @Test
    public void additionTest1(){
}

    @Test
    public void additionTestTHISISCLERLYAFUCKINGTEST() {
    }

    @Test
    public void HI() {
    }

    @Test
    public void KwameTest() {
    }

    @Test
    public void TESTTESTTESTFUCKINTEST() {
    }

}
