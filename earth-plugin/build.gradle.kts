plugins {
    id("earth.java-conventions")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation(project(":earth-api"))

    // Integration
    api("com.google.inject:guice:5.1.0")
    // JSR 305
    compileOnlyApi("org.checkerframework:checker-qual:3.21.2")
    // Minecraft
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    // Compression
    api("com.github.luben:zstd-jni:1.5.2-1")
}