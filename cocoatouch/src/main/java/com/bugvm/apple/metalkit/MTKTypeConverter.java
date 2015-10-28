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
package com.bugvm.apple.metalkit;

/*<imports>*/
import com.bugvm.apple.foundation.CocoaUtility;
import com.bugvm.apple.metal.MTLVertexDescriptor;
import com.bugvm.apple.metal.MTLVertexFormat;
import com.bugvm.apple.modelio.MDLVertexDescriptor;
import com.bugvm.apple.modelio.MDLVertexFormat;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MetalKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTKTypeConverter/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(MTKTypeConverter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="MTKModelIOVertexDescriptorFromMetal", optional=true)
    public static native MDLVertexDescriptor convertVertexDescriptor(MTLVertexDescriptor metalDescriptor);
    @Bridge(symbol="MTKMetalVertexDescriptorFromModelIO", optional=true)
    public static native MTLVertexDescriptor convertVertexDescriptor(MDLVertexDescriptor modelIODescriptor);
    @Bridge(symbol="MTKModelIOVertexFormatFromMetal", optional=true)
    public static native MDLVertexFormat convertVertexFormat(MTLVertexFormat vertexFormat);
    @Bridge(symbol="MTKMetalVertexFormatFromModelIO", optional=true)
    public static native MTLVertexFormat convertVertexFormat(MDLVertexFormat vertexFormat);
    /*</methods>*/
}
