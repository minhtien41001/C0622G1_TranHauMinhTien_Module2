package ss17_binary_file.bai_tap.controller;

import ss17_binary_file.bai_tap.service.IProductService;
import ss17_binary_file.bai_tap.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private IProductService iProductService = new ProductService();
    private Scanner scanner = new Scanner(System.in);

    public void menuProduct(){
        do {
            System.out.println("---Chương trình quản lý sản phẩm--- \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị danh sách sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm theo ID \n" +
                    "4. Exit");
            System.out.println("Mời bạn nhập lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: {
                    iProductService.addProduct();
                    break;
                }
                case 2:{
                    iProductService.displayAllProduct();
                    break;
                }
                case 3:{
                    iProductService.seachProductById();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }
        }while (true);
    }
}
