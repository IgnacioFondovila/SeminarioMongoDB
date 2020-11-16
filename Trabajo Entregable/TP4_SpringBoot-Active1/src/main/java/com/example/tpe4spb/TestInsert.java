package com.example.tpe4spb;

import com.example.tpe4spb.repository.ProductRepository;
import com.example.tpe4spb.repository.PurchaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class TestInsert {
        @Bean
        CommandLineRunner initDatabase (@Qualifier("productRepository") ProductRepository repoProduct,
                                        @Qualifier("purchaseRepository") PurchaseRepository repoPurchase) {
            return args -> {
                /*Client c1 = repoClient.save(new Client((long) 1234, "Seba", "Perez"));
                Client c2 = repoClient.save(new Client((long) 2345, "Juan", "Dominguez"));
//                Para correr el server de nuevo sin recargar la bbdd habria que ponerles id a estos
                Product p1 = repoProduct.save(new Product("Galletas dulces", 50, 100));
                Product p2 = repoProduct.save(new Product("Biscochos", 60, 200));
                Product p3 = repoProduct.save(new Product("Marineras", 80, 300));
                Product p4 = repoProduct.save(new Product("Chocolatines", 30, 400));
                Product p5 = repoProduct.save(new Product("Caramelos", 10, 500));
                Product p6 = repoProduct.save(new Product("Bombones", 70, 600));
                Product p7 = repoProduct.save(new Product("Azúcar", 105, 700));
                repoPurchase.save(new Sale(5, p1, c1));
                repoPurchase.save(new Sale(10, p4, c2));
                repoPurchase.save(new Sale(14, p5, c2));
            */};
        }
}