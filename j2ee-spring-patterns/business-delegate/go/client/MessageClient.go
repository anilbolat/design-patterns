package client

import (
	"business-delegate/delegate"
	"business-delegate/model"
)

type Client struct {
	delegate delegate.MessageDelegate
}

func (c Client) SendMessage(messageType model.MessageType) {
	c.delegate.SendMessage(messageType)
}
