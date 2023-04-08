const url = "https://api.day.app/ioLQp3P6bsyn6cMpWzzptQ/123123123";
const method = "GET";
const headers = {"Field": "test-header-param"};

const myRequest = {
    url: url,
    method: method, // Optional, default GET.
    headers: headers, // Optional.
};

$task.fetch(myRequest).then(response => {
    // response.statusCode, response.headers, response.body
    console.log(response.body);
    $notify("Title", "Subtitle", response.body); // Success!
    $done();
}, reason => {
    // reason.error
    $notify("Title", "Subtitle", reason.error); // Error!
    $done();
});
