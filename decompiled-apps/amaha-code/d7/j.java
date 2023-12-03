package d7;

import d7.s;
import java.util.Arrays;
/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f12241a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12242b;

    /* renamed from: c  reason: collision with root package name */
    public final a7.d f12243c;

    /* compiled from: AutoValue_TransportContext.java */
    /* loaded from: classes.dex */
    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12244a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f12245b;

        /* renamed from: c  reason: collision with root package name */
        public a7.d f12246c;

        public final j a() {
            String str;
            if (this.f12244a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.f12246c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f12244a, this.f12245b, this.f12246c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f12244a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(a7.d dVar) {
            if (dVar != null) {
                this.f12246c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, a7.d dVar) {
        this.f12241a = str;
        this.f12242b = bArr;
        this.f12243c = dVar;
    }

    @Override // d7.s
    public final String b() {
        return this.f12241a;
    }

    @Override // d7.s
    public final byte[] c() {
        return this.f12242b;
    }

    @Override // d7.s
    public final a7.d d() {
        return this.f12243c;
    }

    public final boolean equals(Object obj) {
        byte[] c10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f12241a.equals(sVar.b())) {
            if (sVar instanceof j) {
                c10 = ((j) sVar).f12242b;
            } else {
                c10 = sVar.c();
            }
            if (Arrays.equals(this.f12242b, c10) && this.f12243c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12241a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12242b)) * 1000003) ^ this.f12243c.hashCode();
    }
}
