package androidx.activity;

import android.content.Context;
import androidx.fragment.app.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f958b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i6) {
        this.f957a = i6;
        this.f958b = componentActivity;
    }

    @Override // d.b
    public final void a(Context context) {
        int i6 = this.f957a;
        ComponentActivity componentActivity = this.f958b;
        switch (i6) {
            case 0:
                ComponentActivity.e0(componentActivity, context);
                return;
            default:
                p.i0((p) componentActivity, context);
                return;
        }
    }
}
