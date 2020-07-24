package File;

public class ShowStaffInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Aye Aye", "yangon");
		Staff stf=new Staff(p1.name,p1.address,"JJ",100000.0);
		System.out.println("Staff Information:");
		System.out.println("Name:"+stf.name+"\nAddress:"+stf.address+"\nSchool:"+stf.school+"\nPay:"+stf.pay);
	}

}
