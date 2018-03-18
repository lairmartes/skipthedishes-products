use skipthedishes;

# ****  product  *****
#id integer($int64)
# storeId integer($int64)
# name string
# description string
# price number($double)

create table product
( 
	ID int NOT NULL AUTO_INCREMENT,
    STORE_ID int NOT NULL,
    NAME VARCHAR(50),
    DESCRIPTION VARCHAR(256),
    PRICE DECIMAL(9,2),
    PRIMARY KEY (ID)
);


    