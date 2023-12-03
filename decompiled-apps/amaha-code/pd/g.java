package pd;

import java.util.Arrays;
import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes.dex */
public final class g extends b0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28256a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f28257b;

    public g(String str, byte[] bArr) {
        this.f28256a = str;
        this.f28257b = bArr;
    }

    @Override // pd.b0.d.a
    public final byte[] a() {
        return this.f28257b;
    }

    @Override // pd.b0.d.a
    public final String b() {
        return this.f28256a;
    }

    public final boolean equals(Object obj) {
        byte[] a10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d.a)) {
            return false;
        }
        b0.d.a aVar = (b0.d.a) obj;
        if (this.f28256a.equals(aVar.b())) {
            if (aVar instanceof g) {
                a10 = ((g) aVar).f28257b;
            } else {
                a10 = aVar.a();
            }
            if (Arrays.equals(this.f28257b, a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28256a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f28257b);
    }

    public final String toString() {
        return "File{filename=" + this.f28256a + ", contents=" + Arrays.toString(this.f28257b) + "}";
    }
}
