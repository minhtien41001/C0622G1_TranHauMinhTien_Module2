package caseStudy.controller;

import caseStudy.service.IFacilityService;
import caseStudy.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private IFacilityService iFacilityService = new FacilityService();
    private Scanner scanner = new Scanner(System.in);

    public void menuFacility(){
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ CƠ SỞ--- \n" +
                    "1. Hiển thị danh sách cơ sở \n" +
                    "2. Thêm mới cơ sở \n" +
                    "3. Hiển thị danh sach bảo trì cơ sở \n" +
                    "4. Trở về menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    iFacilityService.displayAllFacility();
                    break;
                }
                case 2:{
                    iFacilityService.addFacility();
                    break;
                }
                case 3:{
                    iFacilityService.displayListMaintenance();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
