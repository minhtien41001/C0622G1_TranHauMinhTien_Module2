package caseStudy.controller;

import caseStudy.service.ICustomerService;
import caseStudy.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private ICustomerService iCustomerService = new CustomerService();
    private Scanner scanner = new Scanner(System.in);

    public void menuCustomer(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ KHÁCH HÀNG--- \n" +
                    "1. Hiển thị danh sách khách hàng \n" +
                    "2. Thêm mới khách hàng \n" +
                    "3. Chỉnh sửa khách hàng \n" +
                    "4. Trở về menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    iCustomerService.displayAllCustomer();
                    break;
                }
                case 2:{
                    iCustomerService.addCustomer();
                    break;
                }
                case 3:{
                    iCustomerService.editCustomer();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }

}
