from enum import Enum
from service.sms_service import SMSService
from service.email_service import EmailService
from service.post_service import PostService


class MessageType(Enum):
    SMS = 1
    EMAIL = 2
    POST = 3


class MessageServiceLookup:
    def get_message_service(message_type):
        if message_type == MessageType.SMS:
            return SMSService()
        elif message_type == MessageType.EMAIL:
            return EmailService()
        elif message_type == MessageType.POST:
            return PostService()
