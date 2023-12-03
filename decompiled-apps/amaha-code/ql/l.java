package ql;

import android.media.session.MediaController;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import ql.i;
/* compiled from: AudioViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioViewModel$setupDownloadedMedia$1", f = "AudioViewModel.kt", l = {235, 237}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29747u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f29748v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i.a f29749w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f29750x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f29751y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, i.a aVar, long j10, boolean z10, ls.d<? super l> dVar) {
        super(2, dVar);
        this.f29748v = iVar;
        this.f29749w = aVar;
        this.f29750x = j10;
        this.f29751y = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new l(this.f29748v, this.f29749w, this.f29750x, this.f29751y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f29747u;
        i iVar = this.f29748v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    MediaControllerCompat.e a10 = iVar.I.a();
                    String str = this.f29749w.f29730a;
                    MediaController.TransportControls transportControls = a10.f876a;
                    transportControls.playFromMediaId(str, null);
                    transportControls.seekTo(this.f29750x);
                    if (this.f29751y) {
                        transportControls.pause();
                    }
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            if (iVar.I.f29773h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Log.d("AudioTag", "delayCalled");
                this.f29747u = 1;
                if (ca.a.P(200L, this) == aVar) {
                    return aVar;
                }
            }
        }
        this.f29747u = 2;
        if (ca.a.P(200L, this) == aVar) {
            return aVar;
        }
        MediaControllerCompat.e a102 = iVar.I.a();
        String str2 = this.f29749w.f29730a;
        MediaController.TransportControls transportControls2 = a102.f876a;
        transportControls2.playFromMediaId(str2, null);
        transportControls2.seekTo(this.f29750x);
        if (this.f29751y) {
        }
        return hs.k.f19476a;
    }
}
