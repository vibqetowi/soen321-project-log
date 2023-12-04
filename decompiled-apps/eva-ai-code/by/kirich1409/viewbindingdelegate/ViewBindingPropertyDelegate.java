package by.kirich1409.viewbindingdelegate;

import by.kirich1409.viewbindingdelegate.internal.UtilsKt;
import kotlin.Metadata;
/* compiled from: ViewBindingPropertyDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lby/kirich1409/viewbindingdelegate/ViewBindingPropertyDelegate;", "", "()V", "value", "", "strictMode", "getStrictMode", "()Z", "setStrictMode", "(Z)V", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyDelegate {
    public static final ViewBindingPropertyDelegate INSTANCE = new ViewBindingPropertyDelegate();
    private static boolean strictMode = true;

    private ViewBindingPropertyDelegate() {
    }

    public final boolean getStrictMode() {
        return strictMode;
    }

    public final void setStrictMode(boolean z) {
        UtilsKt.checkMainThread();
        strictMode = z;
    }
}
