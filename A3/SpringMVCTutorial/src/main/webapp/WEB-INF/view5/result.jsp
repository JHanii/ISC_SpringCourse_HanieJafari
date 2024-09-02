<html>
   <head>
      <title>Profile</title>
   </head>
   
   <body>
      <center>
      <h1>Registration Result</h1>
      
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("firstName")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("lastName")%>
         </p></li>
      </ul>
	  <ul>
         <li><p><b>Date of Birth:</b>
            <%= request.getParameter("birthDate")%>
         </p></li>
	  </ul>
   </body>
</html>