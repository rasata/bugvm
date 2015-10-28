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
package com.bugvm.apple.coremedia;

import com.bugvm.apple.corefoundation.CFComparisonResult;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;

public class CMBufferQueueCallbacksAdapter implements CMBufferQueueCallbacks {
    
    @Override
    public CMTime getDecodeTimeStamp(CMBuffer buffer) {
        return null;
    }
    @Override
    public CMTime getPresentationTimeStamp(CMBuffer buffer) {
        return null;
    }
    @Override
    public CMTime getDuration(CMBuffer buffer) {
        return null;
    }
    @Override
    public boolean isDataReady(CMBuffer buffer) {
        return false;
    }
    @Override   
    public CFComparisonResult compare(CMBuffer buffer1, CMBuffer buffer2) {
        return null;
    }
    @Override
    public int getSize(CMBuffer buffer) {
        return 0;
    }
    
}
