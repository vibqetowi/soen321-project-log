package com.theinnerhour.b2b.model;

import com.android.volley.VolleyError;
import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LoginInterface.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/model/LoginInterface;", "", "Lhs/k;", "notPermitted", "apiFailure", "Lcom/android/volley/VolleyError;", "volleyError", "apiError", "firebaseSuccess", "firebaseFailure", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface LoginInterface {
    void apiError(VolleyError volleyError);

    void apiFailure();

    void firebaseFailure();

    void firebaseSuccess();

    void notPermitted();

    /* compiled from: LoginInterface.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void apiError(LoginInterface loginInterface, VolleyError volleyError) {
            i.g(volleyError, "volleyError");
        }

        public static void apiFailure(LoginInterface loginInterface) {
        }

        public static void notPermitted(LoginInterface loginInterface) {
        }
    }
}
