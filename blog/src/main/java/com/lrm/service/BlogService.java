package com.lrm.service;

import com.lrm.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.multipart.MultipartFile;

public interface BlogService {
    Blog saveBlog (Blog blog);

    Blog getBlog(Long id);

    Page<Blog> listBlog(PageRequest request,String title);

    Page<Blog> findAllBlog(PageRequest request);

    Blog updateBlog(Blog blog);

    void deleteBlog(Long id);

//    String saveBlogOss(MultipartFile imageFile,String title,String content);




}
