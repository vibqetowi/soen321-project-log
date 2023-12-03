package n9;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import k9.m;
import m9.l;
import v9.o;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i extends MediaSessionCompat.a {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ j f25960z;

    public i(j jVar) {
        this.f25960z = jVar;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void B() {
        this.f25960z.f25969i.j();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void Q(long j10) {
        m mVar = new m(j10, 0, null);
        m9.g gVar = this.f25960z.f25969i;
        gVar.getClass();
        o.d("Must be called from the main thread.");
        if (!gVar.n()) {
            m9.g.m();
        } else {
            m9.g.o(new l(gVar, mVar));
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final boolean p(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) {
                this.f25960z.f25969i.j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void u() {
        this.f25960z.f25969i.j();
    }
}
