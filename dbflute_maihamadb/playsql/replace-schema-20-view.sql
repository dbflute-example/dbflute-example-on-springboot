
-- PK is defined at DBFlute property
create view SUMMARY_PRODUCT as
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_HANDLE_CODE
     , product.PRODUCT_STATUS_CODE
     , (select max(purchase.PURCHASE_DATETIME)
          from PURCHASE purchase
         where purchase.PRODUCT_ID = product.PRODUCT_ID
       ) as LATEST_PURCHASE_DATETIME
  from PRODUCT product
;

-- PK is NOT defined at DBFlute property
-- treated as no-primary-key table 
create view SUMMARY_WITHDRAWAL as
select withdrawal.MEMBER_ID
     , member.MEMBER_NAME
     , withdrawal.WITHDRAWAL_REASON_CODE
     , reason.WITHDRAWAL_REASON_TEXT
     , withdrawal.WITHDRAWAL_REASON_INPUT_TEXT
     , withdrawal.WITHDRAWAL_DATETIME
     , member.MEMBER_STATUS_CODE
     , status.MEMBER_STATUS_NAME
     , (select max(purchase.PURCHASE_PRICE)
          from PURCHASE purchase
         where purchase.MEMBER_ID = member.MEMBER_ID
       ) as MAX_PURCHASE_PRICE
  from MEMBER_WITHDRAWAL withdrawal
    left outer join WITHDRAWAL_REASON reason
      on withdrawal.WITHDRAWAL_REASON_CODE = reason.WITHDRAWAL_REASON_CODE
    left outer join MEMBER member
      on withdrawal.MEMBER_ID = member.MEMBER_ID
    left outer join MEMBER_STATUS status
      on member.MEMBER_STATUS_CODE = status.MEMBER_STATUS_CODE
;
