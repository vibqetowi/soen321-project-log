package jl;

import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
/* compiled from: LibraryLogViewModel.kt */
/* loaded from: classes2.dex */
public final class a0 extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<List<LogModel>> A;

    /* renamed from: x  reason: collision with root package name */
    public final cn.e1 f22079x;

    /* renamed from: y  reason: collision with root package name */
    public final String f22080y;

    /* renamed from: z  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.b f22081z;

    public a0(cn.e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f22079x = repository;
        this.f22080y = LogHelper.INSTANCE.makeLogTag("LibraryLogViewModel");
        this.f22081z = kotlinx.coroutines.o0.f23642c;
        this.A = new androidx.lifecycle.w<>();
    }
}
