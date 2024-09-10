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

// Function to validate dates and check required fields
function validateFields() {
    const checkInDate = document.getElementById('checkin').value;
    const checkOutDate = document.getElementById('checkout').value;
    const smallCount = parseInt(document.getElementById('small_count').value) || 0;
    const mediumCount = parseInt(document.getElementById('medium_count').value) || 0;
    const largeCount = parseInt(document.getElementById('large_count').value) || 0;

    const today = new Date().toISOString().split('T')[0]; // 현재 날짜를 YYYY-MM-DD 형식으로 가져오기

    // 체크인 날짜와 체크아웃 날짜가 입력되지 않았거나 강아지 크기 중 하나도 입력되지 않은 경우
    if (!checkInDate || !checkOutDate) {
        alert('체크인 날짜와 체크아웃 날짜를 입력해 주세요.');
        return false;
    }

    // 강아지의 크기 값들의 합이 1보다 작은 경우
    const totalCount = smallCount + mediumCount + largeCount;
    if (totalCount < 1) {
        alert('강아지는 1마리 이상 선택해주세요.');
        return false;
    }

    if (checkInDate < today) {
        alert('현재날짜보다 이전 날짜는 선택하실 수 없습니다.');
        return false;
    }

    if (checkInDate && checkOutDate && checkOutDate < checkInDate) {
        alert('체크아웃 날짜는 체크인 날짜보다 앞설 수 없습니다.');
        return false;
    }

    return true;
}

// Function to handle form submission
function handleSubmit(event) {
    if (!validateFields()) {
        event.preventDefault(); // 유효성 검사 실패 시 폼 제출 방지
    }
}

// Function to set default values for date fields
function setDefaultDates() {
    const today = new Date();
    const checkInDate = today.toISOString().split('T')[0]; // 현재 날짜
    const checkOutDate = new Date(today);
    checkOutDate.setDate(today.getDate() + 1); // 현재 날짜 + 1일
    const formattedCheckOutDate = checkOutDate.toISOString().split('T')[0]; // YYYY-MM-DD 형식으로 변환

    document.getElementById('checkin').value = checkInDate;
    document.getElementById('checkout').value = formattedCheckOutDate;
}

// Function to save search values to Local Storage
function saveSearchValues() {
    const checkInDate = document.getElementById('checkin').value;
    const checkOutDate = document.getElementById('checkout').value;
    const smallCount = document.getElementById('small_count').value;
    const mediumCount = document.getElementById('medium_count').value;
    const largeCount = document.getElementById('large_count').value;

    localStorage.setItem('checkInDate', checkInDate);
    localStorage.setItem('checkOutDate', checkOutDate);
    localStorage.setItem('smallCount', smallCount);
    localStorage.setItem('mediumCount', mediumCount);
    localStorage.setItem('largeCount', largeCount);
}

// Add event listener for form submission
document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('.search-form form');
    if (form) {
        form.addEventListener('submit', saveSearchValues); // Save search values on form submit
        form.addEventListener('submit', handleSubmit); // Validate fields on form submit
    }
    setDefaultDates(); // Set default dates when the page loads
});

// Function to toggle login/logout state
function toggleAuth() {
    const authButton = document.getElementById('auth-button');
    const isLoggedIn = authButton.textContent === 'LOGOUT';

    if (isLoggedIn) {
        // 로그아웃 동작 수행 (예: 세션 클리어 등)
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // 로그인 페이지로 리다이렉트
    } else {
        // 로그인 동작 수행 (예: 자격 증명 확인 등)
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // 자리 표시자; 실제 로그아웃 URL로 변경 가능
    }
}

// Set the initial state of the auth button based on login status
function initializeAuthButton() {
    const authButton = document.getElementById('auth-button');
    // 로그인 상태 확인 (예: 쿠키, 로컬 스토리지 등에서)
    const isLoggedIn = false; // 실제 체크로 변경

    if (isLoggedIn) {
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // 자리 표시자; 실제 로그아웃 URL로 변경 가능
    } else {
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // 로그인 페이지로 리다이렉트
    }
}

// Initialize auth button on page load
document.addEventListener('DOMContentLoaded', initializeAuthButton);
