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
package com.bugvm.apple.avfoundation;

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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AVAudioUnitEQFilterType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Parametric(0L),
    LowPass(1L),
    HighPass(2L),
    ResonantLowPass(3L),
    ResonantHighPass(4L),
    BandPass(5L),
    BandStop(6L),
    LowShelf(7L),
    HighShelf(8L),
    ResonantLowShelf(9L),
    ResonantHighShelf(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AVAudioUnitEQFilterType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AVAudioUnitEQFilterType/*</name>*/ valueOf(long n) {
        for (/*<name>*/AVAudioUnitEQFilterType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AVAudioUnitEQFilterType/*</name>*/.class.getName());
    }
}
