package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface AndroidApplicationInfoOrBuilder extends MessageLiteOrBuilder {
    String getPackageName();

    ByteString getPackageNameBytes();

    String getSdkVersion();

    ByteString getSdkVersionBytes();

    String getVersionName();

    ByteString getVersionNameBytes();

    boolean hasPackageName();

    boolean hasSdkVersion();

    boolean hasVersionName();
}
