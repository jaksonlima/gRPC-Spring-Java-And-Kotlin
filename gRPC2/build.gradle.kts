import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

extra["protobufVersion"] = "3.17.1"
extra["protobufPluginVersion"] = "0.8.18"
extra["grpcVersion"] = "1.42.1"

plugins {
    id("org.springframework.boot") version "2.7.14"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    id("com.google.protobuf") version "0.8.18"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "com.grpc.2"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

//  gRPC
    implementation("net.devh:grpc-server-spring-boot-starter:2.14.0.RELEASE")
    implementation("io.grpc:grpc-netty:1.42.1")
    implementation("io.grpc:grpc-protobuf:1.42.1")
    implementation("io.grpc:grpc-stub:1.42.1")
    compileOnly("jakarta.annotation:jakarta.annotation-api:1.3.5")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.17.1"
    }
    generatedFilesBaseDir = "$projectDir/src/generated"
    delete(generatedFilesBaseDir)
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.42.1"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc") {
                    outputSubDir = "grpc"
                }
            }
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
