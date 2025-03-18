# 🏗 Spring Boot Katmanlı Mimari (Layered Architecture) 🚀

Bu proje, **Spring Boot** kullanarak **katmanlı mimariyi** uygulamalı olarak göstermektedir. **Katmanlı mimari**, uygulamanın **Modüler, Test Edilebilir, Ölçeklenebilir ve Bakımı Kolay** olmasını sağlar.

## 📌 **Proje Yapısı ve Katmanlar**
Bu projede, Spring Boot ile **tipik bir katmanlı mimari** kullanılmıştır:
- **Controller Katmanı:** HTTP isteklerini karşılar ve yönlendirir.
- **Service Katmanı:** İş kurallarını yönetir.
- **Repository Katmanı:** Veritabanı işlemlerini yönetir (Spring Data JPA).
- **Entity Katmanı:** Veritabanı modellerini içerir.
  
## 🛠 **Kullanılan Teknolojiler**
✔ **Java 17**  
✔ **Spring Boot 3.x** (Web, Data JPA)  
✔ **Spring Security** (JWT Authentication)  
✔ **Hibernate & JPA** (Veritabanı bağlantısı)  
✔ **PostgreSQL / MySQL** (Opsiyonel veritabanı)  
✔ **Lombok** (Kod sadeleştirme)  
✔ **Maven** (Bağımlılık yönetimi)  

---
👨‍💻 API Endpointleri
HTTP Method	URL	Açıklama
GET	/api/personel	Tüm personelleri getirir
GET	/api/personel/{id}	Belirli bir personeli getirir
POST	/api/personel	Yeni personel ekler
PUT	/api/personel/{id}	Mevcut personeli günceller
DELETE	/api/personel/{id}	Personeli siler

## 🚀 **Proje Nasıl Çalıştırılır?**
Aşağıdaki adımları takip ederek projeyi çalıştırabilirsin:  

### 1️⃣ **Projeyi Çek**
```sh
git clone https://github.com/muratsinmez/Spring-Boot-Katmanl--Mimari.git
cd Spring-Boot-Katmanl--Mimari
