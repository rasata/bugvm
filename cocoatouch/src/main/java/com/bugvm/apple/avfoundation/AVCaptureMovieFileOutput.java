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

import com.bugvm.apple.coremedia.CMTime;
import com.bugvm.apple.foundation.NSArray;
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureMovieFileOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureFileOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureMovieFileOutputPtr extends Ptr<AVCaptureMovieFileOutput, AVCaptureMovieFileOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureMovieFileOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureMovieFileOutput() {}
    protected AVCaptureMovieFileOutput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "movieFragmentInterval")
    public native @ByVal
    CMTime getMovieFragmentInterval();
    @Property(selector = "setMovieFragmentInterval:")
    public native void setMovieFragmentInterval(@ByVal CMTime v);
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "recordsVideoOrientationAndMirroringChangesAsMetadataTrackForConnection:")
    public native boolean recordsVideoOrientationAndMirroringChangesAsMetadataTrack(AVCaptureConnection connection);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setRecordsVideoOrientationAndMirroringChanges:asMetadataTrackForConnection:")
    public native void setRecordsVideoOrientationAndMirroringChangesAsMetadataTrack(boolean doRecordChanges, AVCaptureConnection connection);
    /*</methods>*/
}
