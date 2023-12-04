package com.ifriend.ui.base.mvvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/ui/base/mvvm/BaseState;", "", "()V", "errors", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "addError", "", "error", "clearErrors", "deleteError", "getErrors", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseState {
    public static final int $stable = 8;
    private final ArrayList<Throwable> errors = new ArrayList<>();

    public final List<Throwable> getErrors() {
        return this.errors;
    }

    public final void addError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.errors.add(error);
    }

    public final void clearErrors() {
        this.errors.clear();
    }

    public final void deleteError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.errors.remove(error);
    }
}
