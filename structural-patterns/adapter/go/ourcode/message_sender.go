package ourcode

import (
	"adapter/adapter"
	"adapter/ourcode/model"
	"fmt"
	//	lib "adapter/thirdpartylib"
	//	libMsgModel "adapter/thirdpartylib/model"
)

type MessageSender interface {
	SendMessage(msgType model.MessageType, message string)
}

type MessageSenderImpl struct {
	senderAdapter adapter.MessageSenderAdapter
}

func (m *MessageSenderImpl) SendMessage(msgType model.MessageType, message string) {
	// via our code
	// fmt.Printf("Sending %s via our code: %v", msgType, message)

	// via third party code
	//coolSender := lib.CoolMessageSenderImpl{}
	//mgs := libMsgModel.Message{
	//	Message:     message,
	//	MessageType: msgType.String(),
	//}
	//coolSender.SendCoolMessage(mgs)

	// via adapter
	fmt.Printf("via ADAPTER -->")
	m.senderAdapter.SendMessage(msgType, message)
}
