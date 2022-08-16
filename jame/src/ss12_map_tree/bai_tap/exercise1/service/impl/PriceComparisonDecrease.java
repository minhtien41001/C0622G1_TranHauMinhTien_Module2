package ss12_map_tree.bai_tap.exercise1.service.impl;

import ss12_map_tree.bai_tap.exercise1.model.Product;

import java.util.Comparator;

public class PriceComparisonDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()){
            return -1;
        }else {
            return 1;
        }
    }
}
