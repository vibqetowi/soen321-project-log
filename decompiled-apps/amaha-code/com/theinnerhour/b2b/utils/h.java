package com.theinnerhour.b2b.utils;

import com.bugsnag.android.Event;
import com.bugsnag.android.OnErrorCallback;
import java.io.Serializable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements OnErrorCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11807b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Serializable f11808c;

    public /* synthetic */ h(String str, Serializable serializable, int i6) {
        this.f11806a = i6;
        this.f11807b = str;
        this.f11808c = serializable;
    }

    @Override // com.bugsnag.android.OnErrorCallback
    public final boolean onError(Event event) {
        boolean e$lambda$4;
        boolean e$lambda$3;
        int i6 = this.f11806a;
        String str = this.f11807b;
        Serializable serializable = this.f11808c;
        switch (i6) {
            case 0:
                e$lambda$3 = LogHelper.e$lambda$3(str, (Object[]) serializable, event);
                return e$lambda$3;
            default:
                e$lambda$4 = LogHelper.e$lambda$4(str, (Throwable) serializable, event);
                return e$lambda$4;
        }
    }
}
