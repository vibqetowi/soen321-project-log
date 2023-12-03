package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
/* compiled from: RenderTask.java */
/* loaded from: classes2.dex */
public final class e extends f {
    public e(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        b bVar = this.f28582u;
        long n10 = bVar.A.n(bVar.f28573z);
        if (n10 >= 0) {
            this.f28582u.f28570w = SystemClock.uptimeMillis() + n10;
            if (this.f28582u.isVisible() && this.f28582u.f28569v) {
                b bVar2 = this.f28582u;
                if (!bVar2.F) {
                    bVar2.f28568u.remove(this);
                    b bVar3 = this.f28582u;
                    bVar3.J = bVar3.f28568u.schedule(this, n10, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f28582u.B.isEmpty() && this.f28582u.A.a() == this.f28582u.A.h() - 1) {
                b bVar4 = this.f28582u;
                bw.d dVar = bVar4.G;
                GifInfoHandle gifInfoHandle = bVar4.A;
                int b10 = gifInfoHandle.b();
                if (b10 != 0 && b10 >= gifInfoHandle.f()) {
                    b10--;
                }
                dVar.sendEmptyMessageAtTime(b10, this.f28582u.f28570w);
            }
        } else {
            b bVar5 = this.f28582u;
            bVar5.f28570w = Long.MIN_VALUE;
            bVar5.f28569v = false;
        }
        if (this.f28582u.isVisible() && !this.f28582u.G.hasMessages(-1)) {
            this.f28582u.G.sendEmptyMessageAtTime(-1, 0L);
        }
    }
}
