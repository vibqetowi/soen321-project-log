package com.ifriend.registration.presentation.bridges.facebook;

import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.ifriend.registration.domain.useCase.facebook.FacebookAccountData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: FacebookAuthorizationBridge.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J2\u0010\u0006\u001a\u00020\u00032\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&¨\u0006\r"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationBridge;", "", "loginInFacebook", "", "fragment", "Landroidx/fragment/app/Fragment;", "subscribeOnLogin", "onSuccessLogin", "Lkotlin/Function2;", "Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "Lcom/facebook/AccessToken;", "onFailure", "Lkotlin/Function0;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FacebookAuthorizationBridge {
    void loginInFacebook(Fragment fragment);

    void subscribeOnLogin(Function2<? super FacebookAccountData, ? super AccessToken, Unit> function2, Function0<Unit> function0);
}
