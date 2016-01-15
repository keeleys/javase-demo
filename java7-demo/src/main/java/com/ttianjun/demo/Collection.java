package com.ttianjun.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @user keeley
 * @date 16/1/15
 */
public class Collection {

    // java7 之前
    Map<String, List<String>> map1 =  new HashMap<String, List<String>>();
    List<Integer> list1 = new ArrayList<Integer>();

    //java7之后 类型可以根据前面自动得到
    Map<String, List<String>> map2 =  new HashMap<>();
    List<Integer> list2 = new ArrayList<>();


}
