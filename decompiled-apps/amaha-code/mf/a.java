package mf;

import r1.b0;
/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f25044a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25045b;

    public a(String str, String str2) {
        if (str != null) {
            this.f25044a = str;
            if (str2 != null) {
                this.f25045b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // mf.d
    public final String a() {
        return this.f25044a;
    }

    @Override // mf.d
    public final String b() {
        return this.f25045b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25044a.equals(dVar.a()) && this.f25045b.equals(dVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25044a.hashCode() ^ 1000003) * 1000003) ^ this.f25045b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f25044a);
        sb2.append(", version=");
        return b0.b(sb2, this.f25045b, "}");
    }
}
