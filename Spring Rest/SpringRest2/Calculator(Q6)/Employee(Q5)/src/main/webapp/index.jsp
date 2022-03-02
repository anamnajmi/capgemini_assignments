<html>
<body>
<h2>Employee Management System</h2>
<h4>=========================</h4>
<h5> Employee Details</h5>
<form action="search">
employee_id: <input type="text" name="employee_id"><br>
<input type="submit">
</form>
<h3>New Employee?</h3>
<form action="add">
id: <input type = "text" name="e_id"><br>
name: <input type = "text" name="e_name"><br>
address: <input type = "text" name="e_address"><br>
contact: <input type = "text" name="e_contact"><br>
Department: <input type = "text" name="e_department"><br>
Designation: <input type = "text" name="e_designation"><br>
Salary: <input type = "text" name="e_salary"><br>
<input type="submit" value="Add New Employee">
</form>
<form action = "open">
<input type="submit" value="Open Database">
</form>
<h3>want to update the Employee data?</h3>
<form action = "update">
id: <input type="text" name="id">
new id:<input type="text" name="new_id"><br>
new name:<input type="text" name="new_name"><br>
new address:<input type="text" name="new_address"><br>
new contact:<input type="text" name="new_contact"><br>
new_Department: <input type = "text" name="e_department"><br>
new_Designation: <input type = "text" name="e_designation"><br>
new_Salary: <input type = "text" name="e_salary"><br>
<input type="submit" value="Update Employee Data">
</form>
<h6> ================================================ </h6>
<h4> Remove an Employee?</h4>
<form action="remove">
id: <input type="text" name="employee_id">
<input type="submit" value="Remove">
</form>
</body>
</html>
