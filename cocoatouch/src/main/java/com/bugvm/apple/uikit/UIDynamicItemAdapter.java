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

import com.bugvm.apple.coregraphics.CGAffineTransform;
import com.bugvm.apple.coregraphics.CGPoint;
import com.bugvm.apple.coregraphics.CGRect;
import com.bugvm.apple.foundation.NSObject;
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDynamicItemAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements UIDynamicItem/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("center")
    public @ByVal
    CGPoint getCenter() { return null; }
    @NotImplemented("setCenter:")
    public void setCenter(@ByVal CGPoint v) {}
    @NotImplemented("bounds")
    public @ByVal
    CGRect getBounds() { return null; }
    @NotImplemented("transform")
    public @ByVal
    CGAffineTransform getTransform() { return null; }
    @NotImplemented("setTransform:")
    public void setTransform(@ByVal CGAffineTransform v) {}
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collisionBoundsType")
    public UIDynamicItemCollisionBoundsType getCollisionBoundsType() { return null; }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @NotImplemented("collisionBoundingPath")
    public UIBezierPath getCollisionBoundingPath() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
