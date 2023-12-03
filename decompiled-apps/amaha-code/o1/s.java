package o1;

import android.media.VolumeProvider;
import r1.l;
/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public final class s extends VolumeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f26978a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, int i6, int i10, int i11, String str) {
        super(i6, i10, i11, str);
        this.f26978a = uVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i6) {
        r1.p pVar = (r1.p) this.f26978a;
        l.d.this.f30307k.post(new r1.o(pVar, i6));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i6) {
        r1.p pVar = (r1.p) this.f26978a;
        l.d.this.f30307k.post(new r1.n(pVar, i6));
    }
}
