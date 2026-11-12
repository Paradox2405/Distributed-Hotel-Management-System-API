# Distributed Hotel Management System: Mobile API

The backend API of a three-part restaurant automation system:

| Part | Repo |
|---|---|
| Admin web panel | [Distributed-Hotel-Management-System-Web](https://github.com/Paradox2405/Distributed-Hotel-Management-System-Web) |
| **Mobile API (this repo)** | Distributed-Hotel-Management-System-API |
| Android table app | [Distributed-Hotel-Management-System-App](https://github.com/Paradox2405/Distributed-Hotel-Management-System-App) |

This service exposes JSON endpoints that the Android app calls from each restaurant table. The endpoints cover reading the menu, placing orders, calling a waiter, leaving feedback and managing favourites.

## Endpoints (JSP)

| Area | Examples |
|---|---|
| Menu | `get_all_categories.jsp`, `get_all_dishes.jsp`, ingredients, taxes |
| Ordering | `confirm_order.jsp`, `current_orders.jsp` |
| Service | `do_call_waiter.jsp` |
| Customer | `add_to_favourite.jsp`, `get_all_favourite.jsp`, feedback |
| Promotions | `get_all_ads.jsp`, greetings |

## Tech stack

- **Java EE** (JSP and servlets) on **Apache Tomcat**
- **MySQL** with JDBC, using a DAO layer and entity classes
- Eclipse Dynamic Web Project layout

## Project structure

```
src/com/comsats/restauto/
  dao/       AdsDAO, CategoryDAO, DishDAO, OrderMainDAO, TableDAO, ...
  entity/    Ad, Category, Dish, MainOrder, OrderDetail, Table, Tax, ...
  utils/     controllers per entity
WebContent/  JSP endpoints, WEB-INF
```

## Running

1. Import into Eclipse as an existing project (or any IDE with Tomcat support).
2. Create the MySQL database and update the JDBC settings.
3. Deploy to Tomcat. The Android app expects the API at `http://<host>:8080/RestAutomationMobile/`.
