package cloud.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * SpringBoot整合Thymeleaf
 *
 * @author liupeng
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("message", "SpringBoot整合Thymeleaf");
        return "index";
    }

    /**
     * 上传单个文件
     *
     * @param file
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {

        try {
            //创建服务器文件路径
            File fileDir = new File(ResourceUtils.getURL("classpath:").getPath());
            if (!fileDir.exists()) {
                fileDir.mkdir();
            }

            //创建服务器文件名称
            String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String fileName = UUID.randomUUID().toString() + fileSuffix;
            File files = new File(fileDir + "/" + fileName);
            //上传文件
            file.transferTo(files);
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }

    /**
     * 上传多个文件
     *
     * @param file
     * @param request
     * @return
     */
    @ResponseBody
    @PostMapping("/upload/batch")
    public String uploadBatch(MultipartFile[] file, HttpServletRequest request) {

        try {
            //创建服务器文件路径
            File fileDir = new File(ResourceUtils.getURL("classpath:").getPath());
            if (!fileDir.exists()) {
                fileDir.mkdir();
            }

            //创建服务器文件名称
            for (int i = 0; i < file.length; i++) {
                String fileSuffix = file[i].getOriginalFilename().substring(file[i].getOriginalFilename().lastIndexOf("."));
                String fileName = UUID.randomUUID().toString() + fileSuffix;
                File files = new File(fileDir + "/" + fileName);
                //上传文件
                file[i].transferTo(files);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
        return "上传成功";
    }
}
