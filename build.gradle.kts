plugins {
	kotlin("jvm") version "1.8.0" // плагин Kotlin
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
}


group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa") // JPA
	implementation("org.springframework.boot:spring-boot-starter-web") // Web
	implementation("org.postgresql:postgresql") // PostgreSQL драйвер
	testImplementation("org.springframework.boot:spring-boot-starter-test") // Тестирование
}



tasks.withType<Test> {
	useJUnitPlatform()
}
