/**
 * 登陆聊天
 */
function login() {
    //location.href = '/index?username='+$('#username').val();
    document.getElementById('formId').submit();
}

/**
 * 使用ENTER登陆
 */
document.onkeydown = function (event) {
    var e = event || window.event || arguments.callee.caller.arguments[0];
    e.keyCode === 13 && login();
};