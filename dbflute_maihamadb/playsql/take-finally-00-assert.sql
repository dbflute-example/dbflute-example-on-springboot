
-- =======================================================================================
--                                                                     Business Constraint
--                                                                     ===================
-- #df:assertCountZero#
-- /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
-- Formalized members should have their own formalized date-times.
-- - - - - - - - - - -/
select count(*)
  from MEMBER
 where MEMBER_STATUS_CODE = 'FML'
   and FORMALIZED_DATETIME is null
;

-- #df:assertListZero#
-- /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
-- Withdrawal members should have their own withdrawal informations.
-- - - - - - - - - - -/
select member.MEMBER_ID, member.MEMBER_NAME
  from MEMBER member
 where member.MEMBER_STATUS_CODE = 'WDL'
   and not exists (select withdrawal.MEMBER_ID
                     from MEMBER_WITHDRAWAL withdrawal
                    where withdrawal.MEMBER_ID = member.MEMBER_ID
       )
;

-- #df:assertListZero#
-- /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
-- Member addresses should be only one at any time.
-- - - - - - - - - - -/
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
-- /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
-- These tables should have at least one record at ut and should not have at real.
-- - - - - - - - - - -/
-- #df:assertCountExists@ut#
-- #df:assertCountZero@real#
select count(*) from MEMBER member
;
-- #df:assertCountExists@ut#
-- #df:assertCountZero@real#
select count(*) from MEMBER_LOGIN login
;
