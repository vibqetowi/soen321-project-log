package com.google.protobuf.util;

import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
/* loaded from: classes6.dex */
public final class Values {
    private static final Value NULL_VALUE = Value.newBuilder().setNullValue(NullValue.NULL_VALUE).build();

    public static Value ofNull() {
        return NULL_VALUE;
    }

    public static Value of(boolean z) {
        return Value.newBuilder().setBoolValue(z).build();
    }

    public static Value of(double d) {
        return Value.newBuilder().setNumberValue(d).build();
    }

    public static Value of(String str) {
        return Value.newBuilder().setStringValue(str).build();
    }

    public static Value of(Struct struct) {
        return Value.newBuilder().setStructValue(struct).build();
    }

    public static Value of(ListValue listValue) {
        return Value.newBuilder().setListValue(listValue).build();
    }

    public static Value of(Iterable<Value> iterable) {
        Value.Builder newBuilder = Value.newBuilder();
        newBuilder.getListValueBuilder().addAllValues(iterable);
        return newBuilder.build();
    }

    private Values() {
    }
}
