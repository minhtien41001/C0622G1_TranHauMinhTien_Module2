package caseStudy.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        BookingController bookingController = new BookingController();
        CustomerController customerController = new CustomerController();
        EmployeeController employeeController = new EmployeeController();
        FacilityController facilityController = new FacilityController();
        PromotionController promotionController = new PromotionController();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("---Chương trình nghỉ dưỡng FURAMA--- \n" +
                    "Chọn chức năng để tiếp tục \n" +
                    "1. Quản lý nhân viên \n" +
                    "2. Quản lý khách hàng \n" +
                    "3. Quản lý cơ sở \n" +
                    "4. Quản lý đặt chỗ \n" +
                    "5. Quản lý khuyến mãi \n" +
                    "6. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    employeeController.menuEmployee();
                    break;
                }
                case 2:{
                    customerController.menuCustomer();
                    break;
                }
                case 3:{
                    facilityController.menuFacility();
                    break;
                }
                case 4:{
                    bookingController.menuBooking();
                    break;
                }
                case 5:{
                    promotionController.menuPromotion();
                    break;
                }
                case 6:{
                    System.exit(1);
                }
            }
        }while (true);
    }
}
