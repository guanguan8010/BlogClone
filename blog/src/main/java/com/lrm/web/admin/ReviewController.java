package com.lrm.web.admin;

import com.lrm.po.Review;
import com.lrm.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @RequestMapping("/addReview")
    public Review addReview(@RequestBody Review review){
        return reviewService.saveReview(review);
    }

    @RequestMapping("/findReviewByBlogId")
    public List<Review> findReviewByBlogId(@RequestParam(name = "blogid") Integer blogid){
        return reviewService.findReviewByBlogId(blogid);
    }

}
