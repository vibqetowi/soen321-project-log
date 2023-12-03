package o1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class a extends c.h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.b f26898d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f26899e;
    public final /* synthetic */ Bundle f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f26900g = null;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f26901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, c.b bVar, String str2, Bundle bundle) {
        super(str);
        this.f26901h = cVar;
        this.f26898d = bVar;
        this.f26899e = str2;
        this.f = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    @Override // o1.c.h
    public final void a(ArrayList arrayList) {
        t.b<IBinder, c.b> bVar = this.f26901h.f26906x;
        c.b bVar2 = this.f26898d;
        c.b orDefault = bVar.getOrDefault(((c.l) bVar2.f26914d).a(), null);
        String str = bVar2.f26911a;
        String str2 = this.f26899e;
        if (orDefault != bVar2) {
            if (c.A) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        int i6 = this.f26928c & 1;
        Bundle bundle = this.f;
        ArrayList arrayList2 = arrayList;
        if (i6 != 0) {
            arrayList2 = c.a(bundle, arrayList);
        }
        try {
            ((c.l) bVar2.f26914d).b(str2, arrayList2, bundle, this.f26900g);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
