package ch13;

// 모든 클래스의 최상위 클래스는 Object 클래스이다.
public class Book extends Object {

	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// 필요하다면 toString 메서드를 재정의할 수 있습니다.
	@Override
	public String toString() {

		return this.bookId + ", " + this.title + ", " + this.author;
	}
	// 아주 간혹 코딩 테스트에 나올 수 있다.
	// equals 메서드를 재정의해보자.
	// 실존하는 책1, 책 가정
	// 책이름과 저자가 같다면 논리적으로 같은 책이라 판별하는 기능

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			// 여기서 검사
			Book target = (Book) obj;
			if (this.title == target.title) {
				return true;
			}
		} else {

			return false;
		}
		return false;
	}

}
