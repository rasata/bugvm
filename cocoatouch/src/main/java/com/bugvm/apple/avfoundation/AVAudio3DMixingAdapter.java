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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudio3DMixingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/
    /*<implements>*/implements AVAudio3DMixing/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("renderingAlgorithm")
    public AVAudio3DMixingRenderingAlgorithm getRenderingAlgorithm() { return null; }
    @NotImplemented("setRenderingAlgorithm:")
    public void setRenderingAlgorithm(AVAudio3DMixingRenderingAlgorithm v) {}
    @NotImplemented("rate")
    public float getRate() { return 0; }
    @NotImplemented("setRate:")
    public void setRate(float v) {}
    @NotImplemented("reverbBlend")
    public float getReverbBlend() { return 0; }
    @NotImplemented("setReverbBlend:")
    public void setReverbBlend(float v) {}
    @NotImplemented("obstruction")
    public float getObstruction() { return 0; }
    @NotImplemented("setObstruction:")
    public void setObstruction(float v) {}
    @NotImplemented("occlusion")
    public float getOcclusion() { return 0; }
    @NotImplemented("setOcclusion:")
    public void setOcclusion(float v) {}
    @NotImplemented("position")
    public @ByVal AVAudio3DPoint getPosition() { return null; }
    @NotImplemented("setPosition:")
    public void setPosition(@ByVal AVAudio3DPoint v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
