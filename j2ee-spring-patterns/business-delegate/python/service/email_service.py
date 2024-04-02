from service.message_service import MessageService


class EmailService(MessageService):
    def send_message(self):
        print("Sending an email message")
