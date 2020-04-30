package com.lrm.service;

import com.lrm.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface TypeService {

    Type saveType (Type type);

    Type getType(Long id);

    Page<Type> listType(PageRequest request);

    Type updateType(Type type);

    void deleteType(Long id);

}
