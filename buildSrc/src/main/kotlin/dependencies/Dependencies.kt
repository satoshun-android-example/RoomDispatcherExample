package dependencies

const val COMPILE_SDK = 28
const val MIN_SDK = 21
const val TARGET_SDK = 28

private const val VKOTLIN = "1.3.20"
private const val VCOUROUTINE = "1.1.0"

const val ANDROID_PLUGIN = "com.android.tools.build:gradle:3.5.0-alpha02"
const val KOTLIN_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VKOTLIN"
const val VERSIONS_PLUGIN = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:$VKOTLIN"
const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VCOUROUTINE"
const val UI_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VCOUROUTINE"

const val KTX = "androidx.core:core-ktx:1.0.1"

const val APPCOMPAT = "androidx.appcompat:appcompat:1.0.2"
const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:1.0.0"
const val CONSTRAINTLAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-alpha3"
const val CARDVIEW = "androidx.cardview:cardview:1.0.0"

const val ACTIVITYX = "androidx.activity:activity-ktx:1.0.0-alpha03"
const val FRAGMENTX = "androidx.fragment:fragment-ktx:1.1.0-alpha03"

const val MATERIAL = "com.google.android.material:material:1.0.0"
const val COORDINATORLAYOUT = "androidx.coordinatorlayout:coordinatorlayout:1.0.0"

const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata:2.0.0"
const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:2.0.0"
const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.0.0"

private const val VDAGGER = "2.21"
const val DAGGER = "com.google.dagger:dagger:$VDAGGER"
const val DAGGER_PROCESSOR = "com.google.dagger:dagger-compiler:$VDAGGER"
const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$VDAGGER"
const val DAGGER_ANDROID_PROCESSOR = "com.google.dagger:dagger-android-processor:$VDAGGER"
const val DAGGER_ANDROID_SUPPORT = "com.google.dagger:dagger-android-support:$VDAGGER"

private const val VROOM = "2.1.0-alpha03"
const val ROOM_COMMON = "androidx.room:room-common:$VROOM"
const val ROOM_RUNTIME = "androidx.room:room-runtime:$VROOM"
const val ROOM_COROUTINES = "androidx.room:room-coroutines:$VROOM"
const val ROOM_COMPILER = "androidx.room:room-compiler:$VROOM"

const val JUNIT = "junit:junit:4.12"
const val TRUTH = "com.google.truth:truth:0.42"
const val TEST_RULES = "androidx.test:rules:1.1.0"
const val TEST_RUNNER = "androidx.test:runner:1.1.0"
const val TEST_JUNIT_RULES = "androidx.test.ext:junit:1.0.0"
const val MOCKITO_KOTLIN = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.0"
const val ROBOLECTRIC = "org.robolectric:robolectric:4.1"
