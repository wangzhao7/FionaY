package com.yuan.bianbian.yuanbianbian;

import com.alibaba.excel.EasyExcel;
import com.yuan.bianbian.yuanbianbian.Dao.DemoDAO;
import com.yuan.bianbian.yuanbianbian.data.Teacher;
import com.yuan.bianbian.yuanbianbian.listener.DemoDataListener;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public void teachTest()
    {
        //准备数据
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1,"hhh","hhh.jpg",1));
        teachers.add(new Teacher(1,"hhh","hhh.jpg",1));
        teachers.add(new Teacher(1,"hhh","hhh.jpg",1));
        teachers.add(new Teacher(1,"hhh","hhh.jpg",1));

        String fileName =  "teach.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, Teacher.class).sheet("模板").doWrite(teachers);
    }



    /**
     * 最简单的读
     */
    public void simpleRead()
    {
        String fileName = "teach.xlsx";

        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        /**
         * 参数1 要读取的文件
         * 参数2 要读取的数据对应的实体类类对象
         * 参数3 监听器对象 可以在创建的时候把dao当做参数传进去
         */
        EasyExcel.read(fileName, Teacher.class,new DemoDataListener()).sheet().doRead();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.simpleRead();
    }
}
