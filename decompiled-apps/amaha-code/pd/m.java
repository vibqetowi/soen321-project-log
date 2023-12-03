package pd;

import pd.b0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes.dex */
public final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final b0.e.d.a.b f28310a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<b0.c> f28311b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.c> f28312c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f28313d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28314e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* loaded from: classes.dex */
    public static final class a extends b0.e.d.a.AbstractC0473a {

        /* renamed from: a  reason: collision with root package name */
        public b0.e.d.a.b f28315a;

        /* renamed from: b  reason: collision with root package name */
        public c0<b0.c> f28316b;

        /* renamed from: c  reason: collision with root package name */
        public c0<b0.c> f28317c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f28318d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f28319e;

        public a(b0.e.d.a aVar) {
            this.f28315a = aVar.c();
            this.f28316b = aVar.b();
            this.f28317c = aVar.d();
            this.f28318d = aVar.a();
            this.f28319e = Integer.valueOf(aVar.e());
        }

        public final m a() {
            String str;
            if (this.f28315a == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.f28319e == null) {
                str = str.concat(" uiOrientation");
            }
            if (str.isEmpty()) {
                return new m(this.f28315a, this.f28316b, this.f28317c, this.f28318d, this.f28319e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public m() {
        throw null;
    }

    public m(b0.e.d.a.b bVar, c0 c0Var, c0 c0Var2, Boolean bool, int i6) {
        this.f28310a = bVar;
        this.f28311b = c0Var;
        this.f28312c = c0Var2;
        this.f28313d = bool;
        this.f28314e = i6;
    }

    @Override // pd.b0.e.d.a
    public final Boolean a() {
        return this.f28313d;
    }

    @Override // pd.b0.e.d.a
    public final c0<b0.c> b() {
        return this.f28311b;
    }

    @Override // pd.b0.e.d.a
    public final b0.e.d.a.b c() {
        return this.f28310a;
    }

    @Override // pd.b0.e.d.a
    public final c0<b0.c> d() {
        return this.f28312c;
    }

    @Override // pd.b0.e.d.a
    public final int e() {
        return this.f28314e;
    }

    public final boolean equals(Object obj) {
        c0<b0.c> c0Var;
        c0<b0.c> c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a)) {
            return false;
        }
        b0.e.d.a aVar = (b0.e.d.a) obj;
        if (this.f28310a.equals(aVar.c()) && ((c0Var = this.f28311b) != null ? c0Var.equals(aVar.b()) : aVar.b() == null) && ((c0Var2 = this.f28312c) != null ? c0Var2.equals(aVar.d()) : aVar.d() == null) && ((bool = this.f28313d) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f28314e == aVar.e()) {
            return true;
        }
        return false;
    }

    @Override // pd.b0.e.d.a
    public final a f() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f28310a.hashCode() ^ 1000003) * 1000003;
        int i6 = 0;
        c0<b0.c> c0Var = this.f28311b;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i10 = (hashCode3 ^ hashCode) * 1000003;
        c0<b0.c> c0Var2 = this.f28312c;
        if (c0Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Boolean bool = this.f28313d;
        if (bool != null) {
            i6 = bool.hashCode();
        }
        return ((i11 ^ i6) * 1000003) ^ this.f28314e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f28310a);
        sb2.append(", customAttributes=");
        sb2.append(this.f28311b);
        sb2.append(", internalKeys=");
        sb2.append(this.f28312c);
        sb2.append(", background=");
        sb2.append(this.f28313d);
        sb2.append(", uiOrientation=");
        return pl.a.g(sb2, this.f28314e, "}");
    }
}
