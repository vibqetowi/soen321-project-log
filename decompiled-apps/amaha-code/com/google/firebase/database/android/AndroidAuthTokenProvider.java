package com.google.firebase.database.android;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import fd.g;
import hd.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import q7.f;
import ya.j;
import ya.v;
/* loaded from: classes.dex */
public class AndroidAuthTokenProvider implements TokenProvider {
    private final re.a<gd.b> deferredAuthProvider;
    private final AtomicReference<gd.b> internalAuth = new AtomicReference<>();

    public AndroidAuthTokenProvider(re.a<gd.b> aVar) {
        this.deferredAuthProvider = aVar;
        ((n) aVar).a(new f0.b(29, this));
    }

    private static boolean isUnauthenticatedUsage(Exception exc) {
        if (!(exc instanceof FirebaseApiNotAvailableException) && !(exc instanceof FirebaseNoSignedInUserException)) {
            return false;
        }
        return true;
    }

    public static void lambda$addTokenChangeListener$3(TokenProvider.TokenChangeListener tokenChangeListener, we.b bVar) {
        tokenChangeListener.onTokenChange(bVar.f36688a);
    }

    public static /* synthetic */ void lambda$addTokenChangeListener$4(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, we.b bVar) {
        executorService.execute(new f(tokenChangeListener, 19, bVar));
    }

    public static /* synthetic */ void lambda$addTokenChangeListener$5(final ExecutorService executorService, final TokenProvider.TokenChangeListener tokenChangeListener, re.b bVar) {
        ((gd.b) bVar.get()).b(new gd.a() { // from class: com.google.firebase.database.android.e
            @Override // gd.a
            public final void a(we.b bVar2) {
                AndroidAuthTokenProvider.lambda$addTokenChangeListener$4(executorService, tokenChangeListener, bVar2);
            }
        });
    }

    public static void lambda$getToken$1(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, g gVar) {
        getTokenCompletionListener.onSuccess(gVar.f14954a);
    }

    public static /* synthetic */ void lambda$getToken$2(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, Exception exc) {
        if (isUnauthenticatedUsage(exc)) {
            getTokenCompletionListener.onSuccess(null);
        } else {
            getTokenCompletionListener.onError(exc.getMessage());
        }
    }

    public /* synthetic */ void lambda$new$0(re.b bVar) {
        this.internalAuth.set((gd.b) bVar.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener) {
        ((n) this.deferredAuthProvider).a(new c(executorService, tokenChangeListener, 1));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void getToken(boolean z10, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        gd.b bVar = this.internalAuth.get();
        if (bVar != null) {
            v c10 = bVar.c(z10);
            a aVar = new a(getTokenCompletionListener, 1);
            c10.getClass();
            c10.addOnSuccessListener(j.f38393a, aVar);
            c10.addOnFailureListener(new b(getTokenCompletionListener, 1));
            return;
        }
        getTokenCompletionListener.onSuccess(null);
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}
