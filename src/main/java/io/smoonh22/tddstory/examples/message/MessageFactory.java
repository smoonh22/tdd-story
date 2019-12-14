package io.smoonh22.tddstory.examples.message;

public class MessageFactory {

    public static Message generateMessage(MessageType messageType) {
        Message message = null;

        switch (messageType) {
            case SMS:
                message = new SMSMessage();
                break;
            case MMS:
                message = new MMSMessage();
                break;
            case PUSH:
                message = new PushMessage();
                break;
            case EMAIL:
                message = new EmailMessage();
                break;
            default:
                break;
        }
        return message;
    }
}
