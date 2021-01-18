<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>Hello World</title>

    <script src="https://cdn.jsdelivr.net/npm/vue@2.6.11"></script>

</head>

<body>

　　<h1>Hello</h1>

　　<div id="app">

    　　　{{message}}//两者的值保持一致的，显示的值就是 hello vue!

    　　</div>

<script>

    var vm = new Vue({

        el:'#app',//这个app就是DIV的属性值里的app

        data:{

            message:'hello world!'

        }

    });

</script>

</body>

</html>
