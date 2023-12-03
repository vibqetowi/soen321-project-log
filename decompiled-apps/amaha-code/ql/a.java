package ql;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: MusicSource.kt */
/* loaded from: classes2.dex */
public abstract class a implements s {

    /* renamed from: u  reason: collision with root package name */
    public int f29656u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f29657v = new ArrayList();

    @Override // ql.s
    public final boolean G(ss.l<? super Boolean, hs.k> lVar) {
        int i6 = this.f29656u;
        boolean z10 = false;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 4) {
                z10 = true;
            }
            lVar.invoke(Boolean.valueOf(z10));
            return true;
        }
        this.f29657v.add(lVar);
        return false;
    }

    public final void g(int i6) {
        boolean z10;
        if (i6 != 3 && i6 != 4) {
            this.f29656u = i6;
            return;
        }
        synchronized (this.f29657v) {
            this.f29656u = i6;
            Iterator it = this.f29657v.iterator();
            while (it.hasNext()) {
                ss.l lVar = (ss.l) it.next();
                if (this.f29656u == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lVar.invoke(Boolean.valueOf(z10));
            }
            hs.k kVar = hs.k.f19476a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [is.w] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // ql.s
    public final List u(Bundle bundle, String query) {
        ?? r22;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.i.g(query, "query");
        Object obj = bundle.get("android.intent.extra.focus");
        if (kotlin.jvm.internal.i.b(obj, "vnd.android.cursor.item/genre")) {
            Object obj2 = bundle.get("android.intent.extra.genre");
            r22 = new ArrayList();
            Iterator<MediaMetadataCompat> it = ((b) this).iterator();
            while (it.hasNext()) {
                MediaMetadataCompat next = it.next();
                if (kotlin.jvm.internal.i.b(next.d("android.media.metadata.GENRE"), obj2)) {
                    r22.add(next);
                }
            }
        } else if (kotlin.jvm.internal.i.b(obj, "vnd.android.cursor.item/artist")) {
            Object obj3 = bundle.get("android.intent.extra.artist");
            r22 = new ArrayList();
            Iterator<MediaMetadataCompat> it2 = ((b) this).iterator();
            while (it2.hasNext()) {
                MediaMetadataCompat next2 = it2.next();
                MediaMetadataCompat mediaMetadataCompat = next2;
                if (!kotlin.jvm.internal.i.b(mediaMetadataCompat.d("android.media.metadata.ARTIST"), obj3) && !kotlin.jvm.internal.i.b(mediaMetadataCompat.d("android.media.metadata.ALBUM_ARTIST"), obj3)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    r22.add(next2);
                }
            }
        } else if (kotlin.jvm.internal.i.b(obj, "vnd.android.cursor.item/album")) {
            Object obj4 = bundle.get("android.intent.extra.artist");
            Object obj5 = bundle.get("android.intent.extra.album");
            ArrayList arrayList = new ArrayList();
            Iterator<MediaMetadataCompat> it3 = ((b) this).iterator();
            while (it3.hasNext()) {
                MediaMetadataCompat next3 = it3.next();
                MediaMetadataCompat mediaMetadataCompat2 = next3;
                if ((kotlin.jvm.internal.i.b(mediaMetadataCompat2.d("android.media.metadata.ARTIST"), obj4) || kotlin.jvm.internal.i.b(mediaMetadataCompat2.d("android.media.metadata.ALBUM_ARTIST"), obj4)) && kotlin.jvm.internal.i.b(mediaMetadataCompat2.d("android.media.metadata.ALBUM"), obj5)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(next3);
                }
            }
            r22 = arrayList;
        } else if (kotlin.jvm.internal.i.b(obj, "vnd.android.cursor.item/audio")) {
            Object obj6 = bundle.get("android.intent.extra.title");
            Object obj7 = bundle.get("android.intent.extra.album");
            Object obj8 = bundle.get("android.intent.extra.artist");
            ArrayList arrayList2 = new ArrayList();
            Iterator<MediaMetadataCompat> it4 = ((b) this).iterator();
            while (it4.hasNext()) {
                MediaMetadataCompat next4 = it4.next();
                MediaMetadataCompat mediaMetadataCompat3 = next4;
                if ((kotlin.jvm.internal.i.b(mediaMetadataCompat3.d("android.media.metadata.ARTIST"), obj8) || kotlin.jvm.internal.i.b(mediaMetadataCompat3.d("android.media.metadata.ALBUM_ARTIST"), obj8)) && kotlin.jvm.internal.i.b(mediaMetadataCompat3.d("android.media.metadata.ALBUM"), obj7) && kotlin.jvm.internal.i.b(mediaMetadataCompat3.d("android.media.metadata.TITLE"), obj6)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList2.add(next4);
                }
            }
            r22 = arrayList2;
        } else {
            r22 = is.w.f20676u;
        }
        if (r22.isEmpty()) {
            if (!gv.n.B0(query)) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<MediaMetadataCompat> it5 = ((b) this).iterator();
                while (it5.hasNext()) {
                    MediaMetadataCompat next5 = it5.next();
                    MediaMetadataCompat mediaMetadataCompat4 = next5;
                    if (!ca.a.E(mediaMetadataCompat4.d("android.media.metadata.TITLE"), query) && !ca.a.E(mediaMetadataCompat4.d("android.media.metadata.GENRE"), query)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        arrayList3.add(next5);
                    }
                }
                return arrayList3;
            }
            List K2 = is.u.K2(this);
            Collections.shuffle(K2);
            return K2;
        }
        return r22;
    }
}
