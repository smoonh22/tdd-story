package io.smoonh22.tddstory;

import io.smoonh22.tddstory.examples.foodserving.ICook;
import io.smoonh22.tddstory.examples.foodserving.Serving;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ServingTest {

    @Test
    public void testDoServe() throws Exception {

        //Given
        //조리 상태에 대한  Mock 객체 생성
        ICook cook = Mockito.mock(ICook.class);
        Mockito.when(cook.isFinished()).thenReturn(true);
        Serving serving = new Serving();

        //When
        boolean result = serving.doServe(cook);

        //Then
        assertTrue(result);
    }
}