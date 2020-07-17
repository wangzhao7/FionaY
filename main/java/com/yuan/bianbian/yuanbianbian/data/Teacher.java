package com.yuan.bianbian.yuanbianbian.data;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;

public class Teacher
{

    /**
     * 老师的主键
     */
    @ExcelIgnore
    private Integer teacherId;
    /**
     * 名字
     */
    @ExcelProperty("老师名字")
    private String teacherName;
    /**
     * 头像图片地址
     */
    @ExcelProperty("老师图片")
    private String teacherImage;
    /**
     * 老师的状态 0代表正常 1代表删除
     */
    @ExcelProperty("老师的状态")
    private Integer teacherStatus;

    public Teacher(Integer teacherId,String teacherName,String teacherImage,Integer teacherStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherImage = teacherImage;
        this.teacherStatus = teacherStatus;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(String teacherImage) {
        this.teacherImage = teacherImage;
    }

    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }
}
