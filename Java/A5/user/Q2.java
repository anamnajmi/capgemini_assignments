package assignment5.user;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import assignment5.main.News;

public class Assignment5Q2 {

	public static News maxComments(List<News> news) {
		return news.stream().max(Comparator.comparing(String::valueOf)).get();
		
	}
	public static int budgetCount(List<News> news) {
		news.stream();
		long count= Stream.of("Budget").count();
		return (int) count;
		
	}
	
	public static News maxCommentsByUser(List<News> news) {
		 return news.stream()
                .max(Comparator.comparing(News::getCommentByUser))
                .get();
	}
	
	public static Map<Object, List<News>> sortMaxCommentsByUser(List<News> news) {
		return news.stream().collect(Collectors.groupingBy(w -> w.getComment()));
		
	}
	

	public static void main(String[] args) {
		maxComments(News.newslist);
		budgetCount(News.newslist);
		maxCommentsByUser(News.newslist);
		sortMaxCommentsByUser(News.newslist);

	}

}