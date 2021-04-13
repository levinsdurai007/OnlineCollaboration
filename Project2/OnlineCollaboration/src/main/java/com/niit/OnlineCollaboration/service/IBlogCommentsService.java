package com.niit.OnlineCollaboration.service;
import java.util.List;
import com.niit.OnlineCollaboration.model.BlogComments;

public interface IBlogCommentsService {
     List<BlogComments> getAllBlogComments();
    	 BlogComments getBlogCommentsById(int blogCommentId);
    	 boolean addBlogComments(BlogComments blogComments);
    	 boolean updateBlogComments(BlogComments blogComments);
    	 boolean deleteBlogComments(BlogComments blogComments);
}
