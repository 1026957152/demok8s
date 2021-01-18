<!-- Bootstrap core JavaScript-->
<script th:src="@{/vendor/jquery/jquery.min.js}"></script>
<script th:src="@{/vendor/bootstrap/js/bootstrap.bundle.min.js}"></script>
<!-- Core plugin JavaScript-->
<script th:src="@{/vendor/jquery-easing/jquery.easing.min.js}"></script>
<!-- Custom scripts for all pages-->
<script th:src="@{/js/sb-admin-2.min.js}"></script>
<!-- EDIT modal-->
<script>
    $(document).ready(function(){
        $('.dropdown .eBtn').on('click', function(event){
            //prevents redirection to blank page with JSON-Task-Object
            event.preventDefault();
            var href = $(this).attr('href');
            $.get(href, function(task){
                $('.myForm #id').val(task.id);
                $('.myForm #title').val(task.title);
                $('.myForm #content').val(task.content);
                $('.myForm #status').val(task.status);
            });
            $('.myForm #editModal').modal();
        });
    });
</script>
<!--NEW Task Modal-->
<script>
    $(document).ready(function(){
        $('.newBtn').on('click', function(event){

            $('.newTaskForm #id').val('');
            $('.newTaskForm #title').val('');
            $('.newTaskForm #content').val('');
            $('.newTaskForm #status').val('OPEN');
            alert("dddd");
            $('.newTaskForm #newTaskModal').modal();
        });
    });
</script>