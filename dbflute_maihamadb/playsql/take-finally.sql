
-- =======================================================================================
--                                                                     Business Constraint
--                                                                     ===================
-- #df:assertListZero#
-- formalized members should have their own formalized date-times
select MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE, FORMALIZED_DATETIME
  from MEMBER
 where MEMBER_STATUS_CODE = 'FML'
   and FORMALIZED_DATETIME is null
;


-- =======================================================================================
--                                                                     TestData Constraint
--                                                                     ===================
-- #df:assertCountExists@ut#
-- should have at least one record at ut
select count(*) from MEMBER
;
