package adapter

import (
	"adapter/ourcode/model"
	lib "adapter/thirdpartylib"
	libMsgModel "adapter/thirdpartylib/model"
)

type MessageSenderAdapter struct {
	CoolSender lib.CoolMessageSenderImpl
}

func (adapter *MessageSenderAdapter) SendMessage(msgType model.MessageType, message string) {
	msg := libMsgModel.Message{
		Message:     message,
		MessageType: msgType.String(),
	}
	adapter.CoolSender.SendCoolMessage(msg)
}
