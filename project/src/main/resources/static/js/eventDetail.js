document.addEventListener("DOMContentLoaded", function () {
  const eventId = window.location.pathname.split("/").pop();

  fetch(`/events/${eventId}`)
      .then(response => response.json())
      .then(event => {
          let eventDetailDiv = document.getElementById("event-detail");
          eventDetailDiv.innerHTML = `
              <h2>${event.title}</h2>
              <p>${event.content}</p>
          `;
      });
});
