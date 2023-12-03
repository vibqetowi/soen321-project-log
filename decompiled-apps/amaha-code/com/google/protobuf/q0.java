package com.google.protobuf;

import com.google.protobuf.h;
import com.google.protobuf.v;
import java.io.OutputStream;
/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface q0 extends r0 {

    /* compiled from: MessageLite.java */
    /* loaded from: classes.dex */
    public interface a extends r0, Cloneable {
    }

    v.a a();

    int b();

    v.a c();

    void f(CodedOutputStream codedOutputStream);

    h.C0164h k();

    byte[] q();

    void writeTo(OutputStream outputStream);
}
