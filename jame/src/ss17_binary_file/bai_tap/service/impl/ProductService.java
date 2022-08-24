package ss17_binary_file.bai_tap.service.impl;

import ss17_binary_file.bai_tap.exception.DuplicateIDException;
import ss17_binary_file.bai_tap.model.Product;
import ss17_binary_file.bai_tap.service.IProductService;
import ss17_binary_file.bai_tap.utils.IOFileUtils;
import ss17_binary_file.bai_tap.utils.InputFileUtils;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "jame/src/ss17_binary_file/bai_tap/data/product.csv";
//     List<Product> productList = IOFileUtils.readDataFromFile(PATH);

    @Override
    public void addProduct() {
        List<Product> productList = IOFileUtils.readDataFromFile(PATH);
        int id = InputFileUtils.getInt("Nhập mã sản phẩm: ");
        Product product = infoProduct(id);
        productList.add(product);
        IOFileUtils.writeToFile(PATH,productList);
        System.out.println("Thêm mới sản phẩm thành công! ");

    }

    @Override
    public void displayAllProduct() {
        List<Product> productList = IOFileUtils.readDataFromFile(PATH);
        for (Product product : productList){
            System.out.println(product);
        }
        IOFileUtils.writeToFile(PATH,productList);
    }

    @Override
    public void seachProductById() {
        List<Product> productList = IOFileUtils.readDataFromFile(PATH);
        boolean check = false;
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm của sản phẩm cần tìm: ");
                int searchIdProduct = Integer.parseInt(scanner.nextLine());

                for (Product product : productList ){
                    if (searchIdProduct == product.getId()){
                        System.out.println(product);
                        check = true;
                        break;
                    }
                }
                if (!check){
                    System.out.println("Không tìm thấy sản phẩm này!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập mã sản phẩm là 1 số nguyên!");
            }
        }
    }
    private Product infoProduct(int id){
        String name = InputFileUtils.getString("Nhập vào tên sản phẩm:");
        String manufacturer = InputFileUtils.getString("Nhập vào tên hãng sản xuất:");
        double price = InputFileUtils.getDouble("Nhập vào đơn giá:");
        String moreInformation = InputFileUtils.getString("Nhập vào các mô tả về sản phẩm:");

        return new Product(id,name,manufacturer,price,moreInformation);
    }
}
