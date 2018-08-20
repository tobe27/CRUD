<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lichu
  Date: 2018-5-13
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑供应商</title>
</head>
<body style="text-align:center">
<form method="post"  action="/supplier/${supplier.supplierId}">
    <input type="hidden" name="_method" value="put">
    供应商编号:
    <input type="text"  class="form-control"  name="supplierId" VALUE="${supplier.supplierId}"><br/>
    供应商名称:
    <input type="text"  class="form-control" name="supplierName"  VALUE="${supplier.supplierName}"><br/>
    联系人名称:
    <input type="text"  class="form-control" name="contactName" VALUE="${supplier.contactName}"><br/>
    联系人电话:
    <input type="text"  class="form-control" name="contactMobile"  VALUE="${supplier.contactMobile}"><br/>
    供应商备注:
    <input type="text"  class="form-control" name="remark" VALUE="${supplier.remark}">
    <br/>
    <input type="submit" value="确认编辑"/>
</form>
<a href="javascript:history.go(-1);">返回</a>
</body>
</html>
