package androidx.activity;

import android.window.OnBackInvokedCallback;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f970a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f971b;

    public /* synthetic */ i(Runnable runnable, int i6) {
        this.f970a = i6;
        this.f971b = runnable;
    }

    public final void onBackInvoked() {
        switch (this.f970a) {
            case 0:
            default:
                this.f971b.run();
                return;
        }
    }
}
