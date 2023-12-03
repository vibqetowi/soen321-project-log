package o1;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.Token f26933u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c.d f26934v;

    public d(c.d dVar, MediaSessionCompat.Token token) {
        this.f26934v = dVar;
        this.f26933u = token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.d dVar = this.f26934v;
        ArrayList arrayList = dVar.f26918a;
        boolean isEmpty = arrayList.isEmpty();
        MediaSessionCompat.Token token = this.f26933u;
        if (!isEmpty) {
            android.support.v4.media.session.b a10 = token.a();
            if (a10 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f0.j.b((Bundle) it.next(), "extra_session_binder", a10.asBinder());
                }
            }
            arrayList.clear();
        }
        dVar.f26919b.setSessionToken((MediaSession.Token) token.f887v);
    }
}
