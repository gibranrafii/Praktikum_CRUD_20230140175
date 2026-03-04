# Praktikum 1 - User Management REST API

---
## Endpoint API

### Base URL
```
http://localhost:8080/api/users
```

---

### 1. Create User (Tambah User)

**Endpoint:**
```
POST /api/users
```


**Request Body:**
```json
{
  "name": "Gibran Rafi",
  "age": 20
}
```

**Response Body (Success - 201 Created):**
```json
{
  "status": "success",
  "data": {
    "age": 20,
    "id": "bf4f0c7a-043b-41b5-b19b-4cd69bb65a4a",
    "name": "Gibran Rafi"
  }
}
```

---

### 2. Get All Users (Ambil Semua User)

**Endpoint:**
```
GET /api/users
```


**Response Body (Success - 200 OK):**
```json
{
  "status": "success",
  "data": [
    {
      "age": 22,
      "id": "52e95ad2-bd81-4fdf-8ad0-138ce2057f5d",
      "name": "Budi Santoso"
    },
    {
      "age": 20,
      "id": "bf4f0c7a-043b-41b5-b19b-4cd69bb65a4a",
      "name": "Gibran Rafi"
    }
  ]
}
```

---

### 3. Get User By ID (Ambil User Berdasarkan ID)

**Endpoint:**
```
GET /api/users/{id}
```

**Contoh:**
```
GET /api/users/bf4f0c7a-043b-41b5-b19b-4cd69bb65a4a
```


**Response Body (Success - 200 OK):**
```json
{
  "status": "success",
  "data": {
    "age": 20,
    "id": "bf4f0c7a-043b-41b5-b19b-4cd69bb65a4a",
    "name": "Gibran Rafi"
  }
}
```

**Response Body (Failed - 404):**
```json
{
    "status": "error",
    "message": "user not found"
}
```

---

### 4. Update User (Perbarui Data User)

**Endpoint:**
```
PUT /api/users/{id}
```

**Contoh:**
```
PUT /api/users/52e95ad2-bd81-4fdf-8ad0-138ce2057f5d
```

**Request Header:**
```
Content-Type: application/json
```

**Request Body:**
```json
{
  "name": "Pak Budi Santosa",
  "age": 27
}
```

**Response Body (Success - 200 OK):**
```json
{
  "status": "success",
  "data": {
    "age": 27,
    "id": "52e95ad2-bd81-4fdf-8ad0-138ce2057f5d",
    "name": "Pak Budi Santosa"
  }
}
```

**Response Body (Failed - 404):**
```json
{
    "status": "error",
    "message": "user not found"
}
```

---

### 5. Delete User (Hapus User)

**Endpoint:**
```
DELETE /api/users/{id}
```

**Contoh:**
```
DELETE /api/users/550e8400-e29b-41d4-a716-446655440000
```



**Response Body (Success - 200 OK):**
```json
{
  "status": "success delete user with id 52e95ad2-bd81-4fdf-8ad0-138ce2057f5d"
}
```

**Response Body (Failed - 404):**
```json
{
    "status": "error",
    "message": "user not found"
}
```

---

## Ringkasan Endpoint

| Method | Endpoint | Deskripsi |
|--------|----------|-----------|
| POST | /api/users | Tambah user baru |
| GET | /api/users | Ambil semua user |
| GET | /api/users/{id} | Ambil user by ID |
| PUT | /api/users/{id} | Update user by ID |
| DELETE | /api/users/{id} | Hapus user by ID |