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

import com.bugvm.apple.coregraphics.CGSize;
import com.bugvm.apple.foundation.NSArray;
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
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVComposition/*</name>*/ 
    extends /*<extends>*/AVAsset/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCompositionPtr extends Ptr<AVComposition, AVCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVComposition() {}
    protected AVComposition(long handle) { super(handle); }
    protected AVComposition(NSObject.SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tracks")
    public native NSArray<AVAssetTrack> getTracks();
    @Property(selector = "naturalSize")
    public native @ByVal
    CGSize getNaturalSize();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "URLAssetInitializationOptions")
    public native AVURLAssetOptions getURLAssetInitializationOptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackWithTrackID:")
    public native AVCompositionTrack getTrack(int trackID);
    @Method(selector = "tracksWithMediaType:")
    public native NSArray<AVCompositionTrack> getTracksForMediaType(AVMediaType mediaType);
    @Method(selector = "tracksWithMediaCharacteristic:")
    public native NSArray<AVCompositionTrack> getTracksForMediaCharacteristic(AVMediaCharacteristic mediaCharacteristic);
    /*</methods>*/
}
