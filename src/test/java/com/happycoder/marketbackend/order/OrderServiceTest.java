package com.happycoder.marketbackend.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private OrderRepository repository;
    private OrderService underTest;

    @BeforeEach
    public void setUp() {
        underTest = new OrderService(repository);
    }

    @Test
    public void checkIfCanGetAllOrders() {
        underTest.getOrders();

        verify(repository).findAll();
    }

    @Test
    public void checkIfCanAddOrder() {
        Order order = new Order("Carrot", 20, null);
        ArgumentCaptor<Order> captor = ArgumentCaptor.forClass(Order.class);

        underTest.saveOrder(order);

        verify(repository).save(captor.capture());

        Order capturedValue = captor.getValue();

        assertThat(capturedValue).isEqualTo(order);
    }
}