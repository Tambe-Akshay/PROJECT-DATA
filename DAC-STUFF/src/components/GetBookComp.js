import React, { useState } from 'react';

export default function GetBookComp() {
  const [bookId, setBookId] = useState('');
  const [bookInfo, setBookInfo] = useState(null);

  const handleGetBook = function () {
    fetch(`http://training.object.co.in/api/book/getbook?id=${bookId}`, {
      method: 'GET',
    })
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error('Error retriving book information');
        }
      })
      .then((data) => {
        setBookInfo(data);
      })
      .catch((error) => {
        console.error('Error:', error);
        setBookInfo(null);
      });
  };

  return (
    <div>
      <h1> Book Information</h1>
      <div>
        <label htmlFor="bookId">Enter Book ID:</label>
        <input
          type="text"
          id="bookId"
          value={bookId}
          onChange={(e) => {
            setBookId(e.target.value);
          }}
        />
        <button onClick={handleGetBook}>Get Book</button>
      </div>

      {bookInfo !== null ? (
        <div>
          <h2>Book Information:</h2>
          <p>Title: {bookInfo.Title}</p>
          <p>Publication: {bookInfo.Publication}</p>
          <p>Price: {bookInfo.Price}</p>
        </div>
      ) : (
        <p>No information available for Book ID.</p>
      )}
    </div>
  );
}
