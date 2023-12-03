package od;

import com.theinnerhour.b2b.utils.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: UserMetadata.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final e f27375a;

    /* renamed from: b  reason: collision with root package name */
    public final nd.g f27376b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27377c;

    /* renamed from: d  reason: collision with root package name */
    public final a f27378d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    public final a f27379e = new a(true);
    public final AtomicMarkableReference<String> f = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f27380a;

        public a(boolean z10) {
            int i6;
            new AtomicReference(null);
            if (z10) {
                i6 = 8192;
            } else {
                i6 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
            }
            this.f27380a = new AtomicMarkableReference<>(new b(i6), false);
        }

        public final Map<String, String> a() {
            Map<String, String> unmodifiableMap;
            b reference = this.f27380a.getReference();
            synchronized (reference) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f27349a));
            }
            return unmodifiableMap;
        }
    }

    public h(String str, sd.b bVar, nd.g gVar) {
        this.f27377c = str;
        this.f27375a = new e(bVar);
        this.f27376b = gVar;
    }
}
