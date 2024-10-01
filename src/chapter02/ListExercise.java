package chapter02;

import java.util.ArrayList;
import java.util.List;

/**
 * ListExercise
 */
public class ListExercise {
    /**
     * エントリーポイント
     * @param args
     */
    public static void main(String[] args) {
        // String型を格納できるListを用意
        List<String> names = new ArrayList<>();
        // String 型のデータを格納する
        names.add("太郎");
        names.add("次郎");
        names.add("SABUROU");
        // 拡張for文で1データずつ表示する
        for (String name : names) {
            System.out.println(name);
        }
    }
}
