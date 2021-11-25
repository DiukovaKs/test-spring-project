Тестовый проект на Spring Framework

Для проверки работоспособности:

отправить GET запрос вида:

* http://localhost:8080/send/email
* http://localhost:8080/send/push
* http://localhost:8080/send/sms

в качетсве ответа приходит строка вида:

* Send E-mail!
* Send Push!
* Send SMS! 
* No such sender application (если указан некоррекный url)

Для проверки балансировки нагрузки на микросервис send-message, необходимо запустить его на разных портах.