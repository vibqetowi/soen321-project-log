package sf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: u  reason: collision with root package name */
    public static final a f31513u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ r[] f31514v;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: classes.dex */
    public enum a extends r {
        public a() {
            super("DEFAULT", 0);
        }
    }

    static {
        a aVar = new a();
        f31513u = aVar;
        f31514v = new r[]{aVar, new r() { // from class: sf.r.b
        }};
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
        return (r[]) f31514v.clone();
    }
}
