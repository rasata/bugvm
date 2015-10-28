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
package com.bugvm.apple.safariservices;

/*<imports>*/

import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.block.VoidBlock1;
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
/*<annotations>*/@Library("SafariServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFContentBlockerManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFContentBlockerManagerPtr extends Ptr<SFContentBlockerManager, SFContentBlockerManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFContentBlockerManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFContentBlockerManager() {}
    protected SFContentBlockerManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadContentBlockerWithIdentifier:completionHandler:")
    public static native void reloadContentBlocker(String identifier, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
