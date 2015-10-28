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

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.Block1;
import com.bugvm.objc.block.VoidBlock2;
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
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHContentEditingInputRequestOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHContentEditingInputRequestOptionsPtr extends Ptr<PHContentEditingInputRequestOptions, PHContentEditingInputRequestOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHContentEditingInputRequestOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHContentEditingInputRequestOptions() {}
    protected PHContentEditingInputRequestOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canHandleAdjustmentData")
    public native @Block
    Block1<PHAdjustmentData, Boolean> getCanHandleAdjustmentData();
    @Property(selector = "setCanHandleAdjustmentData:")
    public native void setCanHandleAdjustmentData(@Block Block1<PHAdjustmentData, Boolean> v);
    @Property(selector = "isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();
    @Property(selector = "setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean v);
    @Property(selector = "progressHandler")
    public native @Block
    VoidBlock2<Double, BooleanPtr> getProgressHandler();
    @Property(selector = "setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock2<Double, BooleanPtr> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
