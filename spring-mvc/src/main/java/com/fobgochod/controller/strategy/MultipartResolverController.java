package com.fobgochod.controller.strategy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class MultipartResolverController {

    @RequestMapping("/fileupload*")
    public String test() {
        System.out.println("test");
        return "success";
    }

    @RequestMapping("/upload/file")
    public String upload(MultipartFile file, HttpServletRequest request, String desc) throws IOException {
        System.out.println(desc);
        if (file.isEmpty()) {
            return "error";
        }
        String path = request.getServletContext().getRealPath("/WEB-INF/file");
        String fileName = file.getOriginalFilename();
        File filePath = new File(path, fileName);
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdir();
        }
        file.transferTo(filePath);
        return "success";
    }

    @RequestMapping("/upload/files")
    public String filesUpload(@RequestParam("files") MultipartFile[] files) {
        String path = "E:/upload/";
        //判断file数组不能为空并且长度大于0
        if (files != null && files.length > 0) {
            //循环获取file数组中得文件
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                //保存文件
                saveFile(file, path);
            }
        }
        // 重定向
        return "success";
    }

    private boolean saveFile(MultipartFile file, String path) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                File filepath = new File(path);
                if (!filepath.exists()) {
                    filepath.mkdirs();
                }
                // 文件保存路径
                String savePath = path + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(savePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
