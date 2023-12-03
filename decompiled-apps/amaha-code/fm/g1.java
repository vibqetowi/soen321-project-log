package fm;

import com.theinnerhour.b2b.model.Goal;
import java.util.ArrayList;
/* compiled from: GoalMigrationViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class g1<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f15342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Goal> f15343b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15344c;

    public g1(kotlin.jvm.internal.v vVar, ArrayList arrayList, kotlinx.coroutines.k kVar) {
        this.f15342a = vVar;
        this.f15343b = arrayList;
        this.f15344c = kVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        kotlin.jvm.internal.i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        kotlinx.coroutines.j<Boolean> jVar = this.f15344c;
        if (isSuccessful) {
            kotlin.jvm.internal.v vVar = this.f15342a;
            int i6 = vVar.f23467u + 1;
            vVar.f23467u = i6;
            if (i6 >= this.f15343b.size()) {
                jVar.resumeWith(Boolean.TRUE);
                return;
            }
            return;
        }
        jVar.resumeWith(Boolean.FALSE);
    }
}
