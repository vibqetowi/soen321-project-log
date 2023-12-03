package lv;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import lv.v;
/* compiled from: FormBody.kt */
/* loaded from: classes2.dex */
public final class p extends c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final v f24670c;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24671a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f24672b;

    /* compiled from: FormBody.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f24673a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f24674b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f24675c = new ArrayList();
    }

    static {
        Pattern pattern = v.f24702d;
        f24670c = v.a.a("application/x-www-form-urlencoded");
    }

    public p(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.i.g(encodedNames, "encodedNames");
        kotlin.jvm.internal.i.g(encodedValues, "encodedValues");
        this.f24671a = mv.b.x(encodedNames);
        this.f24672b = mv.b.x(encodedValues);
    }

    @Override // lv.c0
    public final long a() {
        return d(null, true);
    }

    @Override // lv.c0
    public final v b() {
        return f24670c;
    }

    @Override // lv.c0
    public final void c(zv.g gVar) {
        d(gVar, false);
    }

    public final long d(zv.g gVar, boolean z10) {
        zv.e c10;
        if (z10) {
            c10 = new zv.e();
        } else {
            kotlin.jvm.internal.i.d(gVar);
            c10 = gVar.c();
        }
        List<String> list = this.f24671a;
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            int i10 = i6 + 1;
            if (i6 > 0) {
                c10.L0(38);
            }
            c10.R0(list.get(i6));
            c10.L0(61);
            c10.R0(this.f24672b.get(i6));
            i6 = i10;
        }
        if (z10) {
            long j10 = c10.f39885v;
            c10.a();
            return j10;
        }
        return 0L;
    }
}
