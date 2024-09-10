function toggleCancelButton(checkbox) {
    const cancelButton = document.getElementById('cancelButton');
    if (checkbox.checked) {
        cancelButton.classList.add('active');
        cancelButton.style.cursor = 'pointer';
        cancelButton.onclick = function() {
            alert("Your reservation has been cancelled.");
        };
    } else {
        cancelButton.classList.remove('active');
        cancelButton.style.cursor = 'not-allowed';
        cancelButton.onclick = null;
    }
}
// Function to increment number of dogs
function increment(id) {
    const input = document.getElementById(id);
    input.value = parseInt(input.value) + 1;
}

// Function to decrement number of dogs
function decrement(id) {
    const input = document.getElementById(id);
    if (parseInt(input.value) > 0) {
        input.value = parseInt(input.value) - 1;
    }
}

// Function to toggle login/logout state
function toggleAuth() {
    const authButton = document.getElementById('auth-button');
    const isLoggedIn = authButton.textContent === 'LOGOUT';

    if (isLoggedIn) {
        // Perform logout action here (e.g., clearing session, etc.)
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // Redirect to login page
    } else {
        // Perform login action here (e.g., checking credentials, etc.)
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // Placeholder; can be changed to an actual logout URL
    }
}

// Set the initial state of the auth button based on login status
function initializeAuthButton() {
    const authButton = document.getElementById('auth-button');
    // Check login status here (e.g., from cookies, local storage, etc.)
    const isLoggedIn = false; // Replace with actual check

    if (isLoggedIn) {
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // Placeholder; can be changed to an actual logout URL
    } else {
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // Redirect to login page
    }
}

// Initialize auth button on page load
document.addEventListener('DOMContentLoaded', initializeAuthButton);