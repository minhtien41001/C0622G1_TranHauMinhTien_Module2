package ss12_map_tree.bai_tap.exercise1.service.impl;

import ss12_map_tree.bai_tap.exercise1.model.Product;
import ss12_map_tree.bai_tap.exercise1.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công! ");
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập ID sản phẩm cần chỉnh sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        Product temp = null;
        Product product1 = null;
        for (Product product : productList){
            if (idEdit == product.getId()){
                temp = product;
                System.out.println("Nhập chỉnh sửa ID sản phẩm: ");
                int setId = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập chỉnh sửa tên của sản phẩm: ");
                String setName = scanner.nextLine();

                System.out.println("Nhập chỉnh sửa giá của sản phẩm: ");
                double setPrice = Double.parseDouble(scanner.nextLine());

                product1 = new Product(setId,setName,setPrice);
                break;
            }
        }
        if (temp != null){
            int index = productList.indexOf(temp);
            productList.set(index,product1);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập ID sản phẩm cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Product product : productList){
            if (product.getId() == idRemove ){
                System.out.println("Bạn có chắc muốn xóa sản phẩm này? \n" +
                        "1. CÓ \n" +
                        "2. KHÔNG");
                int choiceYesNo = Integer.parseInt(scanner.nextLine());
                if (choiceYesNo == 1){
                    productList.remove(product);
                    System.out.println("Xóa sản phẩm thành công! ");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("Không tìm thấy sản phẩm này! ");
        }
    }

    @Override
    public void displayAllProduct() {
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void findByName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String nameFind = scanner.nextLine();
        boolean isExits = false;

        for (Product product : productList){
            if (nameFind.equals(product.getName())){
                System.out.println(product);
                isExits = true;
            }
        }
        if (!isExits){
            System.out.println("Không tìm thấy sản phẩm này! ");
        }
    }

    @Override
    public void sort() {
        int choice;
        do {
            System.out.println("Sắp xếp sản phẩm theo thứ tự: \n" +
                    "1. Tăng dần \n" +
                    "2. Giảm dần");
            choice = Integer.parseInt(scanner.nextLine());

            if (choice != 1 && choice != 2){
                System.out.println("Lựa chọn không đúng,mời bạn nhập lại! ");
            }
        }while (choice != 1 && choice != 2);

        PriceComparatorAscending priceComparatorAscending = new PriceComparatorAscending();
        PriceComparisonDecrease priceComparisonDecrease = new PriceComparisonDecrease();

        if (choice == 1){
            productList.sort(priceComparatorAscending);
            System.out.println("Sắp xếp sản phẩm theo giá tăng dần: ");
        }else {
            productList.sort(priceComparisonDecrease);
            System.out.println("Sắp xếp sản phẩm theo giá giảm dần: ");
        }
        for (Product product : productList){
            System.out.println(product);
        }
    }

    public static Product infoProduct(){
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id,name,price);
    }
}
