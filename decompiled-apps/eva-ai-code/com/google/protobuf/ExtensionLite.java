package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
/* loaded from: classes6.dex */
public abstract class ExtensionLite<ContainingType extends MessageLite, Type> {
    public abstract Type getDefaultValue();

    public abstract WireFormat.FieldType getLiteType();

    public abstract MessageLite getMessageDefaultInstance();

    public abstract int getNumber();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
