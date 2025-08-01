-- 코드를 입력하세요
SELECT
    UGB.TITLE,
    UGB.BOARD_ID,
    UGR.REPLY_ID,
    UGR.WRITER_ID,
    UGR.CONTENTS,
    date_format(UGR.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD AS UGB
INNER JOIN USED_GOODS_REPLY AS UGR
    ON UGB.BOARD_ID = UGR.BOARD_ID
WHERE
    UGB.CREATED_DATE BETWEEN '2022-10-01' and '2022-10-31'
ORDER BY
    UGR.CREATED_DATE ASC,
    UGB.TITLE ASC;