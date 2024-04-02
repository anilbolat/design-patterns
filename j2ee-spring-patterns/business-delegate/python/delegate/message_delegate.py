from service.message_service_lookup import MessageServiceLookup
from service.message_service import MessageService


class MessageDelegate:
    def __init__(self, message_type):
        self.message_service_lookup = MessageServiceLookup
        self.message_service = MessageService
        self.message_type = message_type

    def set_message_type(self, message_type):
        self.message_type = message_type

    def send_message(self):
        self.message_service = self.message_service_lookup.get_message_service(message_type=self.message_type)
        self.message_service.send_message()
