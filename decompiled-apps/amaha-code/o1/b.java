package o1;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import java.util.ArrayList;
import java.util.List;
import o1.c;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public final class b extends c.h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.b f26902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, c.b bVar) {
        super(str);
        this.f26902d = bVar;
    }

    @Override // o1.c.h
    public final void a(ArrayList arrayList) {
        int i6 = this.f26928c & 4;
        c.b bVar = this.f26902d;
        if (i6 == 0 && arrayList != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) arrayList.toArray(new MediaBrowserCompat.MediaItem[0]));
            bVar.b(0, bundle);
            return;
        }
        bVar.b(-1, null);
    }
}
