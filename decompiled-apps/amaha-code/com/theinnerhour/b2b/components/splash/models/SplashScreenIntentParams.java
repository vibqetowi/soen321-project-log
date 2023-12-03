package com.theinnerhour.b2b.components.splash.models;

import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: SplashScreenIntentParams.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/components/splash/models/SplashScreenIntentParams;", "", "isLoggedIn", "", "courseSelectionRequired", "(ZZ)V", "getCourseSelectionRequired", "()Z", "setCourseSelectionRequired", "(Z)V", "setLoggedIn", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SplashScreenIntentParams {
    private boolean courseSelectionRequired;
    private boolean isLoggedIn;

    public SplashScreenIntentParams(boolean z10, boolean z11) {
        this.isLoggedIn = z10;
        this.courseSelectionRequired = z11;
    }

    public final boolean getCourseSelectionRequired() {
        return this.courseSelectionRequired;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final void setCourseSelectionRequired(boolean z10) {
        this.courseSelectionRequired = z10;
    }

    public final void setLoggedIn(boolean z10) {
        this.isLoggedIn = z10;
    }
}
