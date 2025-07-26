import React, { createContext, useContext, useState } from 'react';

const ChatContext = createContext();

export const ChatProvider = ({ children }) => {
  const [messages, setMessages] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

  const sendMessage = async (text) => {
    const userMsg = { text, sender: 'user' };
    setMessages(prev => [...prev, userMsg]);
    setIsLoading(true);

    const response = await fetch('/api/chat', {
      method: 'POST',
      body: JSON.stringify({ text }),
      headers: { 'Content-Type': 'application/json' }
    });

    const data = await response.json();
    setMessages(prev => [...prev, { text: data.reply, sender: 'ai' }]);
    setIsLoading(false);
  };

  return (
    <ChatContext.Provider value={{ messages, sendMessage, isLoading }}>
      {children}
    </ChatContext.Provider>
  );
};

export const useChat = () => useContext(ChatContext);
