package ql;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: AudioMediaSource.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioMediaSource$updateCatalog$2", f = "AudioMediaSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super List<MediaMetadataCompat>>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ o f29685u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f29685u = oVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f29685u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super List<MediaMetadataCompat>> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        ArrayList arrayList = new ArrayList();
        o oVar = this.f29685u;
        Uri parse = Uri.parse(oVar.A);
        String str = oVar.A;
        Uri parse2 = Uri.parse(str);
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        long millis = TimeUnit.SECONDS.toMillis(oVar.D);
        bVar.d("android.media.metadata.MEDIA_ID", oVar.f29759u);
        String str2 = oVar.f29760v;
        bVar.d("android.media.metadata.TITLE", str2);
        String str3 = oVar.f29762x;
        bVar.d("android.media.metadata.ARTIST", str3);
        String str4 = oVar.f29761w;
        bVar.d("android.media.metadata.ALBUM", str4);
        bVar.c(millis, "android.media.metadata.DURATION");
        bVar.d("android.media.metadata.GENRE", oVar.f29763y);
        bVar.d("android.media.metadata.MEDIA_URI", oVar.f29764z);
        bVar.d("android.media.metadata.ALBUM_ART_URI", str);
        bVar.c(oVar.B, "android.media.metadata.TRACK_NUMBER");
        bVar.c(oVar.C, "android.media.metadata.NUM_TRACKS");
        bVar.c(2, "com.theinnerhour.b2b.METADATA_KEY_FLAGS");
        bVar.d("android.media.metadata.DISPLAY_TITLE", str2);
        bVar.d("android.media.metadata.DISPLAY_SUBTITLE", str3);
        bVar.d("android.media.metadata.DISPLAY_DESCRIPTION", str4);
        bVar.d("android.media.metadata.DISPLAY_ICON_URI", str);
        bVar.c(0L, "android.media.metadata.DOWNLOAD_STATUS");
        bVar.d("android.media.metadata.DISPLAY_ICON_URI", parse2.toString());
        bVar.d("android.media.metadata.ALBUM_ART_URI", parse2.toString());
        bVar.d("com.theinnerhour.b2b.JSON_ARTWORK_URI", parse.toString());
        arrayList.add(bVar.a());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) it.next();
            Bundle bundle = mediaMetadataCompat.b().A;
            if (bundle != null) {
                bundle.putAll(new Bundle(mediaMetadataCompat.f854u));
            }
        }
        return arrayList;
    }
}
