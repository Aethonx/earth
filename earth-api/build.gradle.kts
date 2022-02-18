plugins {
    id("earth.java-conventions")
}

dependencies {
    compileOnlyApi("org.checkerframework:checker-qual:3.21.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}