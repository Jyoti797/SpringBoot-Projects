package __REST_PRODUCES_App.rest;


import __REST_PRODUCES_App.bindings.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductRestController {

    //return One JAVA object ==> json or xml element
//    @GetMapping(value = "/product", produces = {"application/xml", "application/json"})
//    public ResponseEntity<Product> getProduct(){
//        Product product = new Product(101, "Nothing Phone 2A", 23499);
//        return  new ResponseEntity<>(product, HttpStatus.OK);
//
//    }

    //return multiple JAVA objects

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {

        Product p1 = new Product(101, "Fastrack Watch", 1699);
        Product p2 = new Product(102, "Campus Shoe", 2299);
        Product p3 = new Product(103, "Nothing Phone 2A", 22999);
        Product p4 = new Product(104, "HP Laptop fQ1029", 41999);
        Product p5 = new Product(105, "Google Pixel 8A", 33999);
        Product p6 = new Product(106, "Milton Water Bottle", 749);
        Product p7 = new Product(107, "Calvin Calvin Bra", 499);
        Product p8 = new Product(108, "TVS Raider 125cc", 119999);
        Product p9 = new Product(109, "Amul Ice Cream", 129);
        Product p10 = new Product(110, "Kanha Dahibara", 60);
        Product p11 = new Product(111, "HP 128GB  Pendrive", 899);
        Product p12 = new Product(112, "Twirls Navy Blue Full Shirt", 1399);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);

        return new ResponseEntity<>(products, HttpStatus.OK);


    }


}

//return multiple java objects
