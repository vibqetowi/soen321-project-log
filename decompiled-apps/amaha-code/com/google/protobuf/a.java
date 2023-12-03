package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0163a;
import com.google.protobuf.h;
import com.google.protobuf.q0;
import com.google.protobuf.y;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0163a<MessageType, BuilderType>> implements q0 {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0163a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0163a<MessageType, BuilderType>> implements q0.a {
    }

    public static void g(Iterable iterable, y.d dVar) {
        Charset charset = y.f10086a;
        iterable.getClass();
        if (iterable instanceof f0) {
            List<?> n10 = ((f0) iterable).n();
            f0 f0Var = (f0) dVar;
            int size = dVar.size();
            for (Object obj : n10) {
                if (obj == null) {
                    String str = "Element at index " + (f0Var.size() - size) + " is null.";
                    int size2 = f0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        f0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof h) {
                    f0Var.B((h) obj);
                } else {
                    f0Var.add((String) obj);
                }
            }
        } else if (iterable instanceof a1) {
            dVar.addAll((Collection) iterable);
        } else {
            if ((dVar instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) dVar).ensureCapacity(((Collection) iterable).size() + dVar.size());
            }
            int size3 = dVar.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (dVar.size() - size3) + " is null.";
                    int size4 = dVar.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        dVar.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                dVar.add(obj2);
            }
        }
    }

    @Override // com.google.protobuf.q0
    public final h.C0164h k() {
        try {
            int r = ((v) this).r(null);
            h.C0164h c0164h = h.f9922v;
            byte[] bArr = new byte[r];
            Logger logger = CodedOutputStream.f9865w;
            CodedOutputStream.b bVar = new CodedOutputStream.b(0, bArr, r);
            ((v) this).f(bVar);
            if (bVar.E0() == 0) {
                return new h.C0164h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    public int o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.q0
    public final byte[] q() {
        try {
            int r = ((v) this).r(null);
            byte[] bArr = new byte[r];
            Logger logger = CodedOutputStream.f9865w;
            CodedOutputStream.b bVar = new CodedOutputStream.b(0, bArr, r);
            ((v) this).f(bVar);
            if (bVar.E0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }

    public int r(g1 g1Var) {
        int o10 = o();
        if (o10 == -1) {
            int h10 = g1Var.h(this);
            t(h10);
            return h10;
        }
        return o10;
    }

    public final String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void t(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.q0
    public final void writeTo(OutputStream outputStream) {
        v vVar = (v) this;
        int r = vVar.r(null);
        Logger logger = CodedOutputStream.f9865w;
        if (r > 4096) {
            r = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(outputStream, r);
        vVar.f(cVar);
        if (cVar.A > 0) {
            cVar.J0();
        }
    }
}
