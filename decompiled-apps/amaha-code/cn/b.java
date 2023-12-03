package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.List;
/* compiled from: AllCollectionsViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends androidx.lifecycle.l0 {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final e1 f5411x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5412y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<SingleUseEvent<List<LibraryCollection>>> f5413z;

    public b(e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f5411x = repository;
        this.f5412y = LogHelper.INSTANCE.makeLogTag("AllCollectionsViewModel");
        this.f5413z = new androidx.lifecycle.w<>();
        String d10 = ri.e.d(Constants.LIBRARY_EXPERIMENT_V3);
        d10 = kotlin.jvm.internal.i.b(d10, "default") ? null : d10;
        this.A = (String) (d10 == null ? "variant_a" : d10);
    }
}
