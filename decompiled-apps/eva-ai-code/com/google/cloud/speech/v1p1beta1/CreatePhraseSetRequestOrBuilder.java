package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface CreatePhraseSetRequestOrBuilder extends MessageOrBuilder {
    String getParent();

    ByteString getParentBytes();

    PhraseSet getPhraseSet();

    String getPhraseSetId();

    ByteString getPhraseSetIdBytes();

    PhraseSetOrBuilder getPhraseSetOrBuilder();

    boolean hasPhraseSet();
}
