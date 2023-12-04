package com.ifriend.core.utils;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResettableLazy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ifriend/core/utils/ResettableLazyImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/core/utils/ResettableLazy;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "reset", "", "toString", "", "utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ResettableLazyImpl<T> implements ResettableLazy<T> {
    private volatile Object _value;
    private final Function0<T> initializer;
    private final Object lock;

    /* JADX WARN: Multi-variable type inference failed */
    public ResettableLazyImpl(Function0<? extends T> initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = UninitializedValue.INSTANCE;
        this.lock = obj == null ? this : obj;
    }

    public /* synthetic */ ResettableLazyImpl(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        if (t2 != UninitializedValue.INSTANCE) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == UninitializedValue.INSTANCE) {
                t = this.initializer.invoke();
                this._value = t;
            }
        }
        return t;
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public void reset() {
        synchronized (this.lock) {
            this._value = UninitializedValue.INSTANCE;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ifriend.core.utils.ResettableLazy
    public boolean isInitialized() {
        return this._value != UninitializedValue.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
