package rkee.boot.frame.db.mybatis;

import java.util.Date;

public class Website {
	 private int id;
	    private String name;
	    private String url;
	    private int age;
	    private String country;
	    private String address;
	    public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private Date createtime;
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Date getCreatetime() {
			return createtime;
		}
		public void setCreatetime(Date createtime) {
			this.createtime = createtime;
		}
		/*省略setter和getter方法*/
	    @Override
	    public String toString() {
	        return "id" + id + "name" + name + "url" + url + "age" + age + "country" + country + "createtime" + createtime;
	    }
}