body = {
    "code": "0",
    "message": "success",
    "datas": {
        "totalSize": 1,
        "pageSize": 20,
        "pageNumber": 1,
        "allowApply": 0,
        "allowPcApply": 1,
        "rows": [{
            "id": "170dd558294442c784ec4c17355a5b34",
            "leaveType": "事假",
            "createTime": "10-20 16:47",
            "startTime": "10-21 08:00",
            "endTime": "10-21 20:00",
            "totalDay": 1,
            "status": "6",
            "expireDay": 2,
            "isExtend": "1",
            "applyTime": "10-20 16:47",
            "out": "1",
            "leaveTime": "12小时",
            "startTimePC": "10-21 08:00",
            "endTimePC": "10-21 20:00",
            "leaveReason": "外出办理身份证 望辅导员批准",
            "shutDown": false,
            "actEndTime": "10-21 20:00",
            "actEndTimeDesc": "12小时",
            "actStatus": "6",
            "isEarlyEnd": "0"
        }]
}
}
$notify("123", "333", "55");
$done({body:JSON.stringify(body)});
