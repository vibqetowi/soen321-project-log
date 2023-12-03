package ta;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public /* synthetic */ class x3 implements f4 {

    /* renamed from: u  reason: collision with root package name */
    public final y3 f32943u;

    public /* synthetic */ x3(y3 y3Var) {
        this.f32943u = y3Var;
    }

    @Override // ta.f4
    public final w3 a() {
        throw null;
    }

    @Override // ta.f4
    public final w2 b() {
        throw null;
    }

    @Override // ta.f4
    public final aa.c c() {
        throw null;
    }

    @Override // ta.f4
    public final kotlinx.coroutines.e0 d() {
        throw null;
    }

    @Override // ta.f4
    public final Context f() {
        throw null;
    }

    public boolean g() {
        y3 y3Var = this.f32943u;
        if (TextUtils.isEmpty(y3Var.f32954v)) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            if (Log.isLoggable(w2Var.t(), 3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void h() {
        w3 w3Var = this.f32943u.D;
        y3.k(w3Var);
        w3Var.h();
    }

    public x3(y3 y3Var, int i6) {
        if (i6 != 1) {
            this.f32943u = y3Var;
            return;
        }
        v9.o.h(y3Var);
        this.f32943u = y3Var;
    }
}
