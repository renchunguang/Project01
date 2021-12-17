package com.rcg;

import java.util.HashMap;

/**
 * @author renchunguang
 * @create 2021-12-17 11:19
 */
public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("age","18");
        hashMap.put("school","Tsinghua");
        hashMap.put("major","computer");

        String age = hashMap.get("age");
        System.out.println("age = " + age);

        hashMap.remove("major");

        System.out.println(hashMap);
    }
}
