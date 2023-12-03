package com.theinnerhour.b2b.utils;

import ss.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f11802b;

    public /* synthetic */ f(p pVar, int i6) {
        this.f11801a = i6;
        this.f11802b = pVar;
    }

    @Override // ya.d
    public final void a(ya.h hVar) {
        int i6 = this.f11801a;
        p pVar = this.f11802b;
        switch (i6) {
            case 0:
                FireStoreUtilsKt.checkIfActivityPublished$lambda$22(pVar, hVar);
                return;
            case 1:
                FireStoreUtilsKt.fetchCourseContentDurationV3$lambda$28(pVar, hVar);
                return;
            case 2:
                FireStoreUtilsKt.fetchCourseContentDurationV3$lambda$20(pVar, hVar);
                return;
            case 3:
                FireStoreUtilsKt.fetchActiveCampaigns$lambda$24(pVar, hVar);
                return;
            case 4:
                FireStoreUtilsKt.fetchCourseContentV3$lambda$18(pVar, hVar);
                return;
            case 5:
                FireStoreUtilsKt.fetchCourseSpecificLearningHub$lambda$0(pVar, hVar);
                return;
            case 6:
                FireStoreUtilsKt.fetchCourseContent$lambda$14(pVar, hVar);
                return;
            case 7:
                FireStoreUtilsKt.fetchGenericLearningHub$lambda$2(pVar, hVar);
                return;
            default:
                FireStoreUtilsKt.fetchSingleRecommendedActivity$lambda$30(pVar, hVar);
                return;
        }
    }
}
