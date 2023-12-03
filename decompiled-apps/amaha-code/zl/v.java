package zl;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
/* compiled from: ExpertCareViewModel.kt */
/* loaded from: classes2.dex */
public final class v extends l0 {
    public final w<List<TherapistPackagesModel>> A;
    public final w<String> B;
    public String C;
    public final String D;

    /* renamed from: x  reason: collision with root package name */
    public final yl.b f39602x;

    /* renamed from: y  reason: collision with root package name */
    public final w<xl.b> f39603y;

    /* renamed from: z  reason: collision with root package name */
    public final w<vl.c> f39604z;

    public v(yl.b expertCareRepository) {
        kotlin.jvm.internal.i.g(expertCareRepository, "expertCareRepository");
        this.f39602x = expertCareRepository;
        this.f39603y = new w<>();
        this.f39604z = new w<>();
        this.A = new w<>();
        this.B = new w<>();
        this.D = LogHelper.INSTANCE.makeLogTag("ExpertCareViewModel");
    }
}
