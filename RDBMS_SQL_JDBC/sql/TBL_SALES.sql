CREATE TABLE TBL_SALES(
	sales_id VARCHAR2(6) PRIMARY KEY,
	sales_date DATE,
	product_id VARCHAR2(6) CONSTRAINT fk_from_tblstock REFERENCES tbl_stock(product_id),
	quantity_sold NUMBER CHECK (quantity_sold >= 0),
	sales_price_per_unit NUMBER CHECK (sales_price_per_unit >= 0)
);
