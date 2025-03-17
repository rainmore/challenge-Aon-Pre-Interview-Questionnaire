import org.gradle.api.tasks.wrapper.Wrapper

plugins {
    id("idea")
    id("java")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
        vendor.set(JvmVendorSpec.ADOPTIUM)
        implementation.set(JvmImplementation.VENDOR_SPECIFIC)
    }
}

configurations {
    all {
        exclude("org.apache.logging.log4j:*")
    }
}

dependencies {
    implementation("org.apache.commons:commons-lang3:${project.properties["commons-lang3.version"]}")
    testImplementation(platform("org.junit:junit-bom:${project.properties["junit-bom.version"]}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Wrapper>("wrapper").configure {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = project.properties["gradle.version"] as String
}

tasks.withType<Test> {
    useJUnitPlatform {
        testLogging {
            events("passed", "skipped", "failed", "standard_error")
        }
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}
