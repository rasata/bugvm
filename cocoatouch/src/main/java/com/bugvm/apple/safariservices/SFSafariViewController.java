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
package com.bugvm.apple.safariservices;

/*<imports>*/

import com.bugvm.apple.foundation.NSBundle;
import com.bugvm.apple.foundation.NSCoder;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.apple.uikit.UIViewController;
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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SafariServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSafariViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSafariViewControllerPtr extends Ptr<SFSafariViewController, SFSafariViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSafariViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SFSafariViewController() {}
    protected SFSafariViewController(NSObject.SkipInit skipInit) { super(skipInit); }
    public SFSafariViewController(NSCoder aDecoder) { super((NSObject.SkipInit) null); initObject(init(aDecoder)); }
    public SFSafariViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((NSObject.SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    public SFSafariViewController(NSURL URL, boolean entersReaderIfAvailable) { super((NSObject.SkipInit) null); initObject(init(URL, entersReaderIfAvailable)); }
    public SFSafariViewController(NSURL URL) { super((NSObject.SkipInit) null); initObject(init(URL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SFSafariViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SFSafariViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithURL:entersReaderIfAvailable:")
    protected native @Pointer long init(NSURL URL, boolean entersReaderIfAvailable);
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    /*</methods>*/
}
