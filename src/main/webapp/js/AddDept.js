var api = "webapi/department/addDept";
$.get(api, function (department) {
        var departmentOptions = "";
        for (var i = 0; i < department.length; i++) {
            departmentOptions += '<option value="' + department[i].id + '">' + department[i].dname+ ' ' + department[i].dCapacity + '</option>';
        }
        $("#departmentId").append(departmentOptions);
});
