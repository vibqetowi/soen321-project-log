package com.ifriend.chat.presentation.ui;

import android.app.Activity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppActivity$googleSignInClient$2 extends Lambda implements Function0<GoogleSignInClient> {
    final /* synthetic */ AppActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$googleSignInClient$2(AppActivity appActivity) {
        super(0);
        this.this$0 = appActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GoogleSignInClient invoke() {
        return GoogleSignIn.getClient((Activity) this.this$0, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build());
    }
}
