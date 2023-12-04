package by.kirich1409.viewbindingdelegate;

import kotlin.Metadata;
/* compiled from: ViewBindingProperty.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"ERROR_ACCESS_AFTER_DESTROY", "", "ERROR_ACCESS_BEFORE_VIEW_READY", "ERROR_VIEW_NOT_INITIALIZED", "TAG", "com.github.kirich1409.ViewBindingPropertyDelegate.noreflection"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewBindingPropertyKt {
    private static final String ERROR_ACCESS_AFTER_DESTROY = "Access to viewBinding after Lifecycle is destroyed or hasn't created yet. The instance of viewBinding will be not cached.";
    private static final String ERROR_ACCESS_BEFORE_VIEW_READY = "Host view isn't ready to create a ViewBinding instance";
    private static final String ERROR_VIEW_NOT_INITIALIZED = "Host view isn't ready. LifecycleViewBindingProperty.isViewInitialized return false";
    private static final String TAG = "ViewBindingProperty";
}
