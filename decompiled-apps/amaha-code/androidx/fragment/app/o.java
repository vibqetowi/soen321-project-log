package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcher;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements s0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2256b;

    public /* synthetic */ o(int i6, Object obj) {
        this.f2255a = i6;
        this.f2256b = obj;
    }

    @Override // s0.a
    public final void accept(Object obj) {
        int i6 = this.f2255a;
        Object obj2 = this.f2256b;
        switch (i6) {
            case 0:
                ((p) obj2).lambda$init$1((Configuration) obj);
                return;
            case 1:
                ((p) obj2).lambda$init$2((Intent) obj);
                return;
            default:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj2;
                Boolean bool = (Boolean) obj;
                onBackPressedDispatcher.getClass();
                if (o0.a.a()) {
                    onBackPressedDispatcher.c();
                    return;
                }
                return;
        }
    }
}
