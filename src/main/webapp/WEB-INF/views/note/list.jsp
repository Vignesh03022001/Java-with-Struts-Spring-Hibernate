<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
  <title>Notes</title>
</head>
<body>
  <h2>Notes</h2>
  <p><a href="note-form.action">+ Add Note</a> | <a href="<%=request.getContextPath()%>/">Home</a></p>
  <ul>
    <s:iterator value="notes">
      <li><s:property value="id"/>-<s:property value="message"/></li>
    </s:iterator>
  </ul>
  <s:actionmessage/>
</body>
</html>
