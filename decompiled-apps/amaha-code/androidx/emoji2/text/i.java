package androidx.emoji2.text;

import java.nio.ByteBuffer;
/* compiled from: EmojiMetadata.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<d1.a> f2056d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f2057a;

    /* renamed from: b  reason: collision with root package name */
    public final o f2058b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f2059c = 0;

    public i(o oVar, int i6) {
        this.f2058b = oVar;
        this.f2057a = i6;
    }

    public final int a(int i6) {
        d1.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = c10.f12130b;
            int i10 = a10 + c10.f12129a;
            return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i10) + i10 + 4);
        }
        return 0;
    }

    public final int b() {
        d1.a c10 = c();
        int a10 = c10.a(16);
        if (a10 != 0) {
            int i6 = a10 + c10.f12129a;
            return c10.f12130b.getInt(c10.f12130b.getInt(i6) + i6);
        }
        return 0;
    }

    public final d1.a c() {
        ThreadLocal<d1.a> threadLocal = f2056d;
        d1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new d1.a();
            threadLocal.set(aVar);
        }
        d1.b bVar = this.f2058b.f2082a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i6 = a10 + bVar.f12129a;
            int i10 = (this.f2057a * 4) + bVar.f12130b.getInt(i6) + i6 + 4;
            aVar.b(bVar.f12130b.getInt(i10) + i10, bVar.f12130b);
        }
        return aVar;
    }

    public final String toString() {
        int i6;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        d1.a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i6 = c10.f12130b.getInt(a10 + c10.f12129a);
        } else {
            i6 = 0;
        }
        sb2.append(Integer.toHexString(i6));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
