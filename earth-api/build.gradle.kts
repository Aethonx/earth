plugins {
    id("earth.java-conventions")
}

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    api("com.google.inject:guice:5.1.0")
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    compileOnlyApi("org.checkerframework:checker-qual:3.21.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}