package com.lrm.service;


import com.lrm.dao.ReviewRepository;
import com.lrm.po.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> findReviewByBlogId(Integer blogid) {
        return reviewRepository.getPlanIdByUserId(blogid);
    }
}
