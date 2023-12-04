package com.ifriend.presentation.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewModelExt.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\rH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028À\u0002X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"unknownViewModelException", "", "", "getUnknownViewModelException$annotations", "(Ljava/lang/Object;)V", "getUnknownViewModelException", "(Ljava/lang/Object;)Ljava/lang/Void;", "daggerViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "viewModelInstanceCreator", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewModelExtKt {
    public static /* synthetic */ void getUnknownViewModelException$annotations(Object obj) {
    }

    public static final Void getUnknownViewModelException(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }

    public static final /* synthetic */ <T extends ViewModel> T daggerViewModel(String str, final Function0<? extends T> viewModelInstanceCreator, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModelInstanceCreator, "viewModelInstanceCreator");
        composer.startReplaceableGroup(-1813244656);
        ComposerKt.sourceInformation(composer, "CC(daggerViewModel)");
        if ((i2 & 1) != 0) {
            str = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) ViewModelKt.viewModel(ViewModel.class, null, str, new ViewModelProvider.Factory() { // from class: com.ifriend.presentation.extensions.ViewModelExtKt$daggerViewModel$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Object invoke = viewModelInstanceCreator.invoke();
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of com.ifriend.presentation.extensions.ViewModelExtKt.daggerViewModel.<no name provided>.create");
                return (T) invoke;
            }
        }, null, composer, ((i << 6) & 896) | 8, 18);
        composer.endReplaceableGroup();
        return t;
    }
}
