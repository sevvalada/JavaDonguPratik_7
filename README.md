# 🎵 Harmonik Sayı Hesaplama Programı

Bu Java programı, kullanıcıdan alınan **n** sayısına göre **harmonik serinin toplamını** hesaplar.  

---

## 🧠 Harmonik Seri Nedir?

Harmonik seri, 1’den n’e kadar olan sayıların terslerinin toplamıdır.  

**Formül:**  
`H(n) = 1 + 1/2 + 1/3 + ... + 1/n`

Örneğin:  
n = 5 için  
H(5) = 1 + 1/2 + 1/3 + 1/4 + 1/5 = **2.2833**

---

## ⚙️ Programın Çalışma Mantığı

1. Kullanıcıdan bir **tam sayı (n)** alınır.  
2. `for` döngüsü ile 1’den n’e kadar her sayı için `1 / i` işlemi yapılır.  
3. Her adımda bu değerler toplanarak **harmonik toplam** elde edilir.  
4. Sonuç ekranda ondalıklı (double) biçimde gösterilir.  
ışma

