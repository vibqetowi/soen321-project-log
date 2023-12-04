package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface KeysetOrBuilder extends MessageLiteOrBuilder {
    Keyset.Key getKey(int index);

    int getKeyCount();

    List<Keyset.Key> getKeyList();

    int getPrimaryKeyId();
}
