/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 20:33:52 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FornecJomar_ESTest extends FornecJomar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FornecJomar fornecJomar0 = new FornecJomar();
      Fornecedores fornecedores0 = fornecJomar0.clone();
      assertNotSame(fornecJomar0, fornecedores0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FornecJomar fornecJomar0 = new FornecJomar(2656.8486517);
      Fornecedores fornecedores0 = fornecJomar0.clone();
      assertEquals("01/01/2018", fornecedores0.getDataInicial());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FornecJomar fornecJomar0 = null;
      try {
        fornecJomar0 = new FornecJomar((FornecJomar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Fornecedores", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FornecJomar fornecJomar0 = new FornecJomar();
      FornecJomar fornecJomar1 = new FornecJomar(fornecJomar0);
      assertEquals(0.148, fornecJomar1.getValorBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FornecJomar fornecJomar0 = new FornecJomar((-1279.0508));
      Fornecedores fornecedores0 = fornecJomar0.clone();
      assertEquals(0.148, fornecedores0.getValorBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FornecJomar fornecJomar0 = new FornecJomar("");
      assertEquals("01/01/2018", fornecJomar0.getDataInicial());
  }
}
