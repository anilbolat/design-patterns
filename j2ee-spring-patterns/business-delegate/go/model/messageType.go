package model

type MessageType int

const (
	SMS MessageType = iota
	EMAIL
	POST
)
