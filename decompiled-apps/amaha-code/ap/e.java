package ap;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k;
/* compiled from: RecommendedActivityRepository.kt */
/* loaded from: classes2.dex */
public final class e implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> f3393b;

    public e(f fVar, k kVar) {
        this.f3392a = fVar;
        this.f3393b = kVar;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        i.g(it, "it");
        LogHelper logHelper = LogHelper.INSTANCE;
        String str = this.f3392a.f3394a;
        logHelper.e(str, "on failure listener fetch learning hub content " + it);
        j<hs.f<? extends ArrayList<RecommendedActivityModel>, ? extends ArrayList<String>>> jVar = this.f3393b;
        if (jVar.a()) {
            jVar.resumeWith(null);
        }
    }
}
