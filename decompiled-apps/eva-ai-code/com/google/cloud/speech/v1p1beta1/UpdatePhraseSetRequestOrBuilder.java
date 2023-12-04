package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface UpdatePhraseSetRequestOrBuilder extends MessageOrBuilder {
    PhraseSet getPhraseSet();

    PhraseSetOrBuilder getPhraseSetOrBuilder();

    FieldMask getUpdateMask();

    FieldMaskOrBuilder getUpdateMaskOrBuilder();

    boolean hasPhraseSet();

    boolean hasUpdateMask();
}
