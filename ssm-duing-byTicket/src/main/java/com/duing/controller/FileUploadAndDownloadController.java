package com.duing.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @Author 付雪缘
 * @Date 2023/4/17 10:33
 * @Version 1.0
 */
@Controller
public class FileUploadAndDownloadController{
    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(MultipartFile[] hello,HttpServletRequest request) throws IOException {
        String nameResult="";
        String name = null;
        for(MultipartFile hello1 : hello) {

//        获取的是file框中的name属性名
            String xxname = hello1.getName();
            System.out.println(xxname);
            //获取用户上传的文件名字
            name = hello1.getOriginalFilename();
            System.out.println(name);
            nameResult+=name;
//          这样获取的是项目部署到tomcat后的目录 这样存数据-项目从新编译-即在idea中重新启动tomcat时数据会消失
//            但是我们只用tomcat命令启动和关闭tomcat 文件不会消失
            String realPath = request.getServletContext().getRealPath("/");
            String classPath=Thread.currentThread().getContextClassLoader().getResource("/").getPath();
            System.out.println(realPath);
            System.out.println("classPath"+classPath);
            hello1.transferTo(new File(realPath+"/img/"  + name));
        }
        return nameResult+"上传成功";
    }
    @RequestMapping("/fileDownload")
    public ResponseEntity<Byte[]> fileDownload(String fileName, HttpServletRequest request) throws IOException {
        String realPath=request.getServletContext().getRealPath("/img/");
        File file=new File(realPath+fileName);
        System.out.println(fileName);
//        这是响应时的文件名处理
        fileName=new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
        System.out.println(fileName);
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment",fileName);
        byte[] b= FileUtils.readFileToByteArray(file);
        return  new ResponseEntity(b,headers, HttpStatus.CREATED);
    }
}
