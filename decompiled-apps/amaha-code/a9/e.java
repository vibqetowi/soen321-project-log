package a9;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import c9.h;
import c9.j;
import com.google.android.exoplayer2.w;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Handler.Callback {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f387u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f388v;

    public /* synthetic */ e(int i6, Object obj) {
        this.f387u = i6;
        this.f388v = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i6 = this.f387u;
        Object obj = this.f388v;
        switch (i6) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                int i10 = message.what;
                if (i10 != 0) {
                    if (i10 != 1) {
                        return false;
                    }
                    w wVar = fVar.f404q;
                    if (wVar != null && fVar.r && fVar.f405s == message.arg1) {
                        fVar.d(wVar, (Bitmap) message.obj);
                    }
                } else {
                    w wVar2 = fVar.f404q;
                    if (wVar2 != null) {
                        fVar.d(wVar2, null);
                    }
                }
                return true;
            default:
                c9.j jVar = (c9.j) obj;
                Iterator it = jVar.f5144d.iterator();
                while (it.hasNext()) {
                    j.c cVar = (j.c) it.next();
                    if (!cVar.f5150d && cVar.f5149c) {
                        c9.h b10 = cVar.f5148b.b();
                        cVar.f5148b = new h.a();
                        cVar.f5149c = false;
                        jVar.f5143c.f(cVar.f5147a, b10);
                    }
                    if (jVar.f5142b.a()) {
                        return true;
                    }
                }
                return true;
        }
    }
}
