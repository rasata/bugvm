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
package com.bugvm.apple.foundation;

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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSBinarySearchingOptions/*</name>*/ extends Bits</*<name>*/NSBinarySearchingOptions/*</name>*/> {
    /*<values>*/
    public static final NSBinarySearchingOptions None = new NSBinarySearchingOptions(0L);
    public static final NSBinarySearchingOptions FirstEqual = new NSBinarySearchingOptions(256L);
    public static final NSBinarySearchingOptions LastEqual = new NSBinarySearchingOptions(512L);
    public static final NSBinarySearchingOptions InsertionIndex = new NSBinarySearchingOptions(1024L);
    /*</values>*/

    private static final /*<name>*/NSBinarySearchingOptions/*</name>*/[] values = _values(/*<name>*/NSBinarySearchingOptions/*</name>*/.class);

    public /*<name>*/NSBinarySearchingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSBinarySearchingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSBinarySearchingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSBinarySearchingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSBinarySearchingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSBinarySearchingOptions/*</name>*/[] values() {
        return values.clone();
    }
}
