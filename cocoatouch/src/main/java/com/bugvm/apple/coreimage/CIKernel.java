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
package com.bugvm.apple.coreimage;

/*<imports>*/

import com.bugvm.apple.coregraphics.CGRect;
import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.block.Block2;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIKernel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIKernelPtr extends Ptr<CIKernel, CIKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIKernel() {}
    protected CIKernel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "applyWithExtent:roiCallback:arguments:")
    public native CIImage apply(@ByVal CGRect extent, @Block("@ByVal (,@ByVal)") Block2<Integer, CGRect, CGRect> callback, NSArray<?> args);
    @Method(selector = "kernelsWithString:")
    public static native NSArray<CIKernel> createKernels(String s);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "kernelWithString:")
    public static native CIKernel create(String string);
    /*</methods>*/
}
