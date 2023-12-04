package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class windowExtensionsClass;
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean doesReturn;
        windowExtensionsClass = SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(this.$classLoader);
        boolean z = false;
        Method getWindowLayoutComponentMethod = windowExtensionsClass.getMethod("getWindowLayoutComponent", new Class[0]);
        windowLayoutComponentClass = SafeWindowLayoutComponentProvider.INSTANCE.windowLayoutComponentClass(this.$classLoader);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(getWindowLayoutComponentMethod);
        if (isPublic) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
            doesReturn = safeWindowLayoutComponentProvider2.doesReturn(getWindowLayoutComponentMethod, windowLayoutComponentClass);
            if (doesReturn) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
