package tryPost;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Board board = new Board();
		board.addPost("나이스", "굿");
		board.addPost("리얼", "리로라다가");
		board.addPost("진짜로", "그럼그럼");
		
		
		System.out.println("==========");

		List<Post> a = board.getAllPosts();
		for (Post post : a) {
			System.out.println(post.getId());
			System.out.println(post.getTitle());
			System.out.println(post.getContent());
		}

	}

}
