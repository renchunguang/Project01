package com.rcg;

import com.rcg.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author renchunguang
 * @create 2021-12-15 16:48
 *
 * IDEA中代码模板所处位置：setting - Editor - Live Templates / Postfix Completion
 */
public class Template {

    //模板六：prsf/psf/psfs
    private static final Customer CUSTOMER1 = null;
    public static final Customer CUSTOMER2 = null;
    public static final String STRING = "CHINA";
    //模板一：psvm/main
    public static void main(String[] args) {

        //模板二：sout/soutp：加形参/soutm：加方法名/soutv：加变量/xxx.sout
        System.out.println("hello");
        //模板三：fori：for循环/iter：增强for/itar：for循环带赋值
        for (int i = 0; i < 10; i++) {

        }
        //模板四：list.for:增强for遍历list/list.fori：普通for遍历list/list.forr：普通for倒序遍历list
        ArrayList list = new ArrayList();
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        //模板五：ifn：判断等于null/inn：判断不等于null/xxx.null判断xxx等于null/xxx.nn判断xxx不等于null
        if (list == null) {

        }
        if (list != null) {

        }


    }

}
