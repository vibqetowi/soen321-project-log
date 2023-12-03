package com.theinnerhour.b2b.utils;

import ss.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f11800b;

    public /* synthetic */ e(p pVar, int i6) {
        this.f11799a = i6;
        this.f11800b = pVar;
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        int i6 = this.f11799a;
        p pVar = this.f11800b;
        switch (i6) {
            case 0:
                FireStoreUtilsKt.i(pVar, exc);
                return;
            case 1:
                FireStoreUtilsKt.p(pVar, exc);
                return;
            case 2:
                FireStoreUtilsKt.n(pVar, exc);
                return;
            case 3:
                FireStoreUtilsKt.q(pVar, exc);
                return;
            case 4:
                FireStoreUtilsKt.fetchCourseContentDurationV3$lambda$21(pVar, exc);
                return;
            case 5:
                FireStoreUtilsKt.fetchActiveCampaigns$lambda$25(pVar, exc);
                return;
            case 6:
                FireStoreUtilsKt.fetchCourseContentV3$lambda$19(pVar, exc);
                return;
            case 7:
                FireStoreUtilsKt.j(pVar, exc);
                return;
            case 8:
                FireStoreUtilsKt.fetchMiniCourseSlugList$lambda$5(pVar, exc);
                return;
            case 9:
                FireStoreUtilsKt.m(pVar, exc);
                return;
            case 10:
                FireStoreUtilsKt.fetchSingleCampaign$lambda$27(pVar, exc);
                return;
            case 11:
                FireStoreUtilsKt.k(pVar, exc);
                return;
            default:
                FireStoreUtilsKt.y(pVar, exc);
                return;
        }
    }
}
