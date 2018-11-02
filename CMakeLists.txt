cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

set(CMAKE_ARCHIVE_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)
set(LIBRARY_OUTPUT_PATH ${CMAKE_SOURCE_DIR}/lib)

add_library( # Sets the name of the library.
        dashjbls

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        src/cpp/bls-signature-wrapper.cpp)

add_library( # Sets the name of the library.
        dashjblssimple

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        src/cpp/org_dash_bls_DashBlsJni.cpp
)

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

include_directories(/usr/lib/jvm/java-8-oracle/include
					/usr/lib/jvm/java-8-oracle/include/linux
					${CMAKE_SOURCE_DIR}/src
					${CMAKE_SOURCE_DIR}/src/bls-signatures/src
					${CMAKE_SOURCE_DIR}/src/bls-signatures/build/contrib/relic/include
					${CMAKE_SOURCE_DIR}/src/bls-signatures/contrib/relic/include
)
# these find libraries were not working with cygwin
find_library( # Sets the name of the path variable.
        bls-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        ${CMAKE_SOURCE_DIR}/src/bls-signatures/build/libbls.a
		NO_DEFAULT_PATH)
		
find_library( # Sets the name of the path variable.
        bls-lib2 NAME bls PATH 

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        ${CMAKE_SOURCE_DIR}/src/bls-signatures/build/libbls.a
		NO_DEFAULT_PATH)
# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
        dashjbls

        # Links the target library to the log library
        # included in the NDK.
        ${CMAKE_SOURCE_DIR}/src/bls-signatures/build/libbls.a)

target_link_libraries( # Specifies the target library.
        dashjblssimple

        # Links the target library to the log library
        # included in the NDK.
        ${CMAKE_SOURCE_DIR}/src/bls-signatures/build/libbls.a)