package yk;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.utils.LogHelper;
import kc.f;
import kotlin.jvm.internal.i;
/* compiled from: CommunityDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends l0 {
    public final w<vk.a> A;

    /* renamed from: x  reason: collision with root package name */
    public final f f38674x;

    /* renamed from: y  reason: collision with root package name */
    public final String f38675y;

    /* renamed from: z  reason: collision with root package name */
    public final w<vk.d> f38676z;

    public e(f repository) {
        i.g(repository, "repository");
        this.f38674x = repository;
        this.f38675y = LogHelper.INSTANCE.makeLogTag("CommunityDashboardViewModel");
        this.f38676z = new w<>();
        this.A = new w<>();
    }
}
