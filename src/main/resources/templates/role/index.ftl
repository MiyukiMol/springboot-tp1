<h1>Role List</h1>
<a href="/role/create">Create</a>
<#list items as item>
  <div>
    <div>
      ${item.name}
    </div>
    <div>
      <a href="/role/details/${item.id}">Details</a>
    </div>
    <div>
      <a href="/role/update/${item.id}">Edit</a>
    </div>
    <div>
      <a href="/role/delete/${item.id}">Delete</a>
    </div><br/>
  </div>
</#list>
<div>
  <a href="/user">User Page</a>
</div>
