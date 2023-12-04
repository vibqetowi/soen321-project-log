package com.google.api;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface JwtLocationOrBuilder extends MessageOrBuilder {
    String getHeader();

    ByteString getHeaderBytes();

    JwtLocation.InCase getInCase();

    String getQuery();

    ByteString getQueryBytes();

    String getValuePrefix();

    ByteString getValuePrefixBytes();
}
