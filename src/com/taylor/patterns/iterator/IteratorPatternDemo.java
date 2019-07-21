package com.taylor.patterns.iterator;

import java.util.StringTokenizer;

/**
 * @ClassName IteratorPatternDemo
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 9:27
 * @Version 1.0
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String  name = (String) iterator.next();
            System.out.println("name:"+name);
        }



    }
}
