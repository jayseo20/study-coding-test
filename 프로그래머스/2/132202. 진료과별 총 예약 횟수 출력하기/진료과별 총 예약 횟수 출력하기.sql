SELECT 
  MCDP_CD AS `진료과코드`,
  COUNT(*) AS `5월예약건수`
FROM 
  APPOINTMENT
WHERE 
  DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
  AND APNT_CNCL_YN = 'N'
GROUP BY 
  MCDP_CD
ORDER BY 
  `5월예약건수`,
  `진료과코드`;
