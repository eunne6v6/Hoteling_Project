// 개 수를 증가시키는 함수
function increment(id) {
    const input = document.getElementById(id);
    input.value = parseInt(input.value) + 1;
}

// 개 수를 감소시키는 함수
function decrement(id) {
    const input = document.getElementById(id);
    if (parseInt(input.value) > 0) {
        input.value = parseInt(input.value) - 1;
    }
}

// 날짜를 검증하는 함수
function validateDates() {
    const checkInDate = document.getElementById('checkInDate').value;
    const checkOutDate = document.getElementById('checkOutDate').value;
    const smallCount = parseInt(document.getElementById('small_count').value) || 0;
    const mediumCount = parseInt(document.getElementById('medium_count').value) || 0;
    const largeCount = parseInt(document.getElementById('large_count').value) || 0;

    const today = new Date().toISOString().split('T')[0]; // 오늘 날짜를 YYYY-MM-DD 형식으로 가져옴

    // 필수 필드 검사
    if (!checkInDate || !checkOutDate || (smallCount < 1 && mediumCount < 1 && largeCount < 1)) {
        alert('입력되지 않은 값이 있습니다.');
        return false;
    }

    // 강아지의 크기 값들의 합이 1보다 작은 경우
    const totalCount = smallCount + mediumCount + largeCount;
    if (totalCount < 1) {
        alert('강아지는 1마리 이상 선택해주세요.');
        return false;
    }

    // 체크인 날짜 검증
    if (checkInDate < today) {
        alert('현재 날짜보다 이전 날짜는 선택하실 수 없습니다.');
        return false;
    }

    // 체크아웃 날짜 검증
    if (checkInDate && checkOutDate && checkOutDate < checkInDate) {
        alert('체크아웃 날짜는 체크인 날짜보다 앞설 수 없습니다.');
        return false;
    }

    return true;
}

// 폼 제출을 처리하는 함수
function handleSubmit(event) {
    if (!validateDates()) {
        event.preventDefault(); // 검증 실패 시 폼 제출을 방지함
    }
}

// 폼 제출 이벤트 리스너 추가
document.addEventListener('DOMContentLoaded', function() {
    // 기본값 설정
    const today = new Date().toISOString().split('T')[0];
    const tomorrow = new Date();
    tomorrow.setDate(tomorrow.getDate() + 1);
    const tomorrowDate = tomorrow.toISOString().split('T')[0];

    document.getElementById('checkInDate').value = today;
    document.getElementById('checkOutDate').value = tomorrowDate;

    const form = document.querySelector('.search-form form');
    if (form) {
        form.addEventListener('submit', handleSubmit);
    }
});

// 로그인/로그아웃 상태를 전환하는 함수
function toggleAuth() {
    const authButton = document.getElementById('auth-button');
    const isLoggedIn = authButton.textContent === 'LOGOUT';

    if (isLoggedIn) {
        // 로그아웃 동작 수행 (예: 세션 정리 등)
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // 로그인 페이지로 리다이렉트
    } else {
        // 로그인 동작 수행 (예: 자격 증명 확인 등)
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // 자리 표시자; 실제 로그아웃 URL로 변경 가능
    }
}

// 로그인 버튼의 초기 상태를 설정하는 함수
function initializeAuthButton() {
    const authButton = document.getElementById('auth-button');
    // 로그인 상태를 확인 (예: 쿠키, 로컬 스토리지 등에서 확인)
    const isLoggedIn = false; // 실제 확인으로 교체해야 함

    if (isLoggedIn) {
        authButton.textContent = 'LOGOUT';
        authButton.href = '#'; // 자리 표시자; 실제 로그아웃 URL로 변경 가능
    } else {
        authButton.textContent = 'LOGIN';
        authButton.href = 'login.html'; // 로그인 페이지로 리다이렉트
    }
}

// Function to set saved search values to form fields
function setSavedSearchValues() {
    const checkInDate = localStorage.getItem('checkInDate');
    const checkOutDate = localStorage.getItem('checkOutDate');
    const smallCount = localStorage.getItem('smallCount') || 0;
    const mediumCount = localStorage.getItem('mediumCount') || 0;
    const largeCount = localStorage.getItem('largeCount') || 0;

    if (checkInDate) {
        document.getElementById('checkInDate').value = checkInDate;
    }
    if (checkOutDate) {
        document.getElementById('checkOutDate').value = checkOutDate;
    }
    document.getElementById('small_count').value = smallCount;
    document.getElementById('medium_count').value = mediumCount;
    document.getElementById('large_count').value = largeCount;
}

// Initialize the search form with saved values on page load
document.addEventListener('DOMContentLoaded', setSavedSearchValues);


