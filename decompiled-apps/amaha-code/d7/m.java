package d7;

import java.util.Arrays;
/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a7.b f12253a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12254b;

    public m(a7.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f12253a = bVar;
                this.f12254b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f12253a.equals(mVar.f12253a)) {
            return false;
        }
        return Arrays.equals(this.f12254b, mVar.f12254b);
    }

    public final int hashCode() {
        return ((this.f12253a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12254b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f12253a + ", bytes=[...]}";
    }
}
