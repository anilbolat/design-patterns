package model

type MessageType int

const (
	SMS MessageType = iota
	EMAIL
	POST
)

func (msgType MessageType) String() string {
	switch msgType {
	case SMS:
		return "SMS"
	case EMAIL:
		return "email"
	case POST:
		return "post"
	default:
		return "Unknown"
	}
}
