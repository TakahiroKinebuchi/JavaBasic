/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},//0列目
														{"5","10","35"},			//1列目
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee Employee1 = new Employee();
		Employee Employee2 = new Employee();
		Employee Employee3 = new Employee();

		Employee1.setUserNm(NAMEDATA[0]);
		Employee2.setUserNm(NAMEDATA[1]);
		Employee3.setUserNm(NAMEDATA[2]);

		Employee1.setMail(MAILDATA[0]);
		Employee2.setMail(MAILDATA[1]);
		Employee3.setMail(MAILDATA[2]);

		Employee1.setPassword(PASSDATA[0]);
		Employee2.setPassword(PASSDATA[1]);
		Employee3.setPassword(PASSDATA[2]);

		Employee1.setDepartmentNm(QUATERDATA[0][0]);
		Employee2.setDepartmentNm(QUATERDATA[0][1]);
		Employee3.setDepartmentNm(QUATERDATA[0][2]);

		Employee1.setDepartmentCnt(Integer.valueOf(QUATERDATA[1][0]));
		Employee2.setDepartmentCnt(Integer.valueOf(QUATERDATA[1][1]));
		Employee3.setDepartmentCnt(Integer.valueOf(QUATERDATA[1][2]));

	}
}
