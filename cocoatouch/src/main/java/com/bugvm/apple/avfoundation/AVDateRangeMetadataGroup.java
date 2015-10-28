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

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSDate;
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
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVDateRangeMetadataGroup/*</name>*/ 
    extends /*<extends>*/AVMetadataGroup/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVDateRangeMetadataGroupPtr extends Ptr<AVDateRangeMetadataGroup, AVDateRangeMetadataGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVDateRangeMetadataGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVDateRangeMetadataGroup() {}
    protected AVDateRangeMetadataGroup(SkipInit skipInit) { super(skipInit); }
    public AVDateRangeMetadataGroup(NSArray<AVMetadataItem> items, NSDate startDate, NSDate endDate) { super((SkipInit) null); initObject(init(items, startDate, endDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "items")
    public native NSArray<AVMetadataItem> getItems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:startDate:endDate:")
    protected native @Pointer long init(NSArray<AVMetadataItem> items, NSDate startDate, NSDate endDate);
    /*</methods>*/
}
