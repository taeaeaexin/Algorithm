-- 상반기 주문 정보
-- 아이스크림 정보
-- 상반기 아이스크림 총 주문량이 3000보다 높으면서
-- 주 성분이 과일인 아이스크림
-- 총주문량이 큰 순서대로
SELECT i.FLAVOR
FROM FIRST_HALF h JOIN ICECREAM_INFO i ON h.FLAVOR = i.FLAVOR
WHERE h.TOTAL_ORDER > 3000 AND i.INGREDIENT_TYPE = 'fruit_based'
ORDER BY h.TOTAL_ORDER DESC;