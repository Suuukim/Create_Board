package test;

//vo, dto 클래스
public class MyUser {
		private String name;
		private int age;
		private String address;

		public MyUser(String name, int age, String address) {
			super();
			this.name = name;
			this.age = age;
			this.address = address;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getAddress() {
			return address;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
} 
