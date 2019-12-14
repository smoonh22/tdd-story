package com.practice.springsecurityjwt;

import com.practice.springsecurityjwt.delivery.Delivery;
import com.practice.springsecurityjwt.delivery.IVehicle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DeliverTest {

    @Test
    public void testMakeADelivery_배당에_대한_케이스() {
        //Given
        //배달 수단에 대한 Mock 객체 생성
        IVehicle mockVehicle = Mockito.mock(IVehicle.class);
        //vehicle 인스턴스의 deliver() 메서드를 호출했을 때 true를 리턴하도록 정의
        Mockito.when(mockVehicle.deliver()).thenReturn(true);

        //생성된 Mock 객체를 이용해 테스트하고자 하는 Deliver 테스트
        Delivery delivery = new Delivery(mockVehicle);

        //when
        //테스트하고자 하는 코드
        boolean result = delivery.makeADelivery();

        //Then
        assertTrue(result);
    }
}
