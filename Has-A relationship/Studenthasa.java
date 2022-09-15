package Core;

public class Studenthasa {
     int id;
     String name;
     Addresshasa address;  // Aggregation
     
     public Studenthasa(int id, String name, Addresshasa address) {
    	 this.id=id;
    	 this.name=name;
    	 this.address=address;
     }
     void show() {
    	 System.out.println(id + ", " + name);
    	 System.out.println(address.city + ", " + address.area + ", " + address.country + ", " + address.state);
     }
     public static void main(String args[]) {
    	 Addresshasa add = new Addresshasa("Baruipur", "West Bengal", "India", "Kolkata");
    	 Studenthasa stu = new Studenthasa(195, "Java", add);
    	 stu.show();
     }
}
