<html>
   <head>
      <title>Using GET Method to Read Form Data.</title>
   </head>
   
   <body>
      <h1>Using GET Method to Read Form Data</h1>
	  <h4>http://127.0.0.1:8080/sample4?first_name=Alireza&last_name=Fattahi</h4>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
      </ul>
   
   </body>
</html>