package io.smoonh22.tddstory;

import io.smoonh22.tddstory.examples.message.Message;
import io.smoonh22.tddstory.examples.message.MessageFactory;
import io.smoonh22.tddstory.examples.message.MessageType;
import io.smoonh22.tddstory.examples.message.SMSMessage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertTrue;


@SpringBootTest
public class MessageFactoryTest {
    @Test
    public void testGenerateMessage_SMSMessage_인스턴스생성테스트() {
        // Given
        MessageFactory messageFactory = new MessageFactory();
        MessageType type = MessageType.SMS;

        // When
        Message message = MessageFactory.generateMessage(type);

        // Then
        assertNotNull("", message);
        assertTrue(" SMSMessage 인스턴스 생성!! ", (message instanceof SMSMessage));

    }
}
