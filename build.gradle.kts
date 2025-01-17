plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("org.testng:testng:7.1.0")
}

tasks.test {
    useTestNG()
    testLogging.showStandardStreams = true //Added for better logging.
}
