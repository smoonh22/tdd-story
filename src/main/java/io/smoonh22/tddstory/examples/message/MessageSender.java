package io.smoonh22.tddstory.examples.message;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageSender {

    private String type;

    public boolean send(MessageType type, String message) {
        Message message = MessageFactory.generateMessage(messageType);
        return dispatch(message);

// 이렇게 처음에 sms만 고려했다가 계속 타입이 늘어나는 케이스는 팩토리 메서드 패턴을 적용해서 코딩하면 좋다.
//        switch(type) {
//           case "sms":
//               SMSMessage smsMessage = new SMSMessage(message);
//               dispatchSMS(smsMessage);
//               break;
//            case "mms":
//                MMSMessage mmsMessage = new MMSMessage(message);
//                dispatchMMS(mmsMessage);
//                break;
//            case "push":
//                PushMessage pushMessage = new PushMessage(message);
//                dispatchPush(pushMessage);
//                break;
//            case "email":
//                EmailMessage emailMessage = new EmailMessage(message);
//                dispatchPush(emailMessage);
//                break;
//            default:
//        }



    }

    private boolean dispatch(Message message) {
        // TODO 메세지 발송 로직
        return true;
    }
}
