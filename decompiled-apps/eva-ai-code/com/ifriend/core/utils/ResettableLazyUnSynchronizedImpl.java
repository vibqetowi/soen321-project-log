package com.ifriend.core.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResettableLazy.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ifriend/core/utils/ResettableLazyUnSynchronizedImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/core/utils/ResettableLazy;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "reset", "", "toString", "", "utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ResettableLazyUnSynchronizedImpl<T> implements ResettableLazy<T> {
    private Object _value;
    private final Function0<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ResettableLazyUnSynchronizedImpl(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = UninitializedValue.INSTANCE;
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public T getValue() {
        if (this._value == UninitializedValue.INSTANCE) {
            this._value = this.initializer.invoke();
        }
        return (T) this._value;
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public void reset() {
        this._value = UninitializedValue.INSTANCE;
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public boolean isInitialized() {
        return this._value != UninitializedValue.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
