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

import com.bugvm.apple.audiounit.AudioComponentDescription;
import com.bugvm.apple.audiounit.AudioUnit;
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSErrorException;
import com.bugvm.apple.foundation.NSURL;
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioUnit/*</name>*/ 
    extends /*<extends>*/AVAudioNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioUnitPtr extends Ptr<AVAudioUnit, AVAudioUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioUnit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioUnit() {}
    protected AVAudioUnit(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "audioComponentDescription")
    public native @ByVal
    AudioComponentDescription getAudioComponentDescription();
    @WeaklyLinked
    @Property(selector = "audioUnit")
    public native AudioUnit getAudioUnit();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "manufacturerName")
    public native String getManufacturerName();
    @Property(selector = "version")
    public native @MachineSizedUInt long getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean loadAudioUnitPreset(NSURL url) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = loadAudioUnitPreset(url, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "loadAudioUnitPresetAtURL:error:")
    private native boolean loadAudioUnitPreset(NSURL url, NSError.NSErrorPtr outError);
    /*</methods>*/
}
