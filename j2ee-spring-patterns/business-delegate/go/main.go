package main

import (
	"business-delegate/client"
	"business-delegate/model"
)

func main() {

	c := client.Client{}
	c.SendMessage(model.SMS)
	c.SendMessage(model.EMAIL)
	c.SendMessage(model.POST)
}
