import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation (kotlin("org.junit.jupiter:junit-jupiter-api:5.7.1"))
    testRuntimeOnly (kotlin("org.junit.jupiter:junit-jupiter-engine:5.7.1"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}