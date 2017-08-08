<html>
<head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
<table>
  <tr>
    <th>FirstName</th>
    <th>Email</th>
    <th>Password</th>
    <th>BirthDate</th>
    <th>Country</th>
    <th>Gender</th>
    
  </tr>
  <tr>
    <td>${msg.fname}</td>
    <td>${msg.email}</td>
    <td>${msg.password}</td>
    <td>${msg.bdate}</td>
    <td>${msg.country}</td>
    <td>${msg.gender}</td>
  </tr>
  
</table>


</html>

<a href="back"><input type="submit" value="Back To Register"></a>