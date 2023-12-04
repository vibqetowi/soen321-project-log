package com.ifriend.registration.presentation.bridges.google;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleAuthorizationAdapter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class GoogleAuthorizationAdapter$init$1 implements ActivityResultCallback, FunctionAdapter {
    final /* synthetic */ GoogleAuthorizationAdapter $tmp0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleAuthorizationAdapter$init$1(GoogleAuthorizationAdapter googleAuthorizationAdapter) {
        this.$tmp0 = googleAuthorizationAdapter;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, GoogleAuthorizationAdapter.class, "activityResultCallback", "activityResultCallback(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(ActivityResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.$tmp0.activityResultCallback(p0);
    }
}
