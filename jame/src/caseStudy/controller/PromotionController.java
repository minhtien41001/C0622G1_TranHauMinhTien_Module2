package caseStudy.controller;

import caseStudy.service.IPromotionService;
import caseStudy.service.impl.PromotionService;

import java.util.Scanner;

public class PromotionController {
   private IPromotionService iPromotionService = new PromotionService();
   private Scanner scanner = new Scanner(System.in);

   public void menuPromotion(){
       do {
           System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ KHUYẾN MÃI--- \n" +
                   "1. Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                   "2. Hiển thị danh sách khách hàng nhận được voucher \n" +
                   "3. Trở về menu chính \n" );
           System.out.println("Mời bạn nhập lựa chọn: ");

           int choose = Integer.parseInt(scanner.nextLine());
           switch (choose){
               case 1:{
                   iPromotionService.displayListCustomersUseService();
                   break;
               }
               case 2:{
                   iPromotionService.displayListCustomersGetVoucher();
                   break;
               }
               case 3:{
                   return;
               }
           }
       }while (true);
   }
}
