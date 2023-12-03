package com.google.protobuf;

import com.google.protobuf.y;
/* compiled from: NullValue.java */
/* loaded from: classes.dex */
public enum y0 implements y.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: u  reason: collision with root package name */
    public final int f10092u;

    y0(int i6) {
        this.f10092u = i6;
    }

    @Override // com.google.protobuf.y.a
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f10092u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
