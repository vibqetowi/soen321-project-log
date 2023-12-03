package cn;

import android.app.Application;
import androidx.lifecycle.o0;
/* compiled from: LibraryViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class z0 extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5842b;

    /* renamed from: c  reason: collision with root package name */
    public final Application f5843c;

    public z0(Application application, int i6) {
        this.f5842b = i6;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    this.f5843c = application;
                    return;
                } else {
                    this.f5843c = application;
                    return;
                }
            }
            this.f5843c = application;
            return;
        }
        this.f5843c = application;
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final androidx.lifecycle.l0 a(Class cls) {
        int i6 = this.f5842b;
        Application application = this.f5843c;
        switch (i6) {
            case 0:
                return new k0(application);
            case 1:
                return new en.a(application);
            case 2:
                return new hp.a(application);
            default:
                return new jp.d(application);
        }
    }
}
