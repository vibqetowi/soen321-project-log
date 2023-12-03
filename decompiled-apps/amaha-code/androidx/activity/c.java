package androidx.activity;

import a2.a;
import android.os.Bundle;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f955a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f956b;

    public /* synthetic */ c(int i6, Object obj) {
        this.f955a = i6;
        this.f956b = obj;
    }

    @Override // a2.a.b
    public final Bundle a() {
        Bundle lambda$new$0;
        Bundle lambda$init$0;
        int i6 = this.f955a;
        Object obj = this.f956b;
        switch (i6) {
            case 0:
                lambda$new$0 = ((ComponentActivity) obj).lambda$new$0();
                return lambda$new$0;
            case 1:
                lambda$init$0 = ((p) obj).lambda$init$0();
                return lambda$init$0;
            default:
                return ((y) obj).f0();
        }
    }
}
