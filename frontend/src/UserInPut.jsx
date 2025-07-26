// Message.jsx
import React from 'react';

const Message = ({ text, sender }) => {
  const isUser = sender === 'user';
  return (
    <div className={`message ${isUser ? 'user' : 'ai'}`}>
      <span>{text}</span>
    </div>
  );
};

export default Message;
