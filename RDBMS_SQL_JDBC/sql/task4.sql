CREATE VIEW V_SALES_REPORT AS
SELECT sales_id, sales_date, product_id, product_name, 
quantity_sold, product_unit_price, tbl_sales.sales_price_per_unit, 
(sales_price_per_unit - product_unit_price) profit_amount
FROM tbl_stock NATURAL JOIN tbl_sales
ORDER BY profit_amount DESC, sales_id ASC;
