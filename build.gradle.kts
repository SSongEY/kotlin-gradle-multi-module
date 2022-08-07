import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.2"
	id("io.spring.dependency-management") version "1.0.12.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply {
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("kotlin")
		plugin("kotlin-spring")
	}

	group = "com.example"
	version = "0.0.1-SNAPSHOT"
	java.sourceCompatibility = JavaVersion.VERSION_17


	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

		testImplementation("org.springframework.boot:spring-boot-starter-test")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "17"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}


project(":core") {
	tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
		enabled = false
	}
}

project(":api-server1") {
	dependencies {
		implementation(project(":core"))
	}

	tasks.getByName<Jar>("jar") {
		enabled = false
	}
}

project(":api-server2") {
	dependencies {
		implementation(project(":core"))
	}

	tasks.getByName<Jar>("jar") {
		enabled = false
	}
}
