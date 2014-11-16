<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Error Page</title>
    </head>
    <body onload="submit();">
        <form name="signout">

        </form>
    </body>

    <script type="text/javascript">
        function submit(){
            var url=location.protocol+'//'+location.host+ '<%= request.getContextPath()%>' +'/pages/error.jsf';
            document.signout.action=url;
            document.signout.method="POST";
            document.signout.submit();
        }
    </script>
</html>
