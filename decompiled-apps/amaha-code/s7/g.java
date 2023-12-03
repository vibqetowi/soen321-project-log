package s7;

import c9.w;
import java.util.UUID;
/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes.dex */
public final class g implements r7.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f31300d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f31301a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f31302b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f31303c;

    static {
        boolean z10;
        if ("Amazon".equals(w.f5207c)) {
            String str = w.f5208d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f31300d = z10;
            }
        }
        z10 = false;
        f31300d = z10;
    }

    public g(UUID uuid, byte[] bArr, boolean z10) {
        this.f31301a = uuid;
        this.f31302b = bArr;
        this.f31303c = z10;
    }
}
