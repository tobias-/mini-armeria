plugins {
    kotlin("jvm") version "1.4.20"
}

dependencies {
    api(platform("com.linecorp.armeria:armeria-bom:1.13.3"))
    implementation("com.linecorp.armeria:armeria")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf(
            "-Xjsr305=strict",
            "-Xjvm-default=enable",
            "-Xopt-in=kotlin.RequiresOptIn"
        )
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}
