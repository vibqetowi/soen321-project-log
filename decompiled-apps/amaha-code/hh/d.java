package hh;

import android.content.Context;
import eh.o;
import hh.g;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.k;
/* compiled from: LogManager.kt */
/* loaded from: classes.dex */
public final class d implements fh.a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f17605a;

    /* compiled from: LogManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f17606u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_LogManager onAppBackground() : ";
        }
    }

    static {
        o.f14029a.add(new d());
        f17605a = new LinkedHashSet();
    }

    @Override // fh.a
    public final void a(Context context) {
        try {
            for (h hVar : f17605a) {
                hVar.c();
            }
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, a.f17606u);
        }
    }
}
