/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        //Create admin org
        AdminOrganization adminOrg = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrg);
        
        //Create employee Gayatri
        Employee emp1 = new Employee();
        emp1.setName("Additya");
        
        //Create user account
        UserAccount account1 = new UserAccount();
        account1.setUsername("admin");
        account1.setPassword("admin");
        account1.setRole("Admin");
        account1.setEmployee(emp1);
        
        //Add employee and account
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp1);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account1);
        
        //Create lab org
        LabOrganization labOrganization = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganization);
        
        //Create employee Ben
        Employee emp2 = new Employee ();
        emp2.setName("Ben");
        
        //Create user account
        UserAccount account2 = new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("Lab Assistant");
        account2.setEmployee(emp2);
        
        //Add employee and account
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp2);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account2);
        
        //Create lab org
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        
        //Create employee Jackie
        Employee emp3 = new Employee ();
        emp3.setName("Jackie");
        
        //Create user account
        UserAccount account3 = new UserAccount();
        account3.setUsername("doctor");
        account3.setPassword("doctor");
        account3.setRole("Doctor");
        account3.setEmployee(emp3);
        
        //Add employee and account
        adminOrg.getEmployeeDirectory().getEmployeeList().add(emp3);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(account3);
        
        return business;
    }
    
}

