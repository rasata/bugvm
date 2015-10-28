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
import java.util.*;

import com.bugvm.objc.annotation.NotImplemented;
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSKeyedUnarchiverDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSKeyedUnarchiverDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("unarchiver:cannotDecodeObjectOfClassName:originalClasses:")
    public Class<? extends NSObject> cannotDecodeObjectOfClassName(NSKeyedUnarchiver unarchiver, String name, @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> classNames) { return null; }
    @NotImplemented("unarchiver:didDecodeObject:")
    public NSObject didDecodeObject(NSKeyedUnarchiver unarchiver, NSObject object) { return null; }
    @NotImplemented("unarchiver:willReplaceObject:withObject:")
    public void willReplaceObject(NSKeyedUnarchiver unarchiver, NSObject object, NSObject newObject) {}
    @NotImplemented("unarchiverWillFinish:")
    public void willFinish(NSKeyedUnarchiver unarchiver) {}
    @NotImplemented("unarchiverDidFinish:")
    public void didFinish(NSKeyedUnarchiver unarchiver) {}
    /*</methods>*/
}
