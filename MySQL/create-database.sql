#Create a database
create database myDatabase;
#Grant specific permissions to specific database
grant select,update,alter,insert,delete,drop,create on username identified by password;
#Reset password for sepcific user
set passwordd for username = new_password
