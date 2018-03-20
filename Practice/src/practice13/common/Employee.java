package practice13.common;

public class Employee extends Person{
	//フィールド
	//部署名
	private String departmentNm;
	//部署人数
	private int departmentCnt;


	//アクセサ
	//部署名を得る
	public String getDepartmentNm() {
		return this.departmentNm;
	}
	//部署名を設定する
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	//部署人数を得る
	public int getDepartmentCnt() {
		return this.departmentCnt;
	}
	//部署人数を設定する
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}

