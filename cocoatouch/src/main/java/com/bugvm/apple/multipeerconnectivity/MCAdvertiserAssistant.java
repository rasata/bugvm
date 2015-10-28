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
package com.bugvm.apple.multipeerconnectivity;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.NSDictionary;
import com.bugvm.apple.foundation.NSObject;
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
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MultipeerConnectivity") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MCAdvertiserAssistant/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MCAdvertiserAssistantPtr extends Ptr<MCAdvertiserAssistant, MCAdvertiserAssistantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MCAdvertiserAssistant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MCAdvertiserAssistant() {}
    protected MCAdvertiserAssistant(SkipInit skipInit) { super(skipInit); }
    public MCAdvertiserAssistant(String serviceType, @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> info, MCSession session) { super((SkipInit) null); initObject(init(serviceType, info, session)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MCAdvertiserAssistantDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MCAdvertiserAssistantDelegate v);
    @Property(selector = "session")
    public native MCSession getSession();
    @Property(selector = "discoveryInfo")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getDiscoveryInfo();
    @Property(selector = "serviceType")
    public native String getServiceType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceType:discoveryInfo:session:")
    protected native @Pointer long init(String serviceType, @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> info, MCSession session);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "stop")
    public native void stop();
    /*</methods>*/
}
