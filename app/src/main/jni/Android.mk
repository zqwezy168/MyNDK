LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := myJni
LOCAL_SRC_FILES := jnituil3.c

include $(BUILD_SHARED_LIBRARY)
