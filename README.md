## Приложение для анализа тональности текста

---

Java-приложение с REST API для анализа тональности текста, контейнеризированное с помощью Docker и готовое к развертыванию в Kubernetes.

---

### Эндпоинты API

#### Анализ тональности:

> GET-request
>> /api/sentiment?text=ваш_текст
> 
>HTTP-response: 
>> {"sentiment": "positive"}

#### Проверка доступности:

> GET-request
>> /health
>
> HTTP-response:
>> {"status": "OK"}

---