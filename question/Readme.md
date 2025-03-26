1. @Controller and @RestController difference
<img width="592" alt="image" src="https://github.com/user-attachments/assets/4807749c-bb30-49d0-9711-c129ddc47447" />

---

2. @SpringBootApplication is missing in main class after creating the module. 
Goal: The spring-boot-maven-plugin:repackage goal is executed to create an executable JAR file for the users module.

Problem: The plugin requires a main class to include in the JAR’s manifest, but it couldn’t find one in the users module.

<img width="1437" alt="image" src="https://github.com/user-attachments/assets/68e0006d-9111-42dc-a298-14057e761f16" />

---

3. Packaging issue interms of folder.
<img width="593" alt="image" src="https://github.com/user-attachments/assets/f62fcf75-3ecb-4af4-b79f-e2233d93a488" />
