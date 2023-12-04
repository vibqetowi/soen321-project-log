package com.ifriend.ui.base;

import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ImagePickerObserver.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/ui/base/ImagePickerObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "onImagePicked", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "(Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)V", "getContent", "Landroidx/activity/result/ActivityResultLauncher;", "", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "selectImage", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImagePickerObserver implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private ActivityResultLauncher<String> getContent;
    private final Function1<Uri, Unit> onImagePicked;
    private final ActivityResultRegistry registry;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePickerObserver(ActivityResultRegistry registry, Function1<? super Uri, Unit> onImagePicked) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(onImagePicked, "onImagePicked");
        this.registry = registry;
        this.onImagePicked = onImagePicked;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ActivityResultLauncher<String> register = this.registry.register("image", owner, new GetImageContent(), new ActivityResultCallback<Uri>() { // from class: com.ifriend.ui.base.ImagePickerObserver$onCreate$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                Function1 function1;
                function1 = ImagePickerObserver.this.onImagePicked;
                function1.invoke(uri);
            }
        });
        Intrinsics.checkNotNullExpressionValue(register, "register(...)");
        this.getContent = register;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ActivityResultLauncher<String> activityResultLauncher = this.getContent;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getContent");
            activityResultLauncher = null;
        }
        activityResultLauncher.unregister();
    }

    public final void selectImage() {
        ActivityResultLauncher<String> activityResultLauncher = this.getContent;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getContent");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch("image/*");
    }
}
