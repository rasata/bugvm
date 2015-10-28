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

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UITableViewCellSelectionStyle/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    Blue(1L),
    Gray(2L),
    /**
     * @since Available in iOS 7.0 and later.
     */
    Default(3L);
    /*</values>*/

    private final long n;

    private /*<name>*/UITableViewCellSelectionStyle/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UITableViewCellSelectionStyle/*</name>*/ valueOf(long n) {
        for (/*<name>*/UITableViewCellSelectionStyle/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UITableViewCellSelectionStyle/*</name>*/.class.getName());
    }
}
