class Client:
    def __init__(self, message_delegate):
        self.message_delegate = message_delegate

    def send_message(self):
        self.message_delegate.send_message()
