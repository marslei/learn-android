cmake_minimum_required(VERSION 3.4.1)

AUX_SOURCE_DIRECTORY(. SRC_LIST)
ADD_LIBRARY(
        native_lib
        SHARED
#        src/main/cpp/native_lib.c
        ${SRC_LIST}
)

FIND_LIBRARY(
        log-lib
        log
)

TARGET_LINK_LIBRARIES(
        native_lib
        ${log-lib}
)
SET_TARGET_PROPERTIES(native_lib PROPERTIES LINKER_LANGUAGE C)

