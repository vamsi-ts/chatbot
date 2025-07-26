// ChatWindow.jsx
import React from 'react';
import MessageList from './MessageList';
import UserInput from './UserInput';

const ChatWindow = () => (
  <div className="chat-window">
    <MessageList />
    <UserInput />
  </div>
);

export default ChatWindow;
