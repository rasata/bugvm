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
package com.bugvm.apple.coremedia;

/*<imports>*/
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/CMFormatDescriptionBridgeErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    InvalidParameter(-12712L),
    AllocationFailed(-12713L),
    InvalidSerializedSampleDescription(-12714L),
    InvalidFormatDescription(-12715L),
    IncompatibleFormatDescription(-12716L),
    UnsupportedSampleDescriptionFlavor(-12717L),
    InvalidSlice(-12719L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CMFormatDescriptionBridgeErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CMFormatDescriptionBridgeErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/CMFormatDescriptionBridgeErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CMFormatDescriptionBridgeErrorCode/*</name>*/.class.getName());
    }
}
