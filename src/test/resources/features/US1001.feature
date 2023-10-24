Feature: US1001 amazon fiyat dogrulama
@wip
  Scenario: TC01 Amazon fiyat dogrulama
  Given "amazonUrl" adresine gider
  Then ana sayfaya gittigini test eder
  Then searchBox’i kullanarak "amazonAranacakKelime" icin arama yapar
  Then aramanin gerceklestigini Test eder
  And "amazonAranacakKelime" icin arama yapildiysa ilk urunu tiklar ve fiyatinin "$15.62" oldugunu test eder
  And sayfayi kapatir