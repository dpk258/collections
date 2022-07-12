package collections_all;

import java.util.Objects;

public class STUDENT {
     // if we write main method wecan not make constructor by shortcut
	//public static void main(String[] args) {
		
		String name ;
		int age ;
		int roll ;
		String course;
		// constructor created
		public STUDENT(String name, int age, int roll, String course) {
			super();
			this.name = name;
			this.age = age;
			this.roll = roll;
			this.course = course;
		}
		
		//setters and getters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}


		@Override // to print object
		public String toString() {
			return "STUDENT [name=" + name + ", age=" + age + ", roll=" + roll + ", course=" + course + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(age, course, name, roll);
		}


		//@Override // to not add equal object as hashset dont allow 
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			STUDENT other = (STUDENT) obj;
			return age == other.age && Objects.equals(course, other.course) && Objects.equals(name, other.name)
					&& roll == other.roll;
		}

		
		

	//}

}
