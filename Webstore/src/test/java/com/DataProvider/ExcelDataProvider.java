package com.DataProvider;

public class ExcelDataProvider {
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"\\src\\test\\resources\\TestData.xlsx");
		
		// Register Data
		
		public String getFirstName() {
			return ExcelUtils.getCellData("Register",0,1);
			
		}

		public String getLastName() {
			return ExcelUtils.getCellData("Register",1,1);
			
		}
		
		public String getEmail() {
			return ExcelUtils.getCellData("Register",2,1);
			
		}

		public String getPassword() {
			return ExcelUtils.getCellData("Register",3,1);
			
		}
		
		public String getConfirmPassword() {
			return ExcelUtils.getCellData("Register",4,1);
			
		}
		
		// Billing Address
		
		public String getCity() {
			return ExcelUtils.getCellData("BillingAddress",6,1);
			
		}

		public String getAddress1() {
			return ExcelUtils.getCellData("BillingAddress",7,1);
			
		}
		
		public String getZipcode() {
			return ExcelUtils.getCellData("BillingAddress",9,1);
			
		}

		public String getPhoneNo() {
			return ExcelUtils.getCellData("BillingAddress",10,1);
			
		}
		
		// CardDetails
		
		public String getCardHolderName() {
			return ExcelUtils.getCellData("CardDetails",1,1);
			
		}

		public String getCardNo() {
			return ExcelUtils.getCellData("CardDetails",2,1);
			
		}
		
		public String getCardcode() {
			return ExcelUtils.getCellData("CardDetails",5,1);
			
		}

		
		
		
		
		
		
}
