//
// Created by zy on 2020/3/24.
//

#include "zy_myndk_JniUtil.h"

JNIEXPORT jint JNICALL Java_zy_myndk_JniUtil_add
  (JNIEnv *env, jobject obj, jint a, jint b){
  return a+b;
  }