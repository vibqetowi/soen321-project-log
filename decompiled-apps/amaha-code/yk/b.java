package yk;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: CommunitiesPwaViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends androidx.lifecycle.b {
    public final w<String> A;
    public final w<Boolean> B;
    public final wk.b C;

    /* renamed from: y  reason: collision with root package name */
    public final String f38663y;

    /* renamed from: z  reason: collision with root package name */
    public final w<String> f38664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Application application) {
        super(application);
        i.g(application, "application");
        this.f38663y = LogHelper.INSTANCE.makeLogTag("CommunitiesPwaViewModel");
        this.f38664z = new w<>();
        this.A = new w<>();
        this.B = new w<>();
        Context applicationContext = application.getApplicationContext();
        i.f(applicationContext, "application.applicationContext");
        wk.b bVar = new wk.b(applicationContext);
        this.C = bVar;
        this.A = bVar.f36743c;
        this.B = bVar.f36744d;
    }
}
