package cn.itrip.test;

import cn.itrip.pojo.ItripHotel;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testFreeMarker {
    public static void main(String[] args) throws Exception {
        List<ItripHotel> list=new ArrayList<ItripHotel>();
        for (int i=1;i<=10;i++){
            ItripHotel hotel=new ItripHotel();
            hotel.setHotelName(i+"酒店名字");
            list.add(hotel);
        }

        Map map=new HashMap();
        map.put("a",list);


        Configuration configuration=new Configuration();
        configuration.setDefaultEncoding("utf-8");
        configuration.setDirectoryForTemplateLoading(new File("E:\\文件\\java课程\\346Maven\\itripbackend\\itripbeans\\src\\main\\resources"));
        Template template=configuration.getTemplate("demo.flt");
        template.process(map,new FileWriter("d:\\new a.txt"));
    }
}
