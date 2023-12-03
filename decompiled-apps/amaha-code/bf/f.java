package bf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ConfigurationConstants.java */
/* loaded from: classes.dex */
public final class f extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public static f f4259v;

    /* renamed from: w  reason: collision with root package name */
    public static final Map<Long, String> f4260w = Collections.unmodifiableMap(new a());

    /* compiled from: ConfigurationConstants.java */
    /* loaded from: classes.dex */
    public class a extends HashMap<Long, String> {
        public a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    @Override // com.android.volley.toolbox.a
    public final String f() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.android.volley.toolbox.a
    public final String i() {
        return "fpr_log_source";
    }
}
