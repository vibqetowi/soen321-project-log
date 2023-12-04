package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.State;
import kotlin.Metadata;
/* compiled from: ExceptionListenerRegistry.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\tJ\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\n"}, d2 = {"Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "", "addExceptionListener", "", "exceptionListener", "Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry$ExceptionListener;", "removeExceptionListener", "ExceptionListener", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ExceptionListenerRegistry<S extends State> {

    /* compiled from: ExceptionListenerRegistry.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry$ExceptionListener;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "", "onException", "", "system", "Lcom/ifriend/common_entities_engine/System;", "exception", "", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface ExceptionListener<S extends State> {
        void onException(System<S> system, Throwable th);
    }

    void addExceptionListener(ExceptionListener<S> exceptionListener);

    void removeExceptionListener(ExceptionListener<S> exceptionListener);
}
