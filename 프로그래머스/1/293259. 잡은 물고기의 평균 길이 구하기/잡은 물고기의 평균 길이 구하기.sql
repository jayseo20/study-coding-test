-- 코드를 작성해주세요
SELECT 
  ROUND(AVG(IF(LENGTH IS NULL, 10, LENGTH)), 2) AS AVERAGE_LENGTH
FROM 
  FISH_INFO;

