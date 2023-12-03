package com.google.protobuf;

import com.google.protobuf.q0;
import com.google.protobuf.v;
/* compiled from: AbstractParser.java */
/* loaded from: classes.dex */
public abstract class b<MessageType extends q0> implements z0<MessageType> {
    static {
        n.a();
    }

    public static void b(q0 q0Var) {
        UninitializedMessageException uninitializedMessageException;
        if (!q0Var.d()) {
            if (q0Var instanceof a) {
                a aVar = (a) q0Var;
                uninitializedMessageException = new UninitializedMessageException();
            } else {
                uninitializedMessageException = new UninitializedMessageException();
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
            invalidProtocolBufferException.f9873u = q0Var;
            throw invalidProtocolBufferException;
        }
    }

    @Override // com.google.protobuf.z0
    public final q0 a(i iVar, n nVar) {
        v I = v.I(((v.b) this).f10074a, iVar, nVar);
        b(I);
        return I;
    }
}
