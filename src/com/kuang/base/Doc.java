package com.kuang.base;

/**
 * @author venicid
 * @version 1.0
 * @since 1.8
 */
public class Doc {

    String name;

    /**
     * 测试方法
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception{
        return name;
    }
}


/*
命令行生产
javadoc -encoding UTF-8 -charset UTF-8 Doc.java

面向谷歌编程！
不会的话，先到浏览器搜索
* */