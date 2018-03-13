package practice14.common;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JavaCourse javacourse = new JavaCourse();

		System.out.println(javacourse.getCourseName());

		for(int i = 0;i<javacourse.getCourseUnit().length;i++) {
			System.out.println(javacourse.getCourseUnit()[i]);
		}



		DBCourse dbcourse = new DBCourse();

		System.out.println(dbcourse.getCourseName());

		for(int i = 0;i<dbcourse.getCourseUnit().length;i++) {
			System.out.println(dbcourse.getCourseUnit()[i]);
		}
	}

}
