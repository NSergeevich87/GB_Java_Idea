package ru.gb.Unit_tests_seminar_2.simple_shopping_cart;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class ShopTest {
    // Создаем набор продуктов для магазина:
    public static List<Product> getStoreItems() {
        List<Product> products = new ArrayList<>();

        // Три массива Названия, Цены, Кол-во
        String[] productNames = {"bacon", "beef", "ham", "salmon", "carrot", "potato", "onion", "apple", "melon", "rice", "eggs", "yogurt"};
        Double[] productPrice = {170.00d, 250.00d, 200.00d, 150.00d, 15.00d, 30.00d, 20.00d, 59.00d, 88.00d, 100.00d, 80.00d, 55.00d};
        Integer[] stock = {10, 10, 10, 10, 10, 10, 10, 70, 13, 30, 40, 60};

        // Последовательно наполняем список продуктами
        for (int i = 0; i < productNames.length; i++) {
            products.add(new Product(i + 1, productNames[i], productPrice[i], stock[i]));
        }

        // тоже самое
        // Product product = new Product(1,"bacon", 170.00d, 10);
        // products.add(product);
        return products;
    }

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

     private Shop shop;
     private Cart cart;
      @BeforeEach
      void setup() {
          shop = new Shop(getStoreItems());
          cart = new Cart(shop);
      }


/*
            ID | Название  | Цена, р. | Кол-во в магазине, шт.
            1  | bacon     | 170.0    | 10
            2  | beef      | 250.0    | 10
            3  | ham       | 200.0    | 10
            4  | salmon    | 150.0    | 10
            5  | carrot    | 15.0     | 10
            6  | potato    | 30.0     | 10
            7  | onion     | 20.0     | 10
            8  | apple     | 59.0     | 70
            9  | melon     | 88.0     | 13
            10 | rice      | 100.0    | 30
            11 | eggs      | 80.0     | 40
            12 | yogurt    | 55.0     | 60
*/
    @Test
    void priceCartIsCorrectCalculated() {
        // Arrange (Подготовка)
        // Act (Выполнение)
        cart.addProductToCartByID(1); // 170 +
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(3); // 200 (620)
        // Check
        assertThat(cart.getTotalPrice()).isEqualTo(620);
    }

    @Test
    void priceCartIsCorrectWithEqualProducts() {
        // Arrange
        // Act
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        cart.addProductToCartByID(9);
        // 88 * 10 = 880
        // Check result
        assertThat(cart.getTotalPrice()).isEqualTo(880);
    }

    @Test
    void CheckCartAfterDeleteProduct() {
        // Arrange
        // Act
        cart.addProductToCartByID(2); // 250 +
        cart.addProductToCartByID(4); // 150 = 400
        cart.removeProductByID(2);    // - 250 = 150
        // Check result
        assertThat(cart.getTotalPrice()).isEqualTo(150);
    }

    @Test
    void CheckReducingAvailableProducts() {
        // Arrange
        // Act
        cart.addProductToCartByID(8); // 70 - 1
        // Check
        assertThat(shop.getProductsShop().get(7).getQuantity()).isEqualTo(69);
    }

    @Test
    void CheckAddingMoreThanAvailable() {
        // Arrange
        // Act
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);

        cart.addProductToCartByID(1); // 11
        // Check
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(10);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(0);

        // Check message in console
        System.setOut(new PrintStream(output));
        cart.addProductToCartByID(1);
        assertEquals("Этого товара нет в наличии", output.toString().trim());
        System.setOut(null);
    }

    @Test
    void CheckQuantityAfterDeleteInCart() {
        // Arrange
        // Act
        cart.addProductToCartByID(1); // 9
        cart.addProductToCartByID(1); // 8
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(8);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(2);

        cart.removeProductByID(1);    // 10
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(9);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(1);
    }

    //@Test
    @ParameterizedTest
    @ValueSource(ints = {-100, 100})
    void CheckInvalidId(int i) {
        // Сначала показать пример в CalculatorTest - expectedIllegalStateExpressionToo - 117

        // Arrange
        int id = i;
        // Act
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.addProductToCartByID(id);
        });
        // Assert
        String expectedMessage = "Не найден продукт с id: " + id;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @ParameterizedTest
    @ValueSource(ints = 1)
    void DeleteMoreCustomsThanInCart(int i) {
        // Arrange
        int id = i;
        // Act
        cart.addProductToCartByID(id);
        cart.removeProductByID(id);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            cart.removeProductByID(id);
        });
        // Assert
        String expectedMessage = "В корзине не найден продукт с id: " + id;
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @DisplayName("Advanced test for calculating TotalPrice")
    @RepeatedTest(10)
    @Timeout(value = 150, unit = TimeUnit.MILLISECONDS)
    //@Disabled
    void AdvancedTestForCalculatingTotalPrice() {
        //Arrange
        //Act
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(2);
        //Assert
        assertThat(cart.getTotalPrice()).isEqualTo(500);
    }
}


