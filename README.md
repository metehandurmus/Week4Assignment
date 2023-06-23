# API Kullanımı
`http://localhost:8080/api/v1/expedition/all` end-pointi üzerinden `GET` methodu kullanılarak tüm seferler görülebilir.
```json
[
    {
        "id": 1,
        "expeditionType": {
            "id": 1,
            "name": "İç Hatlar"
        },
        "airLine": {
            "id": 1,
            "name": "THY"
        },
        "expeditionDate": "3923-07-23T14:20:00.000+00:00"
    },
    {
        "id": 2,
        "expeditionType": {
            "id": 2,
            "name": "Dış Hatlar"
        },
        "airLine": {
            "id": 1,
            "name": "THY"
        },
        "expeditionDate": "3923-07-23T14:40:00.000+00:00"
    },
    {
        "id": 3,
        "expeditionType": {
            "id": 1,
            "name": "İç Hatlar"
        },
        "airLine": {
            "id": 2,
            "name": "Pegasus"
        },
        "expeditionDate": "3923-07-23T14:20:00.000+00:00"
    },
    {
        "id": 4,
        "expeditionType": {
            "id": 2,
            "name": "Dış Hatlar"
        },
        "airLine": {
            "id": 2,
            "name": "Pegasus"
        },
        "expeditionDate": "3923-07-23T14:40:00.000+00:00"
    }
]
```
formatında bir dönüş alınacaktır.

---
`http://localhost:8080/api/v1/chair/show?expeditionId=2` end-pointi üzerinden `GET` methodu kullanılarak o seferdeki boş koltuklar görülebilir.
```json
[
    {
        "id": 3,
        "chairType": {
            "id": 2,
            "name": "BUSINESS"
        },
        "price": 300.0
    }
]
```
formatında bir dönüş alınacaktır.

---
`http://localhost:8080/api/v1/ticket/buy` end-pointi üzerinden `POST` methodu kullanılarak `raw` data `json` formatında
```json
{
  "chair_id": 1
}
```
şeklinde istek gönderilerek ticket alınabilir.