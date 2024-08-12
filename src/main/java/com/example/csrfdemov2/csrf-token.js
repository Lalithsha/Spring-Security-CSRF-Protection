/*function getCsrfToken() {
    return fetch('/csrf-token')
        .then(response => response.json())
        .then(data => data.token);
}

function validateCsrfToken(token) {
    return fetch('/validate-csrf-token', {
        method: 'POST',
        headers: {
            'X-CSRF-TOKEN': token
        }
    })
    .then(response => {
        if (response.ok) {
            return response.text();
        } else {
            throw new Error('Invalid CSRF token');
        }
    });
}

function performAction() {
    getCsrfToken().then(token => {
        validateCsrfToken(token)
            .then(() => {
                return fetch('/protected-action', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                        'X-CSRF-TOKEN': token
                    },
                    body: JSON.stringify({ *//* your data here *//* })
                });
            })
            .then(response => response.text())
            .then(result => alert(result))
            .catch(error => console.error('Error:', error));
    });
}*/













/*
function getCsrfToken() {
    return fetch('/csrf-token')
        .then(response => response.json())
        .then(data => data.token);
}

function performAction() {
    getCsrfToken().then(token => {
        fetch('/protected-action', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'X-CSRF-TOKEN': token
            },
            body: JSON.stringify({ */
/* your data here *//*
 })
        })
        .then(response => response.text())
        .then(result => alert(result))
        .catch(error => console.error('Error:', error));
    });
}*/
