cmake_minimum_required(VERSION 3.4.1)

add_library(
        native_lib
        SHARED
        src/main/cpp/native_lib.c
)

find_library(
        log-lib
        log
)

target_link_libraries(
        native_lib
        ${log-lib}
)
SET_TARGET_PROPERTIES(native_lib PROPERTIES LINKER_LANGUAGE C)

