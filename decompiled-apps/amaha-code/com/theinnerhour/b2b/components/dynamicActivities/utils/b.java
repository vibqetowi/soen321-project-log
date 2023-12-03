package com.theinnerhour.b2b.components.dynamicActivities.utils;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.exoplayer2.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ql.s;
import ss.l;
/* compiled from: MusicService.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MusicService f11127u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f11128v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f11129w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f11130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MusicService musicService, String str, Bundle bundle, boolean z10) {
        super(1);
        this.f11127u = musicService;
        this.f11128v = str;
        this.f11129w = bundle;
        this.f11130x = z10;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        bool.booleanValue();
        MusicService musicService = this.f11127u;
        s sVar = musicService.C;
        if (sVar != null) {
            Bundle bundle = this.f11129w;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            i.f(bundle, "extras ?: Bundle.EMPTY");
            List<MediaMetadataCompat> u10 = sVar.u(bundle, this.f11128v);
            if (!u10.isEmpty()) {
                u10.get(0);
                musicService.I = u10;
                w wVar = musicService.D;
                if (wVar != null) {
                    wVar.z(this.f11130x);
                    w wVar2 = musicService.D;
                    if (wVar2 != null) {
                        wVar2.stop();
                        w wVar3 = musicService.D;
                        if (wVar3 != null) {
                            ArrayList arrayList = new ArrayList(is.i.H1(u10, 10));
                            for (MediaMetadataCompat mediaMetadataCompat : u10) {
                                arrayList.add(ca.a.x1(mediaMetadataCompat));
                            }
                            wVar3.g(arrayList, 0, -9223372036854775807L);
                            w wVar4 = musicService.D;
                            if (wVar4 != null) {
                                wVar4.l();
                            } else {
                                i.q("currentPlayer");
                                throw null;
                            }
                        } else {
                            i.q("currentPlayer");
                            throw null;
                        }
                    } else {
                        i.q("currentPlayer");
                        throw null;
                    }
                } else {
                    i.q("currentPlayer");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
        i.q("mediaSource");
        throw null;
    }
}
