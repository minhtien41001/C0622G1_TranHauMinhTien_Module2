package ss12_map_tree.bai_tap.exercise1.controller;

import ss12_map_tree.bai_tap.exercise1.service.IProductService;
import ss12_map_tree.bai_tap.exercise1.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void menuProduct(){
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------------------------------------------");
            System.out.println("---Chương trình quản lý sản phẩm--- \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo ID \n" +
                    "3. Xóa sản phẩm theo ID \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên \n" +
                    "6. Sắp xếp tăng dần,giảm dần theo giá \n" +
                    "7. Thoát");
            System.out.println("Nhập lựa chọn để tiếp tục: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iProductService.addProduct();
                    break;
                }
                case 2:{
                    iProductService.editProduct();
                    break;
                }
                case 3:{
                    iProductService.removeProduct();
                    break;
                }
                case 4:{
                    iProductService.displayAllProduct();
                    break;
                }
                case 5:{
                    iProductService.findByName();
                    break;
                }
                case 6:{
                    iProductService.sort();
                    break;
                }
                case 7:{
                    System.exit(1);
                }
            }
        }while (true);
    }
}
