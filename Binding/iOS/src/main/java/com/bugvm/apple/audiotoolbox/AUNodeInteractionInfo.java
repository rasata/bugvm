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
package com.bugvm.apple.audiotoolbox;

import com.bugvm.rt.bro.Struct;
import com.bugvm.rt.bro.annotation.ByVal;
import com.bugvm.rt.bro.annotation.StructMember;

public class AUNodeInteractionInfo extends Struct<AUNodeInteractionInfo> {

    public AUNodeInteractionInfo() {}
    public AUNodeInteractionInfo(AUNodeConnection connection, AUNodeRenderCallback inputCallback) {
        this.setConnection(connection);
        this.setInputCallback(inputCallback);
    }
    
    @StructMember(0) public native @ByVal AUNodeConnection getConnection();
    @StructMember(0) public native AUNodeInteractionInfo setConnection(@ByVal AUNodeConnection connection);
    
    @StructMember(0) public native @ByVal AUNodeRenderCallback getInputCallback();
    @StructMember(0) public native AUNodeInteractionInfo setInputCallback(@ByVal AUNodeRenderCallback inputCallback);
}
