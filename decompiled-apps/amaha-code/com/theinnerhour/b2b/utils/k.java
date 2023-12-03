package com.theinnerhour.b2b.utils;

import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f11813u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotificationPermissionBottomSheet f11814v;

    public /* synthetic */ k(NotificationPermissionBottomSheet notificationPermissionBottomSheet, int i6) {
        this.f11813u = i6;
        this.f11814v = notificationPermissionBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f11813u;
        NotificationPermissionBottomSheet notificationPermissionBottomSheet = this.f11814v;
        switch (i6) {
            case 0:
                NotificationPermissionBottomSheet.J(notificationPermissionBottomSheet, view);
                return;
            case 1:
                NotificationPermissionBottomSheet.K(notificationPermissionBottomSheet, view);
                return;
            case 2:
                NotificationPermissionBottomSheet.P(notificationPermissionBottomSheet, view);
                return;
            default:
                NotificationPermissionBottomSheet.O(notificationPermissionBottomSheet, view);
                return;
        }
    }
}
