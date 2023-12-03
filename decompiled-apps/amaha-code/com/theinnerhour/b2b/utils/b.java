package com.theinnerhour.b2b.utils;

import android.app.Dialog;
import android.view.View;
import android.view.animation.Animation;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f11789u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FeedBackUtils f11790v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f11791w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f11792x;

    public /* synthetic */ b(Animation animation, FeedBackUtils feedBackUtils, Animation animation2) {
        this.f11789u = 5;
        this.f11791w = animation;
        this.f11790v = feedBackUtils;
        this.f11792x = animation2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f11789u;
        FeedBackUtils feedBackUtils = this.f11790v;
        Object obj = this.f11792x;
        Object obj2 = this.f11791w;
        switch (i6) {
            case 0:
                FeedBackUtils.d(feedBackUtils, (Dialog) obj2, (String) obj, view);
                return;
            case 1:
                FeedBackUtils.a(feedBackUtils, (Dialog) obj2, (String) obj, view);
                return;
            case 2:
                FeedBackUtils.k(feedBackUtils, (Dialog) obj2, (String) obj, view);
                return;
            case 3:
                FeedBackUtils.b(feedBackUtils, (Dialog) obj2, (String) obj, view);
                return;
            case 4:
                FeedBackUtils.i(feedBackUtils, (Dialog) obj2, (String) obj, view);
                return;
            default:
                FeedBackUtils.e((Animation) obj2, feedBackUtils, (Animation) obj, view);
                return;
        }
    }

    public /* synthetic */ b(FeedBackUtils feedBackUtils, Dialog dialog, String str, int i6) {
        this.f11789u = i6;
        this.f11790v = feedBackUtils;
        this.f11791w = dialog;
        this.f11792x = str;
    }
}
