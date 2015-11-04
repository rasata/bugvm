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
package com.bugvm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSURLSessionDataDelegate/*</name>*/ 
    /*<implements>*/extends NSURLSessionTaskDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "URLSession:dataTask:didReceiveResponse:completionHandler:")
    void didReceiveResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSURLResponse response, @Block VoidBlock1<NSURLSessionResponseDisposition> completionHandler);
    @Method(selector = "URLSession:dataTask:didBecomeDownloadTask:")
    void didBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask);
    @Method(selector = "URLSession:dataTask:didBecomeStreamTask:")
    void didBecomeStreamTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionStreamTask streamTask);
    @Method(selector = "URLSession:dataTask:didReceiveData:")
    void didReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data);
    @Method(selector = "URLSession:dataTask:willCacheResponse:completionHandler:")
    void willCacheResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse, @Block VoidBlock1<NSCachedURLResponse> completionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}