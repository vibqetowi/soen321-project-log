package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.HashMap;
import java.util.List;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
/* loaded from: classes2.dex */
public final class k0 extends androidx.lifecycle.l0 {
    public final kotlinx.coroutines.flow.x A;
    public final HashMap<String, LearningHubModel> B;
    public final HashMap<String, LibraryCollection> C;
    public final HashMap<String, MiniCourse> D;
    public final HashMap<String, MiniCourseMetadata> E;
    public final HashMap<String, SuggestedActivityModel> F;
    public final HashMap<String, String> G;
    public final androidx.lifecycle.w<Boolean> H;

    /* renamed from: x  reason: collision with root package name */
    public final cn.e1 f22259x;

    /* renamed from: y  reason: collision with root package name */
    public final String f22260y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<List<UserLibraryItemAccessModel>> f22261z;

    public k0(cn.e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f22259x = repository;
        this.f22260y = LogHelper.INSTANCE.makeLogTag(k0.class);
        this.f22261z = new androidx.lifecycle.w<>();
        this.A = tr.r.f(0L);
        this.B = new HashMap<>();
        this.C = new HashMap<>();
        this.D = new HashMap<>();
        this.E = new HashMap<>();
        this.F = new HashMap<>();
        this.G = new HashMap<>();
        this.H = new androidx.lifecycle.w<>();
    }
}
