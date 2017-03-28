<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title>Error Page</title>
</head>
<body>
<h3>Error_java</h3>
<p>Error occurred.</p>
<pre>
<% exception.printStackTrace(response.getWriter()); %>
</pre>
</body>
</html>