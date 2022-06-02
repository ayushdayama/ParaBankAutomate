package ParaBank.ParaBankAutomate;

import javax.swing.*;

public class paraBankGUI {
	public static void main(String[] args) throws Exception {
		listOfActions loa = new listOfActions();
		ImageIcon icon = new ImageIcon("./src/lib/icon.png");
		
		String[] optionsToChoose = {"Open New Account", "Accounts Overview", "Transfer Funds", "Bill Pay", "Find Transactions",
				"Update Contact Information", "Request Loan"};

        String getSelectedMenu = (String) JOptionPane.showInputDialog(
                null,
                "What action would you like to perform?",
                "Developed by Ayush",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                optionsToChoose,
                optionsToChoose[1]);

        try {
        	switch(getSelectedMenu) {
	        	case "Open New Account":
	        		loa.createAccount();
	        		break;
	        		
	        	case "Accounts Overview":
	        		loa.accountOverview();
	        		break;
	        		
	        	case "Transfer Funds":
	        		loa.transferFunds();
	        		break;
	        		
	        	case "Bill Pay":
	        		loa.billPay();
	        		break;
	        		
	        	case "Find Transactions":
	        		loa.findTransactions();
	        		break;
	        		
	        	case "Update Contact Information":
	        		loa.updateContactInfo();
	        		break;
	        		
	        	case "Request Loan":
	        		loa.requestLoan();
	        		break;
	        	
	        	default:
	        		break;
        	}
        }
    	catch(Exception e) {
    		return;
    	}
	}
}