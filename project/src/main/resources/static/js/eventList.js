document.addEventListener("DOMContentLoaded", function () {
  fetch('/events')
      .then(response => response.json())
      .then(data => {
          let eventListDiv = document.getElementById("event-list");
          data.forEach(event => {
              let eventDiv = document.createElement("div");
              eventDiv.innerHTML = `
                  <h3>${event.title}</h3>
                  <p>${event.content}</p>
                  <a href="/event/${event.id}">자세히 보기</a>
              `;
              eventListDiv.appendChild(eventDiv);
          });
      });
});
