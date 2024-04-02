from service.message_service import MessageService


class SMSService(MessageService):
    def send_message(self):
        print("Sending an SMS message")
