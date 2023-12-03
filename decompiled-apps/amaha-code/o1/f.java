package o1;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class f extends c.h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.i f26936d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Bundle f26937e;
    public final /* synthetic */ c.f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c.f fVar, Object obj, c.i iVar, Bundle bundle) {
        super(obj);
        this.f = fVar;
        this.f26936d = iVar;
        this.f26937e = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @Override // o1.c.h
    public final void a(ArrayList arrayList) {
        c.i iVar = this.f26936d;
        if (arrayList == null) {
            iVar.a(null);
            return;
        }
        ArrayList<MediaBrowserCompat.MediaItem> arrayList2 = arrayList;
        if ((this.f26928c & 1) != 0) {
            c.this.getClass();
            arrayList2 = c.a(this.f26937e, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (MediaBrowserCompat.MediaItem mediaItem : arrayList2) {
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            arrayList3.add(obtain);
        }
        iVar.a(arrayList3);
    }
}
