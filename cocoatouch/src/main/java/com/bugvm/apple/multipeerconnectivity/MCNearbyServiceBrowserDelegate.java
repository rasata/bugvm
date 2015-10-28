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
import com.bugvm.apple.foundation.NSError;
import com.bugvm.apple.foundation.NSObjectProtocol;
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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MCNearbyServiceBrowserDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "browser:foundPeer:withDiscoveryInfo:")
    void foundPeer(MCNearbyServiceBrowser browser, MCPeerID peerID, @com.bugvm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> info);
    @Method(selector = "browser:lostPeer:")
    void lostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID);
    @Method(selector = "browser:didNotStartBrowsingForPeers:")
    void didNotStartBrowsing(MCNearbyServiceBrowser browser, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
