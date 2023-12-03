package hh;

import android.content.Context;
import ih.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.i;
import ne.u;
/* compiled from: RemoteLogAdapter.kt */
/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17614a;

    /* renamed from: b  reason: collision with root package name */
    public final p f17615b;

    /* renamed from: d  reason: collision with root package name */
    public int f17617d;

    /* renamed from: c  reason: collision with root package name */
    public final List<nh.a> f17616c = Collections.synchronizedList(new ArrayList());

    /* renamed from: e  reason: collision with root package name */
    public final Object f17618e = new Object();
    public final ExecutorService f = Executors.newSingleThreadExecutor();

    public h(Context context, p pVar) {
        this.f17614a = context;
        this.f17615b = pVar;
    }

    @Override // hh.c
    public final void a(int i6, String tag, String subTag, String message, Throwable th2) {
        i.g(tag, "tag");
        i.g(subTag, "subTag");
        i.g(message, "message");
        this.f.submit(new j7.e(this, i6, message, th2));
    }

    @Override // hh.c
    public final boolean b(int i6) {
        ph.b bVar = this.f17615b.f20104c.f;
        if (bVar.f28438b && bVar.f28437a >= i6) {
            return true;
        }
        return false;
    }

    public final void c() {
        List<nh.a> list = this.f17616c;
        ArrayList arrayList = new ArrayList(list);
        this.f17617d = 0;
        list.clear();
        if (!arrayList.isEmpty()) {
            try {
                bh.b.a().submit(new u(this, 13, arrayList));
            } catch (Exception unused) {
            }
        }
    }
}
