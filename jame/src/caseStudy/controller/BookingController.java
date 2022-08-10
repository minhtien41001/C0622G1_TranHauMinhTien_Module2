package caseStudy.controller;

import caseStudy.service.IBookingService;
import caseStudy.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private IBookingService iBookingService = new BookingService();
    private Scanner scanner = new Scanner(System.in);

    public void menuBooking(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ ĐẶT CHỖ--- \n" +
                    "1. Thêm mới đặt chỗ \n" +
                    "2. Hiển thị danh sách đặt chỗ \n" +
                    "3. Tạo hợp đồng mới \n" +
                    "4. Hiển thị danh sách hợp đồng \n" +
                    "5. Chỉnh sửa hợp đồng \n" +
                    "6. Trở về menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    iBookingService.addBooking();
                    break;
                }
                case 2:{
                    iBookingService.displayBooking();
                    break;
                }
                case 3:{
                    iBookingService.createContracts();
                    break;
                }
                case 4:{
                    iBookingService.displayListContracts();
                    break;
                }
                case 5:{
                    iBookingService.editConstracts();
                    break;
                }
                case 6:{
                    return;
                }
            }
        }while (true);
    }

}
