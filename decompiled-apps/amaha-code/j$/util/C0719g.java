package j$.util;

import java.io.Serializable;
/* renamed from: j$.util.g  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0719g extends RuntimeException {
    public C0719g(String str) {
        super(str);
    }

    public static void a(Serializable serializable, String str) {
        throw new C0719g("Unsupported " + str + " :" + serializable);
    }
}
