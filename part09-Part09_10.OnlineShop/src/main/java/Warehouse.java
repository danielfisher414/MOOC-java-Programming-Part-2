
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsList;
    private Map<String, Integer> stockBalanceOfProductList;

    public Warehouse() {
        this.productsList = new HashMap<>();
        this.stockBalanceOfProductList = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsList.put(product, price);
        this.stockBalanceOfProductList.put(product, stock);
    }

    public int price(String product) {
        if (this.productsList.containsKey(product)) {
            return this.productsList.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {

        for (String key : this.stockBalanceOfProductList.keySet()) {
            if (key.contains(product)) {
                return this.stockBalanceOfProductList.get(key);

            }

        }
        return 0;
    }

    public boolean take(String product) {
        int number = 0;
        for (String value : this.stockBalanceOfProductList.keySet()) {
            if (value.contains(product)) {

                number = this.stockBalanceOfProductList.get(product);
                if (number == 0) {
                    return false;
                }
                number--;
                this.stockBalanceOfProductList.put(value, number);

                return true;
            }
        }

        return false;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();

        for (String value : this.productsList.keySet()) {

            products.add(value);
        }
        return products;
    }

}
