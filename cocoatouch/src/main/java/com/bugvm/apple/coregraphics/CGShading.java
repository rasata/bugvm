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
package com.bugvm.apple.coregraphics;

/*<imports>*/
import com.bugvm.apple.corefoundation.CFType;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGShading/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGShadingPtr extends Ptr<CGShading, CGShadingPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGShading.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGShading() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="CGShadingGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="CGShadingCreateAxial", optional=true)
    public static native @com.bugvm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGShading createAxial(CGColorSpace space, @ByVal CGPoint start, @ByVal CGPoint end, CGFunction function, boolean extendStart, boolean extendEnd);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Bridge(symbol="CGShadingCreateRadial", optional=true)
    public static native @com.bugvm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGShading createRadial(CGColorSpace space, @ByVal CGPoint start, @MachineSizedFloat double startRadius, @ByVal CGPoint end, @MachineSizedFloat double endRadius, CGFunction function, boolean extendStart, boolean extendEnd);
    /*</methods>*/
}
