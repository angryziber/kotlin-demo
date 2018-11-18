import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  val kotlinVersion = "1.3.10"
  id("org.jetbrains.kotlin.jvm") version kotlinVersion
  id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
}

sourceSets {
  getByName("main").apply {
    java.srcDirs("src")
    resources.srcDirs("src")
  }
  getByName("test").apply {
    java.srcDirs("test")
    resources.srcDirs("test")
  }
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    jvmTarget = "1.8"
    freeCompilerArgs = listOf("-Xjsr305=strict")
  }
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
}

repositories {
  jcenter()
}

dependencies {
  compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  compile("org.jetbrains.kotlin:kotlin-reflect")
  compile("org.jetbrains.kotlin:kotlin-script-runtime")
  testImplementation("com.nhaarman:mockito-kotlin")
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
