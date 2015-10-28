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
package com.bugvm.apple.photos;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.NSData;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAssetCreationRequest/*</name>*/ 
    extends /*<extends>*/PHAssetChangeRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAssetCreationRequestPtr extends Ptr<PHAssetCreationRequest, PHAssetCreationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAssetCreationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHAssetCreationRequest(NSObject.SkipInit skipInit) { super(skipInit); }
    public PHAssetCreationRequest() { super(create()); NSObject.retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addResourceWithType:fileURL:options:")
    public native void addResource(PHAssetResourceType type, NSURL fileURL, PHAssetResourceCreationOptions options);
    @Method(selector = "addResourceWithType:data:options:")
    public native void addResource(PHAssetResourceType type, NSData data, PHAssetResourceCreationOptions options);
    @Method(selector = "creationRequestForAsset")
    protected static native @Pointer long create();
    @Method(selector = "supportsAssetResourceTypes:")
    public static native boolean supportsAssetResourceTypes(@com.bugvm.rt.bro.annotation.Marshaler(PHAssetResourceType.AsListMarshaler.class) List<PHAssetResourceType> types);
    /*</methods>*/
}
