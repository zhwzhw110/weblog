package com.server.controller;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/TV")
public class TvController {
    private  static  final Log log = LogFactory.getLog(TvController.class);

    @GetMapping(value = "/sayHello")
    public Map<String,Object> sayHello(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","zhw");
        map.put("age",25);
        map.put("date",new Date());
        return map;
    }

    /*@GetMapping(value = "/tvshows")
    public List<TvShows> getTvshows(){
        List<TvShows> list = new ArrayList<TvShows>();

        TvShows tvShows1 = new TvShows("westWorld",1,new Date());
        TvShows tvShows2 = new TvShows("helloworld",3,new Date());
        TvShows tvShows3 = new TvShows("mylove",10,new Date());

        list.add(tvShows1);
        list.add(tvShows2);
        list.add(tvShows3);
        return list;
    }*/

    /**
    *@author: zhanghHaiWen
    *@Desc: 文件上传接口
    *@params:  * @param id 文件上传必填参数
    *@Date: 2018/7/3 0003 下午 2:17
    */
    @PostMapping(value = "/photos/{id}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addPhoto(@PathVariable(value = "id") int id,@RequestParam(value = "photo") MultipartFile multipartfile) throws Exception{
        if(log.isTraceEnabled()){
            log.trace("文件上传");
        }
        //文件上传
        FileOutputStream fileOutputStream = new FileOutputStream("target/"+multipartfile.getOriginalFilename());//获取文件的原始名字
        IOUtils.copy(multipartfile.getInputStream(),fileOutputStream);
        fileOutputStream.close();
    }

    /**
    *@author: zhanghHaiWen
    *@Desc: 获取某张照片的信息 返回.jpg文件格式的文件
    *@params:  * @param null
    *@Date: 2018/7/3 0003 下午 2:55
    */
    @GetMapping(value = "/photo/get/{id}" ,produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto(@PathVariable(value = "id") int id) throws Exception{
        if(log.isTraceEnabled()){
            log.trace("获取文件");
        }
        String iconPath = "/filepath/filename";
        InputStream inputStream = new FileInputStream(iconPath);
        return IOUtils.toByteArray(inputStream);
    }

}
