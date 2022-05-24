package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = myPackage.ParserLauncher.setString(var0);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.setToolTipText("hi!");
    var0.repaint(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.InputStreamReader var11 = myPackage.ParserLauncher.setReaderWithStartSearch(var0);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = myPackage.ParserLauncher.setString(var0);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Dimension var2 = var0.preferredSize();
    var0.setFocusTraversalKeysEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var12 = var0.getInputMap(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.Container var1 = var0.getTopLevelAncestor();
    java.awt.Component var4 = var0.locate(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    java.awt.Container var4 = var0.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.event.KeyListener[] var3 = var0.getKeyListeners();
    java.awt.Insets var4 = var0.insets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    boolean var1 = var0.isPaintingForPrint();
    var0.removeAll();
    java.awt.Component var5 = var0.findComponentAt(100, (-1));
    boolean var6 = var0.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    var0.setDebugGraphicsOptions(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    var0.removeNotify();
    var0.firePropertyChange("hi!", (short)0, (short)1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.VolatileImage var3 = var0.createVolatileImage(10, (-1));
    int var4 = var0.countComponents();
    boolean var5 = var0.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.VolatileImage var3 = var0.createVolatileImage(10, (-1));
    var0.repaint((-1), (-1), 100, (-1));
    int var9 = var0.getHeight();
    boolean var10 = var0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    boolean var1 = var0.isPaintingForPrint();
    boolean var4 = var0.contains(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var3 = var0.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isPaintingForPrint();
    var0.resetKeyboardActions();
    myPackage.Interfaccia var4 = new myPackage.Interfaccia();
    java.awt.Container var5 = var4.getTopLevelAncestor();
    java.awt.Container var6 = var4.getFocusCycleRootAncestor();
    var0.setComponentZOrder((java.awt.Component)var4, 0);
    var4.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    boolean var1 = var0.isPaintingForPrint();
    var0.removeAll();
    boolean var3 = var0.isValidateRoot();
    javax.swing.JPopupMenu var4 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    myPackage.Interfaccia var2 = new myPackage.Interfaccia();
    int var3 = var2.getY();
    boolean var4 = var2.isShowing();
    myPackage.Interfaccia var5 = new myPackage.Interfaccia();
    boolean var6 = var5.isPaintingForPrint();
    var5.removeAll();
    var5.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var12 = var2.add((java.awt.Component)var5);
    boolean var13 = var0.isFocusCycleRoot((java.awt.Container)var2);
    java.awt.Insets var14 = var2.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    java.awt.Dimension var6 = var0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.setVerifyInputWhenFocusTarget(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      myPackage.ParserLauncher.avvio(var0);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    var0.removeNotify();
    myPackage.Interfaccia var2 = new myPackage.Interfaccia();
    int var3 = var2.getY();
    boolean var4 = var2.isShowing();
    myPackage.Interfaccia var5 = new myPackage.Interfaccia();
    boolean var6 = var5.isPaintingForPrint();
    var5.removeAll();
    var5.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var12 = var2.add((java.awt.Component)var5);
    var5.show();
    java.awt.Component var14 = var0.add((java.awt.Component)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    java.awt.image.ColorModel var11 = var3.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isFocusCycleRoot();
    javax.accessibility.AccessibleContext var3 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isPaintingForPrint();
    var0.resetKeyboardActions();
    boolean var5 = var0.requestFocus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    boolean var3 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    myPackage.Interfaccia var2 = new myPackage.Interfaccia();
    int var3 = var2.getY();
    boolean var4 = var2.isShowing();
    myPackage.Interfaccia var5 = new myPackage.Interfaccia();
    boolean var6 = var5.isPaintingForPrint();
    var5.removeAll();
    var5.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var12 = var2.add((java.awt.Component)var5);
    boolean var13 = var0.isFocusCycleRoot((java.awt.Container)var2);
    boolean var14 = var2.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var2 = myPackage.ParserLauncher.getTagFromFile("hi!", 1);
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.setToolTipText("hi!");
    boolean var6 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    var0.removeNotify();
    boolean var2 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    boolean var1 = var0.isPaintingForPrint();
    var0.removeAll();
    java.awt.GraphicsConfiguration var3 = var0.getGraphicsConfiguration();
    java.awt.Font var4 = var0.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var3.areFocusTraversalKeysSet(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    boolean var1 = var0.isPaintingForPrint();
    var0.removeAll();
    var0.firePropertyChange("hi!", (byte)100, (byte)(-1));
    var0.setFocusTraversalKeysEnabled(true);
    javax.swing.plaf.PanelUI var9 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.disable();
    var0.firePropertyChange("", (byte)0, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.repaint((-1L), 100, 100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    javax.swing.InputMap var3 = var0.getInputMap();
    var0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.event.KeyListener[] var3 = var0.getKeyListeners();
    var0.setLocation(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    myPackage.Interfaccia var11 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    java.awt.Dimension var13 = var11.preferredSize();
    java.awt.Dimension var14 = var3.getSize(var13);
    var3.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    var3.show();
    java.awt.Rectangle var12 = var3.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.VolatileImage var3 = var0.createVolatileImage(10, (-1));
    var0.repaint((-1), (-1), 100, (-1));
    int var9 = var0.getHeight();
    boolean var10 = var0.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    java.awt.event.MouseListener[] var6 = var0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.disable();
    var0.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    java.awt.Cursor var6 = var0.getCursor();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    float var3 = var0.getAlignmentX();
    myPackage.Interfaccia var4 = new myPackage.Interfaccia();
    java.awt.Cursor var5 = var4.getCursor();
    var0.setCursor(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    var3.removeNotify();
    boolean var5 = var0.isFocusCycleRoot((java.awt.Container)var3);
    javax.swing.JToolTip var6 = var0.createToolTip();
    javax.swing.border.Border var7 = var0.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    java.awt.Point var3 = var0.getMousePosition();
    java.awt.Container var4 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    java.awt.Dimension var11 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    java.awt.im.InputMethodRequests var11 = var0.getInputMethodRequests();
    var0.setLocation(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isPaintingForPrint();
    var0.resetKeyboardActions();
    myPackage.Interfaccia var4 = new myPackage.Interfaccia();
    int var5 = var4.getY();
    boolean var6 = var4.isShowing();
    myPackage.Interfaccia var7 = new myPackage.Interfaccia();
    boolean var8 = var7.isPaintingForPrint();
    var7.removeAll();
    var7.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var14 = var4.add((java.awt.Component)var7);
    myPackage.Interfaccia var15 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var16 = var15.getColorModel();
    java.awt.Dimension var17 = var15.preferredSize();
    java.awt.Dimension var18 = var7.getSize(var17);
    var0.setMaximumSize(var17);
    var0.setBounds((-1), 10, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    int var1 = var0.getY();
    boolean var2 = var0.isShowing();
    myPackage.Interfaccia var3 = new myPackage.Interfaccia();
    boolean var4 = var3.isPaintingForPrint();
    var3.removeAll();
    var3.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var10 = var0.add((java.awt.Component)var3);
    var3.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Dimension var2 = var0.preferredSize();
    java.awt.event.KeyListener[] var3 = var0.getKeyListeners();
    int var4 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.VolatileImage var3 = var0.createVolatileImage(10, (-1));
    int var4 = var0.countComponents();
    var0.show(false);
    myPackage.Interfaccia var7 = new myPackage.Interfaccia();
    int var8 = var7.getY();
    boolean var9 = var7.isShowing();
    myPackage.Interfaccia var10 = new myPackage.Interfaccia();
    boolean var11 = var10.isPaintingForPrint();
    var10.removeAll();
    var10.firePropertyChange("hi!", (byte)100, (byte)(-1));
    java.awt.Component var17 = var7.add((java.awt.Component)var10);
    myPackage.Interfaccia var18 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var19 = var18.getColorModel();
    java.awt.Dimension var20 = var18.preferredSize();
    java.awt.Dimension var21 = var10.getSize(var20);
    boolean var22 = var0.isAncestorOf((java.awt.Component)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    int var3 = var0.getWidth();
    var0.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    myPackage.Interfaccia var0 = new myPackage.Interfaccia();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Dimension var2 = var0.preferredSize();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
