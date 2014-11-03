
-- #df:changeUser(system)#
-- #df:checkUser(mainSchema)#
create database /*$dfprop.mainCatalog*/;

-- #df:reviveUser()#
-- #df:checkUser(mainUser, grant)#
grant all privileges on /*$dfprop.mainCatalog*/.*
  to /*$dfprop.mainUser*/@localhost identified by '/*$dfprop.mainPassword*/';

flush privileges;