package com.lrm.dao;

import com.lrm.po.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Integer> {


    @Query(value = "SELECT * FROM t_review t WHERE t.blogid=?1",nativeQuery = true)
    List<Review> getPlanIdByUserId(Integer blogid);

}
