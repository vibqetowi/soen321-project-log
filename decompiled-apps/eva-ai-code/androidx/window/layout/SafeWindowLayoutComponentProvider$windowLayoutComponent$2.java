package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SafeWindowLayoutComponentProvider$windowLayoutComponent$2 extends Lambda implements Function0<WindowLayoutComponent> {
    public static final SafeWindowLayoutComponentProvider$windowLayoutComponent$2 INSTANCE = new SafeWindowLayoutComponentProvider$windowLayoutComponent$2();

    SafeWindowLayoutComponentProvider$windowLayoutComponent$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WindowLayoutComponent invoke() {
        boolean canUseWindowLayoutComponent;
        ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if (classLoader != null) {
            canUseWindowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader);
            if (canUseWindowLayoutComponent) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
