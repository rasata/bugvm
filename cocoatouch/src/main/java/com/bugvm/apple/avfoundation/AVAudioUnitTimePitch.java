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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioUnitTimePitch/*</name>*/ 
    extends /*<extends>*/AVAudioUnitTimeEffect/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioUnitTimePitchPtr extends Ptr<AVAudioUnitTimePitch, AVAudioUnitTimePitchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioUnitTimePitch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioUnitTimePitch() {}
    protected AVAudioUnitTimePitch(NSObject.SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    @Property(selector = "pitch")
    public native float getPitch();
    @Property(selector = "setPitch:")
    public native void setPitch(float v);
    @Property(selector = "overlap")
    public native float getOverlap();
    @Property(selector = "setOverlap:")
    public native void setOverlap(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
