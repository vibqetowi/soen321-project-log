package ke;

import java.util.List;
import ke.l;
/* compiled from: AutoValue_FieldIndex.java */
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: b  reason: collision with root package name */
    public final int f23257b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23258c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l.c> f23259d;

    /* renamed from: e  reason: collision with root package name */
    public final l.b f23260e;

    public a(int i6, String str, List<l.c> list, l.b bVar) {
        this.f23257b = i6;
        if (str != null) {
            this.f23258c = str;
            if (list != null) {
                this.f23259d = list;
                if (bVar != null) {
                    this.f23260e = bVar;
                    return;
                }
                throw new NullPointerException("Null indexState");
            }
            throw new NullPointerException("Null segments");
        }
        throw new NullPointerException("Null collectionGroup");
    }

    @Override // ke.l
    public final String b() {
        return this.f23258c;
    }

    @Override // ke.l
    public final int d() {
        return this.f23257b;
    }

    @Override // ke.l
    public final l.b e() {
        return this.f23260e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f23257b == lVar.d() && this.f23258c.equals(lVar.b()) && this.f23259d.equals(lVar.f()) && this.f23260e.equals(lVar.e())) {
            return true;
        }
        return false;
    }

    @Override // ke.l
    public final List<l.c> f() {
        return this.f23259d;
    }

    public final int hashCode() {
        return ((((((this.f23257b ^ 1000003) * 1000003) ^ this.f23258c.hashCode()) * 1000003) ^ this.f23259d.hashCode()) * 1000003) ^ this.f23260e.hashCode();
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.f23257b + ", collectionGroup=" + this.f23258c + ", segments=" + this.f23259d + ", indexState=" + this.f23260e + "}";
    }
}
