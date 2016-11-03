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
package com.bugvm.apple.glkit;

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
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.opengles.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public enum /*<name>*/GLKTextureLoaderErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    FileOrURLNotFound(0L),
    InvalidNSData(1L),
    InvalidCGImage(2L),
    UnknownPathType(3L),
    UnknownFileType(4L),
    PVRAtlasUnsupported(5L),
    CubeMapInvalidNumFiles(6L),
    CompressedTextureUpload(7L),
    UncompressedTextureUpload(8L),
    UnsupportedCubeMapDimensions(9L),
    UnsupportedBitDepth(10L),
    UnsupportedPVRFormat(11L),
    DataPreprocessingFailure(12L),
    MipmapUnsupported(13L),
    UnsupportedOrientation(14L),
    ReorientationFailure(15L),
    AlphaPremultiplicationFailure(16L),
    InvalidEAGLContext(17L),
    IncompatibleFormatSRGB(18L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/GLKTextureLoaderErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GLKTextureLoaderErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GLKTextureLoaderErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/GLKTextureLoaderErrorCode/*</name>*/.class.getName());
    }
}