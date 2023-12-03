package ql;

import android.media.session.MediaController;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.recyclerview.widget.k;
import ql.i;
/* compiled from: AudioViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioViewModel$playMedia$1", f = "AudioViewModel.kt", l = {k.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f29737u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ i f29738v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i.a f29739w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f29740x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f29741y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f29742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, i.a aVar, boolean z10, long j10, boolean z11, ls.d<? super j> dVar) {
        super(2, dVar);
        this.f29738v = iVar;
        this.f29739w = aVar;
        this.f29740x = z10;
        this.f29741y = j10;
        this.f29742z = z11;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j(this.f29738v, this.f29739w, this.f29740x, this.f29741y, this.f29742z, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        int i6;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f29737u;
        boolean z13 = false;
        i iVar = this.f29738v;
        if (i10 != 0) {
            if (i10 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            if (iVar.I.f29773h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f29737u = 1;
                if (ca.a.P(200L, this) == aVar) {
                    return aVar;
                }
            }
        }
        MediaMetadataCompat d10 = iVar.I.f29771e.d();
        q qVar = iVar.I;
        MediaControllerCompat.e a10 = qVar.a();
        PlaybackStateCompat d11 = qVar.f29770d.d();
        if (d11 != null && ((i6 = d11.f915u) == 6 || i6 == 3 || i6 == 2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        MediaController.TransportControls transportControls = a10.f876a;
        i.a aVar2 = this.f29739w;
        if (z11) {
            String str2 = aVar2.f29730a;
            if (d10 != null) {
                str = d10.d("android.media.metadata.MEDIA_ID");
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.i.b(str2, str)) {
                PlaybackStateCompat d12 = qVar.f29770d.d();
                if (d12 != null) {
                    int i11 = d12.f915u;
                    if (i11 != 6 && i11 != 3) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        if (this.f29742z) {
                            transportControls.pause();
                        }
                    } else {
                        long j10 = d12.f919y;
                        if ((4 & j10) != 0 || ((j10 & 512) != 0 && i11 == 2)) {
                            z13 = true;
                        }
                        if (z13) {
                            transportControls.play();
                        } else {
                            new Integer(Log.w("AudioPlaybackViewModel", "Playable item clicked but neither play nor pause are enabled! (mediaId=" + aVar2.f29730a + ')'));
                        }
                    }
                }
                return hs.k.f19476a;
            }
        }
        transportControls.playFromMediaId(aVar2.f29730a, null);
        if (this.f29740x) {
            iVar.f(new Long(this.f29741y));
        }
        return hs.k.f19476a;
    }
}
