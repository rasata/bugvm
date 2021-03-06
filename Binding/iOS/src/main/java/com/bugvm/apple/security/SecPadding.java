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
package com.bugvm.apple.security;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/SecPadding/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    PKCS1(1L),
    OAEP(2L),
    SigRaw(16384L),
    PKCS1MD2(32768L),
    PKCS1MD5(32769L),
    PKCS1SHA1(32770L),
    PKCS1SHA224(32771L),
    PKCS1SHA256(32772L),
    PKCS1SHA384(32773L),
    PKCS1SHA512(32774L);
    /*</values>*/

    private final long n;

    private /*<name>*/SecPadding/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SecPadding/*</name>*/ valueOf(long n) {
        for (/*<name>*/SecPadding/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SecPadding/*</name>*/.class.getName());
    }
}
