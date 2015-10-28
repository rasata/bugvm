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
public final class /*<name>*/NSFileVersionReplacingOptions/*</name>*/ extends Bits</*<name>*/NSFileVersionReplacingOptions/*</name>*/> {
    /*<values>*/
    public static final NSFileVersionReplacingOptions None = new NSFileVersionReplacingOptions(0L);
    public static final NSFileVersionReplacingOptions ByMoving = new NSFileVersionReplacingOptions(1L);
    /*</values>*/

    private static final /*<name>*/NSFileVersionReplacingOptions/*</name>*/[] values = _values(/*<name>*/NSFileVersionReplacingOptions/*</name>*/.class);

    public /*<name>*/NSFileVersionReplacingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFileVersionReplacingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFileVersionReplacingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFileVersionReplacingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFileVersionReplacingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFileVersionReplacingOptions/*</name>*/[] values() {
        return values.clone();
    }
}
