// 1. AJOUTER le plugin shadowJar pour l'intégration des dépendances
plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.example"
// 4. METTRE À JOUR LA VERSION
version = "1.5.8"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT")

    // 2. CHANGER la portée de 'compileOnly' à 'implementation'
    implementation("net.kyori:adventure-api:4.17.0")
    implementation("net.kyori:adventure-text-serializer-legacy:4.17.0")

    testImplementation("junit:junit:4.13.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.withType<org.gradle.api.tasks.compile.JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.release.set(21)
}

// 3. S'ASSURER que la tâche 'build' exécute bien 'shadowJar'
tasks.build {
    dependsOn(tasks.shadowJar)
}

