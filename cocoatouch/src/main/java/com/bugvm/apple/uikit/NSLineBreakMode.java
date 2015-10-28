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
package com.bugvm.apple.uikit;

/*<imports>*/
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/NSLineBreakMode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    WordWrapping(0L),
    CharWrapping(1L),
    Clipping(2L),
    TruncatingHead(3L),
    TruncatingTail(4L),
    TruncatingMiddle(5L);
    /*</values>*/

    private final long n;

    private /*<name>*/NSLineBreakMode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/NSLineBreakMode/*</name>*/ valueOf(long n) {
        for (/*<name>*/NSLineBreakMode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/NSLineBreakMode/*</name>*/.class.getName());
    }
}
