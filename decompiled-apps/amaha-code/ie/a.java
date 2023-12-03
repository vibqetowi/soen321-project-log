package ie;

import java.util.Arrays;
import ke.i;
/* compiled from: AutoValue_IndexEntry.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: u  reason: collision with root package name */
    public final int f19991u;

    /* renamed from: v  reason: collision with root package name */
    public final i f19992v;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f19993w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f19994x;

    public a(int i6, i iVar, byte[] bArr, byte[] bArr2) {
        this.f19991u = i6;
        if (iVar != null) {
            this.f19992v = iVar;
            if (bArr != null) {
                this.f19993w = bArr;
                if (bArr2 != null) {
                    this.f19994x = bArr2;
                    return;
                }
                throw new NullPointerException("Null directionalValue");
            }
            throw new NullPointerException("Null arrayValue");
        }
        throw new NullPointerException("Null documentKey");
    }

    @Override // ie.d
    public final byte[] d() {
        return this.f19993w;
    }

    public final boolean equals(Object obj) {
        byte[] d10;
        byte[] f;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f19991u == dVar.i() && this.f19992v.equals(dVar.h())) {
            boolean z10 = dVar instanceof a;
            if (z10) {
                d10 = ((a) dVar).f19993w;
            } else {
                d10 = dVar.d();
            }
            if (Arrays.equals(this.f19993w, d10)) {
                if (z10) {
                    f = ((a) dVar).f19994x;
                } else {
                    f = dVar.f();
                }
                if (Arrays.equals(this.f19994x, f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ie.d
    public final byte[] f() {
        return this.f19994x;
    }

    @Override // ie.d
    public final i h() {
        return this.f19992v;
    }

    public final int hashCode() {
        return ((((((this.f19991u ^ 1000003) * 1000003) ^ this.f19992v.hashCode()) * 1000003) ^ Arrays.hashCode(this.f19993w)) * 1000003) ^ Arrays.hashCode(this.f19994x);
    }

    @Override // ie.d
    public final int i() {
        return this.f19991u;
    }

    public final String toString() {
        return "IndexEntry{indexId=" + this.f19991u + ", documentKey=" + this.f19992v + ", arrayValue=" + Arrays.toString(this.f19993w) + ", directionalValue=" + Arrays.toString(this.f19994x) + "}";
    }
}
