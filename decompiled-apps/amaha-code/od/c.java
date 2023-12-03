package od;
/* compiled from: LogFileManager.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f27352c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final sd.b f27353a;

    /* renamed from: b  reason: collision with root package name */
    public od.a f27354b;

    public c(sd.b bVar) {
        this.f27353a = bVar;
        this.f27354b = f27352c;
    }

    public final void a(String str) {
        this.f27354b.a();
        this.f27354b = f27352c;
        if (str == null) {
            return;
        }
        this.f27354b = new g(this.f27353a.b(str, "userlog"));
    }

    public c(sd.b bVar, String str) {
        this(bVar);
        a(str);
    }

    /* compiled from: LogFileManager.java */
    /* loaded from: classes.dex */
    public static final class a implements od.a {
        @Override // od.a
        public final String b() {
            return null;
        }

        @Override // od.a
        public final void a() {
        }

        @Override // od.a
        public final void c(long j10, String str) {
        }
    }
}
