CREATE TABLE TBL_STOCK(
	product_id VARCHAR2(6) PRIMARY KEY,
	product_name VARCHAR2(20) UNIQUE,
	quantity_on_hand NUMBER CHECK (quantity_on_hand >=0),
	product_unit_price NUMBER CHECK (product_unit_price >=0),
	reorder_level NUMBER CHECK (reorder_level >=0)
);
