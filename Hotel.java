package miniproject;

public class Hotel
{
	private String customerName;
	private int customerContact,customerId,customerRoomNo;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerRoomNo() {
		return customerRoomNo;
	}

	public void setCustomerRoomNo(int customerRoomNo) {
		this.customerRoomNo = customerRoomNo;
	}



	Hotel(String customerName,int customerContact,int customerId,int customerRoomNo)
	{
		this.customerName=customerName;
		this.customerContact=customerContact;
		this.customerId=customerId;
		this.customerRoomNo=customerRoomNo;
		
	}

	@Override
	public String toString() {
		return "Hotel [customerName=" + customerName + ", customerContact=" + customerContact + ", customerId="
				+ customerId + ", customerRoomNo=" + customerRoomNo + "]";
	}
	
	

}
