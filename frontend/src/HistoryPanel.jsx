// HistoryPanel.jsx
import React from 'react';

const HistoryPanel = ({ sessions, onLoadSession }) => (
  <div className="history-panel">
    <h3>Previous Chats</h3>
    <ul>
      {sessions.map((session, index) => (
        <li key={index} onClick={() => onLoadSession(session)}>
          Chat {index + 1}
        </li>
      ))}
    </ul>
  </div>
);

export default HistoryPanel;
