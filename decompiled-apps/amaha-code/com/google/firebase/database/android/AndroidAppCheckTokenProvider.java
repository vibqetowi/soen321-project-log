package com.google.firebase.database.android;

import com.google.firebase.database.core.TokenProvider;
import hd.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import q7.f;
/* loaded from: classes.dex */
public class AndroidAppCheckTokenProvider implements TokenProvider {
    private final re.a<cd.b> deferredAppCheckProvider;
    private final AtomicReference<cd.b> internalAppCheck = new AtomicReference<>();

    public AndroidAppCheckTokenProvider(re.a<cd.b> aVar) {
        this.deferredAppCheckProvider = aVar;
        ((n) aVar).a(new f0.b(28, this));
    }

    public static /* synthetic */ void lambda$addTokenChangeListener$3(TokenProvider.TokenChangeListener tokenChangeListener, zc.c cVar) {
        tokenChangeListener.onTokenChange(cVar.b());
    }

    public static /* synthetic */ void lambda$addTokenChangeListener$4(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, zc.c cVar) {
        executorService.execute(new f(tokenChangeListener, 18, cVar));
    }

    public static /* synthetic */ void lambda$addTokenChangeListener$5(final ExecutorService executorService, final TokenProvider.TokenChangeListener tokenChangeListener, re.b bVar) {
        ((cd.b) bVar.get()).a(new cd.a() { // from class: com.google.firebase.database.android.d
            @Override // cd.a
            public final void onAppCheckTokenChanged(zc.c cVar) {
                AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$4(executorService, tokenChangeListener, (ad.c) cVar);
            }
        });
    }

    public static /* synthetic */ void lambda$getToken$1(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, zc.c cVar) {
        getTokenCompletionListener.onSuccess(cVar.b());
    }

    public static /* synthetic */ void lambda$getToken$2(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, Exception exc) {
        getTokenCompletionListener.onError(exc.getMessage());
    }

    public /* synthetic */ void lambda$new$0(re.b bVar) {
        this.internalAppCheck.set((cd.b) bVar.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener) {
        ((n) this.deferredAppCheckProvider).a(new c(executorService, tokenChangeListener, 0));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void getToken(boolean z10, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        cd.b bVar = this.internalAppCheck.get();
        if (bVar != null) {
            bVar.b(z10).addOnSuccessListener(new a(getTokenCompletionListener, 0)).addOnFailureListener(new b(getTokenCompletionListener, 0));
        } else {
            getTokenCompletionListener.onSuccess(null);
        }
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}
