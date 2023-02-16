plugins {
	java
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.harbourspace"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains:annotations:23.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.jar {
	manifest.attributes["Main-Class"] = "com.harbourspace.todolist.TodoListApplication"
	val dependencies = configurations
			.runtimeClasspath
			.get()
			.map(::zipTree) // OR .map { zipTree(it) }
	from(dependencies)
	duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<Test> {
	useJUnitPlatform()
}
