<#-- <h1>Book List</h1>
<a href="/book/create">Create</a>
<#list items as item>
  <div>
    <div>
      ${item.name}
    </div>
    <div>
      <a href="/book/details/${item.id}">Details</a>
    </div>
    <div>
      <a href="/book/update/${item.id}">Edit</a>
    </div>
    <div>
      <a href="/book/delete/${item.id}">Delete</a>
    </div><br/>
  </div>
</#list>
<div>
  <a href="/user">User Page</a>
</div>  -->
