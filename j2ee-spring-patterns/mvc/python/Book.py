class Book:
    def __init__(self, ID, name, author):
        self.ID = ID
        self.name = name
        self.author = author

    def __str__(self):
        return f'ID: {self.ID}, Name: {self.name}, Author: {self.author}'
