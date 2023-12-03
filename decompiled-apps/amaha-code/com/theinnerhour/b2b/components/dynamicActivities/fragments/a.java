package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import androidx.fragment.app.p;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: N10ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class a extends k implements l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N10ScreenFragment f11106u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(N10ScreenFragment n10ScreenFragment) {
        super(1);
        this.f11106u = n10ScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        NewDynamicParentActivity newDynamicParentActivity;
        p requireActivity = this.f11106u.requireActivity();
        if (requireActivity instanceof NewDynamicParentActivity) {
            newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
        } else {
            newDynamicParentActivity = null;
        }
        if (newDynamicParentActivity != null) {
            int i6 = NewDynamicParentActivity.F;
            newDynamicParentActivity.L0(false);
        }
        return hs.k.f19476a;
    }
}
