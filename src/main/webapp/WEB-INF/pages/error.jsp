<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>error</title>
</head>
<body>
<h1 style="text-align: center;color: red">文件提交过程中出现了问题</h1>
<h3>以下是问题描述:</h3>
<hr/>
${msg}
<hr/>
<h3>请将以上信息反馈给管理员,将在下个版本得到解决</h3>

<a href="#" id="ret">返回</a>

<script>
    history.pushState(null, '', 'temp.html')
    let a = document.getElementById('ret');
    let mainPage = localStorage.getItem('mainPage')
    a.onclick = function(){
        location.href = mainPage
    }
</script>
</body>
</html>
