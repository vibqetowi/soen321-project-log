package nd;

import java.io.File;
/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes.dex */
public final class b extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final pd.b0 f26029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26030b;

    /* renamed from: c  reason: collision with root package name */
    public final File f26031c;

    public b(pd.b bVar, String str, File file) {
        this.f26029a = bVar;
        if (str != null) {
            this.f26030b = str;
            this.f26031c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // nd.b0
    public final pd.b0 a() {
        return this.f26029a;
    }

    @Override // nd.b0
    public final File b() {
        return this.f26031c;
    }

    @Override // nd.b0
    public final String c() {
        return this.f26030b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f26029a.equals(b0Var.a()) && this.f26030b.equals(b0Var.c()) && this.f26031c.equals(b0Var.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f26029a.hashCode() ^ 1000003) * 1000003) ^ this.f26030b.hashCode()) * 1000003) ^ this.f26031c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f26029a + ", sessionId=" + this.f26030b + ", reportFile=" + this.f26031c + "}";
    }
}
