plugins {
    id("org.jetbrains.kotlin.multiplatform")
}
java {
    modularity.inferModulePath.set(true)
}
kotlin {
    jvm {
        withJava()
        val main by compilations.getting {
            kotlinOptions {
                jvmTarget = "13"
            }
            dependencies {
                implementation(kotlin("stdlib-jdk8", "1.4.32"))
            }
        }
    }
}