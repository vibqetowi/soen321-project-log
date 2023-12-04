package com.ifriend.data.common;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoreExecuteCatching.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J@\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\b\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/common/CoreExecuteCatching;", "", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CoreExecuteCatching {
    <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation);

    <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation);
}
