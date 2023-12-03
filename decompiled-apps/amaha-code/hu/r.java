package hu;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: u  reason: collision with root package name */
    public static final b f19596u;

    /* renamed from: v  reason: collision with root package name */
    public static final a f19597v;

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ r[] f19598w;

    /* compiled from: DescriptorRenderer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends r {
        public a() {
            super("HTML", 1);
        }

        @Override // hu.r
        public final String d(String string) {
            kotlin.jvm.internal.i.g(string, "string");
            return gv.n.F0(gv.n.F0(string, "<", "&lt;"), ">", "&gt;");
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends r {
        public b() {
            super("PLAIN", 0);
        }

        @Override // hu.r
        public final String d(String string) {
            kotlin.jvm.internal.i.g(string, "string");
            return string;
        }
    }

    static {
        b bVar = new b();
        f19596u = bVar;
        a aVar = new a();
        f19597v = aVar;
        f19598w = new r[]{bVar, aVar};
    }

    public r() {
        throw null;
    }

    public r(String str, int i6) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f19598w.clone();
    }

    public abstract String d(String str);
}
