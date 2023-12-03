package c5;

import d5.j;
import h4.e;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f4984b;

    /* renamed from: c  reason: collision with root package name */
    public final e f4985c;

    public a(int i6, e eVar) {
        this.f4984b = i6;
        this.f4985c = eVar;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        this.f4985c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4984b).array());
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4984b != aVar.f4984b || !this.f4985c.equals(aVar.f4985c)) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        return j.e(this.f4984b, this.f4985c);
    }
}
