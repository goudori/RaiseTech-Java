package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  /**
   * mainメソッド　→"Hello World!"を表示する
   * <p>
   * printHelloメソッド→"hello world!"を表示する
   *
   * @param args
   */
  public static void main(String[] args) {
    //TIP ハイライトされたテキストにキャレットがある状態で <shortcut actionId="ShowIntentionActions"/> を押すと
    // IntelliJ IDEA によるその修正案を確認できます。
    System.out.println("Hello World!");

    printHello();

  }

  public static void printHello() {
    System.out.println("hello world!");
  }
}
