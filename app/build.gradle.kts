plugins {
    java
    kotlin("jvm")
    application
}
java {
    modularity.inferModulePath.set(true)
}
dependencies {
    implementation(kotlin("stdlib-jdk8", "1.4.32"))
    implementation(project(":lib"))
}
application {
    mainClass.set("app.AppKt")
}
tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).all {
    kotlinOptions {
        jvmTarget = "13"
    }
}
