class MobileBillExecutor{
	
	public static void main(String[] java){
		
		MobileBill firstBill = new MobileBill();
		
		firstBill.billId=1;
		firstBill.billAmount=563.23;
		firstBill.isFinalBill=true;
		firstBill.isLatestBill=true;
		firstBill.billIssueDate="02-03-2026";
		firstBill.billDueDate="03-04-2026";
		firstBill.isBillOverDue=false;
		firstBill.billInvoiceNo="A123";
		
		System.out.println("The bill ID is "+firstBill.billId);
		System.out.println("The bill amount is "+firstBill.billAmount);
		System.out.println("The bill  is final "+firstBill.isFinalBill);
		System.out.println("The bill ID is "+firstBill.isLatestBill);
		System.out.println("The bill ID is "+firstBill.billIssueDate);
		System.out.println("The bill ID is "+firstBill.billDueDate);
		System.out.println("The bill ID is "+firstBill.isBillOverDue);
		System.out.println("The bill ID is "+firstBill.billInvoiceNo);
		
		
	}

}