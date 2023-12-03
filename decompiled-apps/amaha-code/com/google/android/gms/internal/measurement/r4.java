package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.r4;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class r4<MessageType extends r4<MessageType, BuilderType>, BuilderType extends q4<MessageType, BuilderType>> implements v6 {
    protected int zzb = 0;

    public static void f(Iterable iterable, b6 b6Var) {
        Charset charset = c6.f8318a;
        iterable.getClass();
        if (iterable instanceof g6) {
            List f = ((g6) iterable).f();
            g6 g6Var = (g6) b6Var;
            int size = b6Var.size();
            for (Object obj : f) {
                if (obj == null) {
                    int size2 = g6Var.size();
                    String str = "Element at index " + (size2 - size) + " is null.";
                    int size3 = g6Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        g6Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof b5) {
                    g6Var.P((b5) obj);
                } else {
                    g6Var.add((String) obj);
                }
            }
        } else if (!(iterable instanceof c7)) {
            if ((b6Var instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) b6Var).ensureCapacity(((Collection) iterable).size() + b6Var.size());
            }
            int size4 = b6Var.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = b6Var.size();
                    String str2 = "Element at index " + (size5 - size4) + " is null.";
                    int size6 = b6Var.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        b6Var.remove(size6);
                    }
                    throw new NullPointerException(str2);
                }
                b6Var.add(obj2);
            }
        } else {
            b6Var.addAll((Collection) iterable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v6
    public final a5 a() {
        try {
            w5 w5Var = (w5) this;
            int c10 = w5Var.c();
            a5 a5Var = b5.f8311v;
            byte[] bArr = new byte[c10];
            Logger logger = e5.f8355u0;
            d5 d5Var = new d5(bArr, c10);
            g7 a10 = d7.f8338c.a(w5Var.getClass());
            f5 f5Var = d5Var.f8357t0;
            if (f5Var == null) {
                f5Var = new f5(d5Var);
            }
            a10.i(w5Var, f5Var);
            if (c10 - d5Var.f8331y0 == 0) {
                return new a5(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(defpackage.b.m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public int e(g7 g7Var) {
        throw null;
    }

    public final byte[] g() {
        try {
            w5 w5Var = (w5) this;
            int c10 = w5Var.c();
            byte[] bArr = new byte[c10];
            Logger logger = e5.f8355u0;
            d5 d5Var = new d5(bArr, c10);
            g7 a10 = d7.f8338c.a(w5Var.getClass());
            f5 f5Var = d5Var.f8357t0;
            if (f5Var == null) {
                f5Var = new f5(d5Var);
            }
            a10.i(w5Var, f5Var);
            if (c10 - d5Var.f8331y0 == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(defpackage.b.m("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
