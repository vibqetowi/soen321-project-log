package n9;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import v9.o;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25948a;

    /* renamed from: b  reason: collision with root package name */
    public final m9.b f25949b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f25950c;

    /* renamed from: d  reason: collision with root package name */
    public d f25951d;

    /* renamed from: e  reason: collision with root package name */
    public a f25952e;

    public b(Context context) {
        this(context, new m9.b(-1, 0, 0));
    }

    public final void a(Uri uri) {
        int i6;
        if (uri == null) {
            b();
        } else if (!uri.equals(this.f25950c)) {
            b();
            this.f25950c = uri;
            m9.b bVar = this.f25949b;
            int i10 = bVar.f24946v;
            Context context = this.f25948a;
            if (i10 != 0 && (i6 = bVar.f24947w) != 0) {
                this.f25951d = new d(context, i10, i6, this);
            } else {
                this.f25951d = new d(context, 0, 0, this);
            }
            d dVar = this.f25951d;
            o.h(dVar);
            Uri uri2 = this.f25950c;
            o.h(uri2);
            dVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public final void b() {
        d dVar = this.f25951d;
        if (dVar != null) {
            dVar.cancel(true);
            this.f25951d = null;
        }
        this.f25950c = null;
    }

    public b(Context context, m9.b bVar) {
        this.f25948a = context;
        this.f25949b = bVar;
        b();
    }
}
