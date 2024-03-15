package ru.gb.Unit_tests_seminar_5;

import org.junit.jupiter.api.Test;
import ru.gb.Unit_tests_seminar_5.number.MaxNumberModule;
import ru.gb.Unit_tests_seminar_5.number.RandomNumberModule;
import ru.gb.Unit_tests_seminar_5.order.OrderService;
import ru.gb.Unit_tests_seminar_5.order.PaymentService;
import ru.gb.Unit_tests_seminar_5.user.UserRepository;
import ru.gb.Unit_tests_seminar_5.user.UserService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {
    //5.1.
    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int[] numbers = randomNumberModule.generateRandomNumbers(10);

        assertEquals(10, numbers.length);
    }

    @Test
    public void testMaxNumber() {
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(8, maxNumberModule.findMaximum(numbers));
    }

    @Test
    public void testFindMaxInGenerNumbers() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        int[] numbers = randomNumberModule.generateRandomNumbers(10);
        int max = maxNumberModule.findMaximum(numbers);

        Arrays.sort(numbers);

        assertEquals(numbers[9], max);
    }
    //5.2.
    @Test
    public void testUserRepositoryInUserService() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);

        assertEquals("User 1", result);
    }
    //5.3.
    @Test
    public void testPaymentServiceInOrderService() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("345", 456.34);

        assertEquals(true, result);
    }
}