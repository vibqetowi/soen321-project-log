package com.theinnerhour.b2b.components.dynamicActivities.utils;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ql.p;
import ql.s;
import ss.l;
/* compiled from: MusicService.kt */
/* loaded from: classes2.dex */
public final class a extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MusicService f11122u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f11123v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f11124w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ MusicService.a f11125x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f11126y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MusicService musicService, String str, Bundle bundle, MusicService.a aVar, boolean z10) {
        super(1);
        this.f11122u = musicService;
        this.f11123v = str;
        this.f11124w = bundle;
        this.f11125x = aVar;
        this.f11126y = z10;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        String str;
        MediaMetadataCompat mediaMetadataCompat;
        bool.booleanValue();
        s sVar = this.f11122u.C;
        if (sVar != null) {
            Iterator<MediaMetadataCompat> it = sVar.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.f11123v;
                if (hasNext) {
                    mediaMetadataCompat = it.next();
                    if (i.b(mediaMetadataCompat.d("android.media.metadata.MEDIA_ID"), str)) {
                        break;
                    }
                } else {
                    mediaMetadataCompat = null;
                    break;
                }
            }
            MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
            if (mediaMetadataCompat2 == null) {
                Log.w("MusicService", "Content not found: MediaID=" + str);
            } else {
                long j10 = -9223372036854775807L;
                Bundle bundle = this.f11124w;
                if (bundle != null) {
                    j10 = bundle.getLong("playback_start_position_ms", -9223372036854775807L);
                }
                long j11 = j10;
                MusicService musicService = this.f11122u;
                s sVar2 = MusicService.this.C;
                if (sVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (MediaMetadataCompat mediaMetadataCompat3 : sVar2) {
                        if (i.b(mediaMetadataCompat3.d("android.media.metadata.ALBUM"), mediaMetadataCompat2.d("android.media.metadata.ALBUM"))) {
                            arrayList.add(mediaMetadataCompat3);
                        }
                    }
                    musicService.e(u.D2(arrayList, new p()), mediaMetadataCompat2, this.f11126y, j11);
                } else {
                    i.q("mediaSource");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
        i.q("mediaSource");
        throw null;
    }
}
