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
package com.bugvm.apple.avkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSError;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVKitError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/
    /*<implements>*//*</implements>*/ {

    protected AVKitError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/public static class AVKitErrorPtr extends Ptr<AVKitError, AVKitErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(AVKitError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Override
    public AVKitErrorCode getErrorCode() {
        try {
            return AVKitErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="AVKitErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
