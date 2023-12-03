package bf;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes.dex */
public final class c extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public static c f4256v;

    public static synchronized c J() {
        c cVar;
        synchronized (c.class) {
            if (f4256v == null) {
                f4256v = new c();
            }
            cVar = f4256v;
        }
        return cVar;
    }

    @Override // com.android.volley.toolbox.a
    public final String f() {
        return "isEnabled";
    }

    @Override // com.android.volley.toolbox.a
    public final String g() {
        return "firebase_performance_collection_enabled";
    }
}
