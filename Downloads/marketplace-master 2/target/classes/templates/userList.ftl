<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create User</title>
</head>
<body>
<#list userList as user>
    ${user.username} ${user.login}
</#list>
</body>
</html>