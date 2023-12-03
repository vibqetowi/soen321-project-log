package ql;

import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import com.bumptech.glide.Glide;
import java.io.File;
/* compiled from: PersistentStorage.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.PersistentStorage$saveRecentSong$2", f = "PersistentStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e0 f29712u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MediaDescriptionCompat f29713v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f29714w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, MediaDescriptionCompat mediaDescriptionCompat, long j10, ls.d<? super f0> dVar) {
        super(2, dVar);
        this.f29712u = e0Var;
        this.f29713v = mediaDescriptionCompat;
        this.f29714w = j10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f0(this.f29712u, this.f29713v, this.f29714w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        e0 e0Var = this.f29712u;
        MediaDescriptionCompat mediaDescriptionCompat = this.f29713v;
        sp.b.d0(obj);
        try {
            com.bumptech.glide.f g5 = Glide.g(e0Var.f29708a);
            g5.getClass();
            com.bumptech.glide.e eVar = new com.bumptech.glide.e(g5.f5956u, g5, File.class, g5.f5957v);
            if (z4.f.U == null) {
                z4.f q10 = new z4.f().q(true);
                if (q10.N && !q10.P) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
                q10.P = true;
                q10.N = true;
                z4.f.U = q10;
            }
            com.bumptech.glide.e x10 = eVar.x(z4.f.U);
            x10.Z = mediaDescriptionCompat.f850z;
            x10.f5953b0 = true;
            z4.d dVar = new z4.d(144, 144);
            x10.A(dVar, dVar, x10, d5.e.f12190b);
            Object obj2 = dVar.get();
            kotlin.jvm.internal.i.f(obj2, "with(context).asFile().l…ON_LARGE_ICON_SIZE).get()");
            uri = new Uri.Builder().scheme("content").authority("com.theinnerhour.b2b").appendPath(((File) obj2).getPath()).build();
            kotlin.jvm.internal.i.f(uri, "Builder()\n        .schem…is.path)\n        .build()");
        } catch (Exception unused) {
            uri = null;
        }
        SharedPreferences.Editor putLong = e0Var.f29709b.edit().putString("recent_song_media_id", mediaDescriptionCompat.f845u).putString("recent_song_title", String.valueOf(mediaDescriptionCompat.f846v)).putString("recent_song_subtitle", String.valueOf(mediaDescriptionCompat.f847w)).putLong("recent_song_position", this.f29714w);
        if (uri != null) {
            putLong.putString("recent_song_icon_uri", uri.toString());
        }
        putLong.apply();
        return hs.k.f19476a;
    }
}
