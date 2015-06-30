
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

-- #df:assertListZero#
-- withdrawal members should have their own withdrawal informations
select mb.MEMBER_ID, mb.MEMBER_NAME, mb.MEMBER_STATUS_CODE
  from MEMBER mb
 where mb.MEMBER_STATUS_CODE = 'WDL'
   and not exists (select wdl.MEMBER_ID
                     from MEMBER_WITHDRAWAL wdl
                    where wdl.MEMBER_ID = mb.MEMBER_ID
       )
;

-- #df:assertListZero#
-- member addresses should be only one at any time
select adr.MEMBER_ADDRESS_ID, adr.MEMBER_ID
     , adr.VALID_BEGIN_DATE, adr.VALID_END_DATE
     , adr.ADDRESS
  from MEMBER_ADDRESS adr
 where exists (select subadr.MEMBER_ADDRESS_ID
                 from MEMBER_ADDRESS subadr
                where subadr.MEMBER_ID = adr.MEMBER_ID
                  and subadr.VALID_BEGIN_DATE > adr.VALID_BEGIN_DATE
                  and subadr.VALID_BEGIN_DATE < adr.VALID_END_DATE
       )
;


-- =======================================================================================
--                                                                     TestData Constraint
--                                                                     ===================
-- #df:assertCountExists@ut#
-- should have at least one record at ut
select count(*) from MEMBER member
;
-- #df:assertCountExists@ut#
-- should have at least one record at ut
select count(*) from MEMBER_LOGIN login
;
