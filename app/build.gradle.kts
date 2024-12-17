plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.studentportal"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.studentportal"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    implementation("com.google.firebase:firebase-common:21.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation(platform("com.google.firebase:firebase-bom:33.2.0"))
    implementation("com.google.firebase:firebase-analytics")

    implementation("com.google.firebase:firebase-auth:22.1.0")
    implementation("com.google.firebase:firebase-database:20.2.1")
    implementation ("com.google.firebase:firebase-storage:20.0.0")

    implementation("com.mikhaellopez:circularimageview:4.3.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation ("com.applandeo:material-calendar-view:1.9.0-rc03")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")


    implementation ("com.github.SeptiawanAjiP:Android-DataTable:1.2.0")
    implementation ("com.google.code.gson:gson:2.10.1")

    annotationProcessor ("com.github.bumptech.glide:compiler:4.13.0")
    implementation ("com.github.bumptech.glide:glide:4.13.0")
    // https://mvnrepository.com/artifact/mysql/mysql-connector-java
    implementation ("mysql:mysql-connector-java:5.1.49")









}