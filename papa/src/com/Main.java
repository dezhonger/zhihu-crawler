package com;

/**
 * Created by dezhonger on 16-2-15.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 定义即将访问的链接
        String url = "http://www.zhihu.com/explore/recommendations";
        // 访问链接并获取页面内容
        String content = Spider.SendGet(url);
        // 获取编辑推荐
        ArrayList<Zhihu> myZhihu = Spider.GetRecommendations(content);
        // 打印结果
        System.out.println(myZhihu);
        for (Zhihu zhihu : myZhihu) {
            FileReaderWriter.writeIntoFile(zhihu.writeString(),
                    "Down/1.txt", true);
        }

        //https://www.zhihu.com/question/27500017
        Zhihu myZhihuhu = new Zhihu("/question/27500017/");
        System.out.println(myZhihuhu);
        FileReaderWriter.writeIntoFile(myZhihuhu.writeString(), "Down/2.txt", true);
    }
}

