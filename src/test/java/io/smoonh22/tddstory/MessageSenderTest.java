package io.smoonh22.tddstory;

import io.smoonh22.tddstory.examples.message.MessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class MessageSenderTest {
    @Test
    public void testSendMessage_SMS_메세지_발송_테스트() {
        // Given
        MessageSender messageSender = new MessageSender();
        MessageType messageType = MessageType.SMS;
        String text = "Message for SMS";

        // When
        boolean result = messageSender.send(messageType, text);

        // Then
        assertTrue("SMS 문자 발송 성공 케이스", result);
    }
}
