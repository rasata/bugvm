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
import java.util.*;

import com.bugvm.apple.coremedia.CMSampleBuffer;
import com.bugvm.apple.coremedia.CMTime;
import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSAttributedString;
import com.bugvm.objc.annotation.Method;
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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVPlayerItemLegibleOutputPushDelegate/*</name>*/ 
    /*<implements>*/extends AVPlayerItemOutputPushDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "legibleOutput:didOutputAttributedStrings:nativeSampleBuffers:forItemTime:")
    void didOutputAttributedStrings(AVPlayerItemLegibleOutput output, NSArray<NSAttributedString> strings, @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<CMSampleBuffer> nativeSamples, @ByVal CMTime itemTime);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
