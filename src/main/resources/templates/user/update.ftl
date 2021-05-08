<form method="POST">
  <label for="id">User Id</label>
  <input value="${item.id}" />
  <label for="firstname">Firstname</label>
  <input type="text" id="firstname" name="firstname" value="${item.firstname}"/>
  <label for="lastname">Lastname</label>
  <input type="text" id="lastname" name="lastname" value="${item.lastname}"/> 
 

  <input type="submit" value="Edit"/>
</form>
