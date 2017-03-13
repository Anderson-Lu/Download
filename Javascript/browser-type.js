var isIE = function(){
    var b = document.createElement('b')
    b.innerHTML = '<!--[if IE]><i></i><![endif]-->'
    return b.getElementsByTagName('i').length === 1
}

var userAgent = navigator.userAgent; 
var isOpera = userAgent.indexOf("Opera") > -1; 
var isMaxthon = userAgent.indexOf("Maxthon") > -1 ; 
var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera ; 
var isFF = userAgent.indexOf("Firefox") > -1 ; 
var isSafari = userAgent.indexOf("Safari") > -1 && userAgent.indexOf("Chrome") < 1 ; 
var isChrome = userAgent.indexOf("Chrome") > -1 ;

//Extend for isIE
var isIE = function(ver){
    var b = document.createElement('b')
    b.innerHTML = '<!--[if IE ' + ver + ']><i></i><![endif]-->'
    return b.getElementsByTagName('i').length === 1
}
if(isIE(6)){
    // IE 6
}
if(isIE(9)){
    // IE 9
}
