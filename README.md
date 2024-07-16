# 아파트 실거래가 알림 서비스
사용자가 '구' 기준으로 관심을 설정하면 '구' 기준으로 사용자에게 알림을 보내는 서비스

***

## 프로젝트 설계
1. 동 코드 마이그레이션 배치
* 정의 : 법정동 파일을 DB 테이블에 저장한다.
* 배치 주기 : 최초, 데이터가 수정되었을 때

2. 실거래가 수집 배치 설계
* 정의 : 매일 실거래가 정보를 가져와 DB에 저장한다.
* 배치 주기 : 매일 새벽 1시 (트래픽이 적은 시기)

3. 실거래가 알림 배치
* 정의 : 사용자가 관심 설정한 구에 대해 실거래가 정보를 알린다.
* 배치 주기 : 매일 오전 8시

## 구현 화면
* 사용자가 관심 설정한 구 저장된 DB화면
![image](https://github.com/user-attachments/assets/d90f3818-a972-42d7-9594-2ca12fcae0b6)
* 사용자가 관심 설정한 구에 대해 알림을 받는 화면 - 가격 예시) 103,000원 -> 10억 3천만원 <br>
![image](https://github.com/user-attachments/assets/9e4e9a16-e724-44fd-bc43-1c039ad9c0a5)

## 개발 환경

* Intellij IDEA Ultimate
* Java 17
* Spring Boot 2.5.3
* Gradle
* Docker

## 기술 세부 스택

Spring Boot

* Spring Batch
* Spring Data JPA
* H2 Database
* MySQL Driver
* Lombok
* Spring Configuration Processor

## ERD
![아파트 실거래가_ERD](https://github.com/yunh0/apartment-transaction-price-notification-service/assets/114940378/d18cbc44-508b-49c6-a9d2-979b9a87aa47)

## 사용한 OPEN API
* https://www.data.go.kr/data/15058747/openapi.do
