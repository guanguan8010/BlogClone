package com.lrm.web.admin;

import com.lrm.po.Blog;
import com.lrm.service.BlogService;
import com.lrm.util.OSSClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;
    @Autowired
    private OSSClientUtil ossClientUtil;

    @GetMapping("/findBlog")
    public Page<Blog> findBlog(@RequestParam(name = "page") Integer page,@RequestParam(name = "size") Integer size,
                               @RequestParam(name = "blogTitle") String title){
        System.out.println(title);
        PageRequest request = PageRequest.of(page,size,Sort.Direction.DESC,"id");
        System.out.println("111111111---------------------------------");
        System.out.print(blogService.listBlog(request,title).getContent());

        return blogService.listBlog(request,title);
    }

    @GetMapping("/findBlogById")
    public Blog findBlogById(@RequestParam(name = "blogid") Integer blogid){
        System.out.println(blogid);
        return blogService.getBlog((long)blogid);
    }

//    @PostMapping("/upload")
//    public String upload(MultipartFile[] files) throws Exception {
//        if(files != null){
//            System.out.println("----------------------1111111333");
//            for (MultipartFile file : files) {
//                System.out.println(file);
//            }
//
//            return "success";
//        }else{
//            return "fail";
//        }
//    }

    @PostMapping("/addBlog")
    public String addBlog(@RequestParam(name = "imageUrl")  String imageUrl,
                          @RequestParam(name = "title") String title,
                          @RequestParam(name = "content") String content){

        System.out.println(title);
        System.out.println("1-----=====");
        System.out.println(imageUrl);
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setFirstPicture(imageUrl);
        System.out.println(blogService.saveBlog(blog));

        return imageUrl;
    }
//    @PostMapping("/addBlogFormData")
//    public String addBlogFromData(
//                            @RequestParam(name = "imageFile")  MultipartFile imageFile,
//                            @RequestParam(name = "title") String title,
//                            @RequestParam(name = "content") String content
//                         ){
//
//        System.out.println(title);
//        System.out.println(imageFile);
//        System.out.println("1-----=====");
//        String url = blogService.saveBlogOss(imageFile,title,content);
//        System.out.println(url);
//
//        return null;
//    }

//    @GetMapping("/uploadTest")
//    public String uploadTest(@RequestParam(name="imageUrl") String imageUrl){
//        System.out.println(imageUrl);
//        return imageUrl;
//    }
}
