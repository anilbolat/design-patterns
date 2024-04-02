from service.message_service import MessageService


class PostService(MessageService):
    def send_message(self):
        print("Sending a post message")
