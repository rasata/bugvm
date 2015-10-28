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
import com.bugvm.apple.foundation.NSObjectProtocol;
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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIDynamicItem/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "center")
    @ByVal
    CGPoint getCenter();
    @Property(selector = "setCenter:")
    void setCenter(@ByVal CGPoint v);
    @Property(selector = "bounds")
    @ByVal
    CGRect getBounds();
    @Property(selector = "transform")
    @ByVal
    CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    void setTransform(@ByVal CGAffineTransform v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundsType")
    UIDynamicItemCollisionBoundsType getCollisionBoundsType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundingPath")
    UIBezierPath getCollisionBoundingPath();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
