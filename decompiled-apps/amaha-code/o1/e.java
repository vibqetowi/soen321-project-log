package o1;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class e extends c.h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.i f26935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, c.i iVar) {
        super(obj);
        this.f26935d = iVar;
    }

    @Override // o1.c.h
    public final void a(ArrayList arrayList) {
        ArrayList arrayList2;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Parcel obtain = Parcel.obtain();
                ((MediaBrowserCompat.MediaItem) it.next()).writeToParcel(obtain, 0);
                arrayList2.add(obtain);
            }
        } else {
            arrayList2 = null;
        }
        this.f26935d.a(arrayList2);
    }
}
