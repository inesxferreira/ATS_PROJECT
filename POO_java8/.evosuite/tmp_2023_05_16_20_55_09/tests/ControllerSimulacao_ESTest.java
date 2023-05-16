/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 20:24:22 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControllerSimulacao_ESTest extends ControllerSimulacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      Estado estado0 = new Estado();
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ControllerSimulacao.run((Estado) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ControllerSimulacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("4 [=i .(2IgN:3U]:");
      Estado estado0 = new Estado();
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemInUtil.addInputLine("3");
      LinkedList<Casa> linkedList0 = new LinkedList<Casa>();
      FornecEndesa fornecEndesa0 = new FornecEndesa(",x");
      Casa casa0 = new Casa("3", ",x", fornecEndesa0);
      linkedList0.add(casa0);
      LinkedList<Fornecedores> linkedList1 = new LinkedList<Fornecedores>();
      Estado estado0 = new Estado(linkedList0, linkedList1);
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemInUtil.addInputLine("3");
      Estado estado0 = new Estado();
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("2");
      LinkedList<Casa> linkedList0 = new LinkedList<Casa>();
      LinkedList<Fornecedores> linkedList1 = new LinkedList<Fornecedores>();
      Estado estado0 = new Estado(linkedList0, linkedList1);
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      Estado estado0 = new Estado();
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SystemInUtil.addInputLine("9 Ur (ISHg-U,:");
      Estado estado0 = new Estado();
      // Undeclared exception!
      try { 
        ControllerSimulacao.run(estado0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      Estado estado0 = new Estado();
      ControllerSimulacao.run(estado0);
      assertEquals("01/01/2018", estado0.getData());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ControllerSimulacao controllerSimulacao0 = new ControllerSimulacao();
  }
}
