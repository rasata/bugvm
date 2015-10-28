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
package com.bugvm.apple.watchkit;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.coregraphics.CGRect;
import com.bugvm.apple.foundation.NSData;
import com.bugvm.apple.foundation.NSDictionary;
import com.bugvm.apple.foundation.NSNumber;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.apple.uikit.UIContentSizeCategory;
import com.bugvm.apple.uikit.UIImage;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("WatchKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKInterfaceDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKInterfaceDevicePtr extends Ptr<WKInterfaceDevice, WKInterfaceDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKInterfaceDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKInterfaceDevice() {}
    protected WKInterfaceDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "screenBounds")
    public native @ByVal
    CGRect getScreenBounds();
    @Property(selector = "screenScale")
    public native @MachineSizedFloat double getScreenScale();
    @Property(selector = "preferredContentSizeCategory")
    public native UIContentSizeCategory getPreferredContentSizeCategory();
    @Property(selector = "cachedImages")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringMapMarshaler.class) Map<String, NSNumber> getCachedImages();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addCachedImage:name:")
    public native boolean addCachedImage(UIImage image, String name);
    @Method(selector = "addCachedImageWithData:name:")
    public native boolean addCachedImage(NSData imageData, String name);
    @Method(selector = "removeCachedImageWithName:")
    public native void removeCachedImage(String name);
    @Method(selector = "removeAllCachedImages")
    public native void removeAllCachedImages();
    @Method(selector = "currentDevice")
    public static native WKInterfaceDevice getCurrentDevice();
    /*</methods>*/
}
