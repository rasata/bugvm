/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bugvm.libimobiledevice.binding;

public class StringOut {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StringOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_StringOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getValue() {
    return LibIMobileDeviceJNI.StringOut_value_get(swigCPtr, this);
  }

  public StringOut() {
    this(LibIMobileDeviceJNI.new_StringOut(), true);
  }

}
