create table T_USER
(
  ID           INTEGER auto_increment not null,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        VARCHAR(50),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT,
  constraint T_USER_PK
    primary key (ID)
);

