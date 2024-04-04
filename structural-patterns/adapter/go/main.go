package main

import (
	"adapter/ourcode"
	"adapter/ourcode/model"
)

func main() {
	messageSender := ourcode.MessageSenderImpl{}
	messageSender.SendMessage(model.EMAIL, "Dune is cool!")
	messageSender.SendMessage(model.SMS, "Dune2 is cool!")
}
