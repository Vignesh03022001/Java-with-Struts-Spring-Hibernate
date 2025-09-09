<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
  <title>Add Note</title>
</head>
<body>
  <h2>Add Note</h2>
  <p><a href="notes.action">← Back</a></p>

  <s:form action="note-save" method="post">
    <s:textarea name="message" label="Message" rows="4"/>
    <s:submit value="Save"/>
  </s:form>

  <div style="color:#a00;">
    <s:fielderror/>
    <s:actionerror/>
  </div>
  <div style="color:#0a0;">
    <s:actionmessage/>
  </div>
</body>
</html>
