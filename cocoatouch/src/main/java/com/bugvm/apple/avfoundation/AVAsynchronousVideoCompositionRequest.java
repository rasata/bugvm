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
import java.util.*;

import com.bugvm.apple.coremedia.CMTime;
import com.bugvm.apple.corevideo.CVPixelBuffer;
import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSError;
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
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAsynchronousVideoCompositionRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAsynchronousVideoCompositionRequestPtr extends Ptr<AVAsynchronousVideoCompositionRequest, AVAsynchronousVideoCompositionRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAsynchronousVideoCompositionRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAsynchronousVideoCompositionRequest() {}
    protected AVAsynchronousVideoCompositionRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "renderContext")
    public native AVVideoCompositionRenderContext getRenderContext();
    @Property(selector = "compositionTime")
    public native @ByVal
    CMTime getCompositionTime();
    @Property(selector = "sourceTrackIDs")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSourceTrackIDs();
    @Property(selector = "videoCompositionInstruction")
    public native AVVideoCompositionInstruction getVideoCompositionInstruction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @WeaklyLinked
    @Method(selector = "sourceFrameByTrackID:")
    public native CVPixelBuffer getSourceFrame(int trackID);
    @WeaklyLinked
    @Method(selector = "finishWithComposedVideoFrame:")
    public native void finish(CVPixelBuffer composedVideoFrame);
    @Method(selector = "finishWithError:")
    public native void finish(NSError error);
    @Method(selector = "finishCancelledRequest")
    public native void finishCancelledRequest();
    /*</methods>*/
}
