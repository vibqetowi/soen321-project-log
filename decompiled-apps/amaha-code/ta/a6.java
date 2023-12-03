package ta;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class a6 implements y2, j6 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d6 f32474u;

    public /* synthetic */ a6(d6 d6Var) {
        this.f32474u = d6Var;
    }

    @Override // ta.y2
    public final void c(String str, int i6, Throwable th2, byte[] bArr, Map map) {
        this.f32474u.l(str, i6, th2, bArr, map);
    }

    @Override // ta.j6
    public final void i(String str, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        d6 d6Var = this.f32474u;
        if (isEmpty) {
            y3 y3Var = d6Var.F;
            if (y3Var != null) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        d6Var.a().p(new o4(this, str, bundle));
    }
}
