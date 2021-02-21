drop table if exists PRICES;
create table PRICES
(
    PRICE_LIST BIGINT not null
        primary key,
    BRAND_ID BIGINT,
    CURR VARCHAR(255),
    END_DATE TIMESTAMP,
    PRICE DOUBLE,
    PRIORITY BIGINT,
    PRODUCT_ID BIGINT,
    START_DATE TIMESTAMP
);

