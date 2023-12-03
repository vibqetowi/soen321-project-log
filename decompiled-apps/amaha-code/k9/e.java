package k9;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f23108a = 0;

    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    /* loaded from: classes.dex */
    public interface a extends t9.c {
        @RecentlyNullable
        k9.d L();

        @RecentlyNullable
        String Z();

        boolean m();

        @RecentlyNullable
        String q();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    /* loaded from: classes.dex */
    public static final class b implements a.c {

        /* renamed from: u  reason: collision with root package name */
        public final CastDevice f23109u;

        /* renamed from: v  reason: collision with root package name */
        public final c f23110v;

        /* renamed from: w  reason: collision with root package name */
        public final Bundle f23111w;

        /* renamed from: x  reason: collision with root package name */
        public final String f23112x = UUID.randomUUID().toString();

        /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final CastDevice f23113a;

            /* renamed from: b  reason: collision with root package name */
            public final c f23114b;

            /* renamed from: c  reason: collision with root package name */
            public Bundle f23115c;

            public a(@RecentlyNonNull CastDevice castDevice, @RecentlyNonNull l9.b0 b0Var) {
                this.f23113a = castDevice;
                this.f23114b = b0Var;
            }
        }

        public /* synthetic */ b(a aVar) {
            this.f23109u = aVar.f23113a;
            this.f23110v = aVar.f23114b;
            this.f23111w = aVar.f23115c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
            if (r1 == r3) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (v9.m.a(this.f23109u, bVar.f23109u)) {
                Bundle bundle = this.f23111w;
                Bundle bundle2 = bVar.f23111w;
                if (bundle != null && bundle2 != null) {
                    if (bundle.size() == bundle2.size()) {
                        Set<String> keySet = bundle.keySet();
                        if (keySet.containsAll(bundle2.keySet())) {
                            for (String str : keySet) {
                                if (!v9.m.a(bundle.get(str), bundle2.get(str))) {
                                    break;
                                }
                            }
                            if (v9.m.a(this.f23112x, bVar.f23112x)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23109u, this.f23111w, 0, this.f23112x});
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    /* loaded from: classes.dex */
    public interface d {
        void a(@RecentlyNonNull String str);
    }

    static {
        new v0();
        a.f<p9.z> fVar = p9.i.f28039a;
    }

    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    /* loaded from: classes.dex */
    public static class c {
        public void d() {
        }

        public void f() {
        }

        public void a(int i6) {
        }

        public void b(int i6) {
        }

        public void c(k9.d dVar) {
        }

        public void e(int i6) {
        }
    }
}
