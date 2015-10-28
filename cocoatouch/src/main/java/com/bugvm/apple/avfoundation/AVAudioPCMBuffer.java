/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.avfoundation;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioPCMBuffer/*</name>*/ 
    extends /*<extends>*/AVAudioBuffer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioPCMBufferPtr extends Ptr<AVAudioPCMBuffer, AVAudioPCMBufferPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioPCMBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioPCMBuffer() {}
    protected AVAudioPCMBuffer(NSObject.SkipInit skipInit) { super(skipInit); }
    public AVAudioPCMBuffer(AVAudioFormat format, int frameCapacity) { super((NSObject.SkipInit) null); initObject(init(format, frameCapacity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frameCapacity")
    public native int getFrameCapacity();
    @Property(selector = "frameLength")
    public native int getFrameLength();
    @Property(selector = "setFrameLength:")
    public native void setFrameLength(int v);
    @Property(selector = "stride")
    public native @MachineSizedUInt long getStride();
    @Property(selector = "floatChannelData")
    public native FloatPtr.FloatPtrPtr getFloatChannelData();
    @Property(selector = "int16ChannelData")
    public native ShortPtr.ShortPtrPtr getInt16ChannelData();
    @Property(selector = "int32ChannelData")
    public native IntPtr.IntPtrPtr getInt32ChannelData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPCMFormat:frameCapacity:")
    protected native @Pointer long init(AVAudioFormat format, int frameCapacity);
    /*</methods>*/
}
