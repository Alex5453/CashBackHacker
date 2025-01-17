plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testng:testng:7.1.0")
    // Remove junit:junit:4.13  - JUnit 4 is not needed with JUnit 5 and TestNG
}

tasks.register<Test>("junitJupiterTest") {
    useJUnitPlatform()
    testLogging.showStandardStreams = true //Added for better logging.
}

tasks.register<Test>("testngTest") {
    useTestNG()
    testLogging.showStandardStreams = true //Added for better logging.

}
