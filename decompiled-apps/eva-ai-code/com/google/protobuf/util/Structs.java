package com.google.protobuf.util;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
/* loaded from: classes6.dex */
public final class Structs {
    public static Struct of(String str, Value value) {
        return Struct.newBuilder().putFields(str, value).build();
    }

    public static Struct of(String str, Value value, String str2, Value value2) {
        return Struct.newBuilder().putFields(str, value).putFields(str2, value2).build();
    }

    public static Struct of(String str, Value value, String str2, Value value2, String str3, Value value3) {
        return Struct.newBuilder().putFields(str, value).putFields(str2, value2).putFields(str3, value3).build();
    }

    private Structs() {
    }
}
