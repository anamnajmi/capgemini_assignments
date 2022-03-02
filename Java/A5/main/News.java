package assignment5.main;

import java.util.Arrays;
import java.util.List;

public class News {

	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	
	public News() {

	}

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public static final List<News> newslist = 
			Arrays.asList(
			new News(1, "Mark", "Joe", "This is news about Indian Budget"),
			new News(2, "Alex", "Robert", "This is news about American Budget"),
			new News(3, "Robert", "Joe", "This is news about Budget"),
			new News(4, "Joe", "Rocky", "This is news about Indian Politics"),
			new News(5, "Shubh", "Milli", "This is news about Bookstore"),
			new News(5, "Alex", "Joe", "This is news about AashrayArmy"));

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	
}