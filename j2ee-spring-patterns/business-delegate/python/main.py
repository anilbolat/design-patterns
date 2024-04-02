from client.client import Client
from delegate.message_delegate import MessageDelegate
from service.message_service_lookup import MessageType


if __name__ == '__main__':
    message_delegate = MessageDelegate(MessageType.SMS)
    client = Client(message_delegate)

    client.send_message()

    message_delegate.set_message_type(MessageType.EMAIL)
    client.send_message()

    message_delegate.set_message_type(MessageType.POST)
    client.send_message()
