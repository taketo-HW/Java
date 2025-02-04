public class kadai1 {
    public static void main(String[] args) {
        // ### **変数を宣言してみよう**

        // 1. **文字列を格納する変数を宣言してください**
        //     - `String`型を使って、`"hoge"`を格納する変数を宣言してください。
        String str = "hoge";
        System.out.println("■1 " + str);

        // 2. **数値を格納する変数を宣言してください**
        //     - `int`型を使って、`69`を格納する変数を宣言してください。
        int num = 69;
        System.out.println("■2 " + num);

        // 3. **真偽値を格納する変数を宣言してください**
        //     - `boolean`型を使って、`false`を格納する変数を宣言してください。
        boolean boo = false;
        System.out.println("■3 " + boo);

        // 4. **未定義の状態で変数を宣言してください**
        //     - `double`型の変数を宣言し、値は後から代入してください。
        double a;
        a = 1.2;
        System.out.println("■4 " + a);

        // 5. **`null`を格納する変数を宣言してください**
        //     - `String`型を使って、`null`を格納する変数を宣言してください。
        String str2 = null;
        System.out.println("■5 " + str2);

        // 6. **配列を作成してみよう**
        //     - `String[]`型を使って、以下の名前が含まれる配列を作成してください： `"田中"`, `"佐藤"`, `"久保田"`, `"鈴木"`, `"河本"`
        String[] str3 = {"田中", "佐藤", "久保田", "鈴木", "河本"};
        System.out.println("■6");
        for (String s : str3) {
            System.out.println(s);
        }

        // --- 関数を作ってみよう ---

        // 1. **普通の関数を宣言してみよう**
        //     - 名前を`greet`として、`void`型の関数を作成してください。内容は空で構いません。
        System.out.println("■7");
        Runnable greet = () -> System.out.println("Hello!");
        greet.run();

        // 2. **引数付きの関数を作成してみよう**
        //     - 引数に名前（`String`型）を受け取り、その名前を出力する関数を作成してください。
        System.out.println("■8");
        java.util.function.Consumer<String> outputname = name -> System.out.println("name = " + name);
        outputname.accept("taketo");

        // 3. **数値を受け取り、計算をする関数を作りましょう**
        //     - 2つの整数を引数として受け取り、その和を返す関数を作成してください。
        System.out.println("■9");
        java.util.function.BiFunction<Integer, Integer, Integer> add = (num1, num2) -> num1 + num2;
        System.out.println("1+2=" + add.apply(1, 2));

        // 4. **文字列を結合する関数を作りましょう**
        //     - 2つの文字列を引数として受け取り、それらを結合して返す関数を作成してください。
        System.out.println("■10");
        java.util.function.BiFunction<String, String, String> join = (str1, str2_) -> str1 + str2_;
        System.out.println("結合：Hello + World = " + join.apply("Hello", "World"));

        // 5. **戻り値のない関数を作りましょう**
        //     - 引数に年齢（`int`型）を受け取り、「未成年」または「成人」と出力する関数を作成してください。
        System.out.println("■11");
        java.util.function.Consumer<Integer> noreturn = age_ -> {
            if (age_ < 20) {
                System.out.println("未成年");
            } else {
                System.out.println("成人");
            }
        };
        noreturn.accept(1);

        // --- 配列を使った操作をしてみよう ---

        // 1. **配列の要素を表示してみよう**
        //     - 配列`{10, 20, 30, 40, 50}`の要素を、`for`文を使って順に出力してください。
        System.out.println("■12");
        int[] nums = {10, 20, 30, 40, 50};
        for (int n : nums) {
            System.out.println("数：" + n);
        }

        // 2. **配列の合計を計算してみよう**
        //     - 配列`{1, 2, 3, 4, 5}`の全ての要素を足して、その合計を出力してください。
        System.out.println("■13");
        int[] nums2 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int n : nums2) {
            sum += n;
        }
        System.out.println("合計 = " + sum);

        // --- ループと条件分岐 ---

        // 1. **偶数を表示するプログラムを作りましょう**
        //     - 1から20までの数字の中で偶数のみを出力してください。
        System.out.println("■14");
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 2. **FizzBuzzプログラムを作りましょう**
        //     - 1から30までの数字について、以下の条件に従って出力してください：
        System.out.println("■15");
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {    // 15の倍数
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {           // 3の倍数
                System.out.println("Fizz");
            } else if (i % 5 == 0) {           // 5の倍数
                System.out.println("Buzz");
            }
        }
    }
}
