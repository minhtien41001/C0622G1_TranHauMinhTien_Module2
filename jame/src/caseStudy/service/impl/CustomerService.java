package caseStudy.service.impl;

import caseStudy.model.person.Customer;
import caseStudy.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList =new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAllCustomer() {
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        Customer customer = infoCustomer();
        customerList.add(customer);
        System.out.println("Thêm mới khách hàng thành công! ");
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập ID khách hàng cần chỉnh sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        Customer temp = null;
        Customer customer1 = null;
        for (Customer customer : customerList){
            if (customer.getId() == idEdit){
                temp = customer;
                
            }
        }
    }

    public static Customer infoCustomer(){
        System.out.println("Nhập ID khách hàng: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên khách hàng: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh khách hàng: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính khách hàng: ");
        String sex = scanner.nextLine();

        System.out.println("Nhập số CMND của khách hàng: ");
        int numberCMND = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số điện thoại của khách hàng: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập email của khách hàng: ");
        String email = scanner.nextLine();

        System.out.println("Chọn loại khách hàng: ");
        //        Diamond, Platinium, Gold, Silver, Member
        String typeOfGuest = null;
        System.out.println("1. Diamond \n" +
                "2. Platinium \n" +
                "3. Gold \n" +
                "4. Silver \n" +
                "5. Member \n");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:{
                typeOfGuest = "Diamond";
                break;
            }
            case 2:{
                typeOfGuest = "Platinium";
                break;
            }
            case 3:{
                typeOfGuest = "Gold";
                break;
            }
            case 4:{
                typeOfGuest = "Silver";
                break;
            }
            case 5:{
                typeOfGuest = "Member";
                break;
            }
        }

        System.out.println("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();

        return new Customer(id,name,dateOfBirth,sex,numberCMND,phoneNumber,email,typeOfGuest,address);
    }
}
