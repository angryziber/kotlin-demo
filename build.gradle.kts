import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  val kotlinVersion = "1.3.10"
  id("org.jetbrains.kotlin.jvm") version kotlinVersion
  id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
}

allOpen {
  annotation("mocking.Mockable")
}

sourceSets {
  getByName("main").apply {
    java.srcDirs("src")
  }
  getByName("test").apply {
    java.srcDirs("test")
  }
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = listOf("-Xjsr305=strict -progressive")
  }
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
}

repositories {
  jcenter()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-script-runtime")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
  implementation("io.ktor:ktor-client-cio:1.0.0")
  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0") {
    exclude("org.jetbrains.kotlin")
  }
  testImplementation("io.mockk:mockk:1.8.13.kotlin13")
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}
