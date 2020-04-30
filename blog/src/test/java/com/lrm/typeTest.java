package com.lrm;

import com.lrm.dao.TypeRepository;
import com.lrm.po.Type;
import com.lrm.service.BlogService;
import com.lrm.service.TypeService;

import com.lrm.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class typeTest {
    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    @Test
    public void findAll(){
        PageRequest request = PageRequest.of(0,3);
        PageRequest request1 = PageRequest.of(0,5);
        System.out.println("111111111---------------------------------");
        System.out.print(typeService.listType(request1).getContent());
        System.out.print(blogService.listBlog(request1,null).getContent());
    }

    @Test
    public void findById(){
        Type type = typeService.getType((long)1);
        System.out.print(type);
    }


}
