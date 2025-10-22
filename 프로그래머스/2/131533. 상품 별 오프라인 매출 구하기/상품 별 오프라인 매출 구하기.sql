-- 코드를 입력하세요
SELECT p.product_code, SUM(p.price * os.amount) AS 'sales'
FROM PRODUCT AS p JOIN 
    (SELECT product_id, SUM(sales_amount) AS amount
    FROM OFFLINE_SALE
    GROUP BY product_id) AS os
    ON p.product_id = os.product_id
GROUP BY p.product_code
ORDER BY sales DESC, p.product_code ASC
;