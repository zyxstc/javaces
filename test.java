Date.prototype.format = function(fmt) { 
  var o = { 
     "M+" : this.getMonth()+1,                 //月份 
     "d+" : this.getDate(),                    //日 
     "h+" : this.getHours(),                   //小时 
     "m+" : this.getMinutes(),                 //分 
     "s+" : this.getSeconds(),                 //秒 
     "q+" : Math.floor((this.getMonth()+3)/3), //季度 
     "S"  : this.getMilliseconds()             //毫秒 
 }; 
 if(/(y+)/.test(fmt)) {
         fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
 }
  for(var k in o) {
     if(new RegExp("("+ k +")").test(fmt)){
          fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
      }
  }
 return fmt; 
}

function getFormatTime(time,flag) {
  if(flag === 1) {
      return time.format("yyyy-MM-dd hh:mm")
  } else {
      return time.format("MM-dd hh:mm")
  }
}

//请假理由
title = "外出实习"
//请假类型 事假 病假 实习 科研 出差 回家
type = "事假" 
//假条状态 3假期中
state = 3

//指定假期开始时间结束时间 格式 "2021-06-28 10:00"
//不指定则默认开始时间为当前 前1小时，结束时间当前 后2小时，不同时间打开会改变
start = ""
end = ""

var time = new Date()
time.setMinutes(0)
if(start==="" && end === ""){
    nowHour = time.getHours()
    //开始时间
    time.setHours(Math.max(0,(nowHour - 1)))
    start = getFormatTime(time,1)
    //结束时间
    time.setHours(Math.min(23,(nowHour+3)))
    end = getFormatTime(time,1)
}
body = {
{
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
}
$done({body:JSON.stringify(body)});
