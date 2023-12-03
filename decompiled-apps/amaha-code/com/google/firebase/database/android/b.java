package com.google.firebase.database.android;

import com.google.firebase.database.core.TokenProvider;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TokenProvider.GetTokenCompletionListener f9568b;

    public /* synthetic */ b(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, int i6) {
        this.f9567a = i6;
        this.f9568b = getTokenCompletionListener;
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        int i6 = this.f9567a;
        TokenProvider.GetTokenCompletionListener getTokenCompletionListener = this.f9568b;
        switch (i6) {
            case 0:
                AndroidAppCheckTokenProvider.f(getTokenCompletionListener, exc);
                return;
            default:
                AndroidAuthTokenProvider.e(getTokenCompletionListener, exc);
                return;
        }
    }
}
