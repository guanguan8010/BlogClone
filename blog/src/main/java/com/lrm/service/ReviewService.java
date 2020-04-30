package com.lrm.service;

import com.lrm.po.Review;

import java.util.List;

public interface ReviewService {

    Review saveReview(Review review);

    List<Review> findReviewByBlogId(Integer blogid);
}
