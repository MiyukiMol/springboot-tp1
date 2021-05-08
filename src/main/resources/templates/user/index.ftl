<h1>User List</h1>
<a href="/user/create">Create</a><br/>
<#list items as item>
  <div>
    <div><b>firstname : </b>
      ${item.firstname}
    </div>
    <div><b>lastname : </b>
      ${item.lastname}
    </div>
    <div>
      <a href="/user/details/${item.id}">Details</a>
    </div>
    <div>
      <a href="/user/update/${item.id}">Edit</a>
    </div>
    <div>
      <a href="/user/delete/${item.id}">Delete</a>
    </div><br/>
  </div>
</#list>
 <br/><div>
  <a href="/role">Role page</a>
</div>
