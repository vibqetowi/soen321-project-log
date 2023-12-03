package com.google.firebase.database.android;

import com.google.firebase.database.core.TokenProvider;
import java.util.concurrent.ExecutorService;
import re.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a.InterfaceC0519a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9569u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f9570v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TokenProvider.TokenChangeListener f9571w;

    public /* synthetic */ c(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, int i6) {
        this.f9569u = i6;
        this.f9570v = executorService;
        this.f9571w = tokenChangeListener;
    }

    @Override // re.a.InterfaceC0519a
    public final void i(re.b bVar) {
        int i6 = this.f9569u;
        TokenProvider.TokenChangeListener tokenChangeListener = this.f9571w;
        ExecutorService executorService = this.f9570v;
        switch (i6) {
            case 0:
                AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$5(executorService, tokenChangeListener, bVar);
                return;
            default:
                AndroidAuthTokenProvider.lambda$addTokenChangeListener$5(executorService, tokenChangeListener, bVar);
                return;
        }
    }
}
