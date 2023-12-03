package com.theinnerhour.b2b.utils;

import com.bugsnag.android.Event;
import com.bugsnag.android.OnErrorCallback;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements OnErrorCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11804b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11805c;

    public /* synthetic */ g(String str, String str2, int i6) {
        this.f11803a = i6;
        this.f11804b = str;
        this.f11805c = str2;
    }

    @Override // com.bugsnag.android.OnErrorCallback
    public final boolean onError(Event event) {
        boolean e$lambda$6;
        boolean e$lambda$1;
        boolean e$lambda$5;
        int i6 = this.f11803a;
        String str = this.f11805c;
        String str2 = this.f11804b;
        switch (i6) {
            case 0:
                e$lambda$1 = LogHelper.e$lambda$1(str2, str, event);
                return e$lambda$1;
            case 1:
                e$lambda$5 = LogHelper.e$lambda$5(str2, str, event);
                return e$lambda$5;
            default:
                e$lambda$6 = LogHelper.e$lambda$6(str2, str, event);
                return e$lambda$6;
        }
    }
}
