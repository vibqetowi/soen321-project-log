package pm;

import android.app.Application;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
/* compiled from: JournalFirebaseViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class f extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f28720b;

    /* renamed from: c  reason: collision with root package name */
    public final a f28721c;

    /* renamed from: d  reason: collision with root package name */
    public final Application f28722d;

    public f(a aVar, Application application, int i6) {
        this.f28720b = i6;
        if (i6 != 1) {
            this.f28721c = aVar;
            this.f28722d = application;
            return;
        }
        this.f28721c = aVar;
        this.f28722d = application;
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final l0 a(Class cls) {
        int i6 = this.f28720b;
        Application application = this.f28722d;
        a aVar = this.f28721c;
        switch (i6) {
            case 0:
                return new um.c(aVar, application);
            default:
                return new tm.e(aVar, application);
        }
    }
}
