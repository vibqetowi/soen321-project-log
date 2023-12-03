package com.google.firebase.database.android;

import com.google.firebase.database.core.TokenProvider;
import fd.g;
import ya.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TokenProvider.GetTokenCompletionListener f9566b;

    public /* synthetic */ a(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, int i6) {
        this.f9565a = i6;
        this.f9566b = getTokenCompletionListener;
    }

    @Override // ya.f
    public final void onSuccess(Object obj) {
        int i6 = this.f9565a;
        TokenProvider.GetTokenCompletionListener getTokenCompletionListener = this.f9566b;
        switch (i6) {
            case 0:
                AndroidAppCheckTokenProvider.lambda$getToken$1(getTokenCompletionListener, (zc.c) obj);
                return;
            default:
                AndroidAuthTokenProvider.lambda$getToken$1(getTokenCompletionListener, (g) obj);
                return;
        }
    }
}
