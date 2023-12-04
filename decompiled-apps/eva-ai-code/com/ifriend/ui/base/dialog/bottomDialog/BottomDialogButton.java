package com.ifriend.ui.base.dialog.bottomDialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BottomDialogButton.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButton;", "", "text", "", "type", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;", "onClickListener", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;Lkotlin/jvm/functions/Function0;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "getText", "()Ljava/lang/String;", "getType", "()Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomDialogButton {
    public static final int $stable = 8;
    private final Function0<Unit> onClickListener;
    private final String text;
    private final BottomDialogButtonType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomDialogButton copy$default(BottomDialogButton bottomDialogButton, String str, BottomDialogButtonType bottomDialogButtonType, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomDialogButton.text;
        }
        if ((i & 2) != 0) {
            bottomDialogButtonType = bottomDialogButton.type;
        }
        if ((i & 4) != 0) {
            function0 = bottomDialogButton.onClickListener;
        }
        return bottomDialogButton.copy(str, bottomDialogButtonType, function0);
    }

    public final String component1() {
        return this.text;
    }

    public final BottomDialogButtonType component2() {
        return this.type;
    }

    public final Function0<Unit> component3() {
        return this.onClickListener;
    }

    public final BottomDialogButton copy(String text, BottomDialogButtonType type, Function0<Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        return new BottomDialogButton(text, type, onClickListener);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BottomDialogButton) {
            BottomDialogButton bottomDialogButton = (BottomDialogButton) obj;
            return Intrinsics.areEqual(this.text, bottomDialogButton.text) && Intrinsics.areEqual(this.type, bottomDialogButton.type) && Intrinsics.areEqual(this.onClickListener, bottomDialogButton.onClickListener);
        }
        return false;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.type.hashCode()) * 31) + this.onClickListener.hashCode();
    }

    public String toString() {
        String str = this.text;
        BottomDialogButtonType bottomDialogButtonType = this.type;
        Function0<Unit> function0 = this.onClickListener;
        return "BottomDialogButton(text=" + str + ", type=" + bottomDialogButtonType + ", onClickListener=" + function0 + ")";
    }

    public BottomDialogButton(String text, BottomDialogButtonType type, Function0<Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.text = text;
        this.type = type;
        this.onClickListener = onClickListener;
    }

    public final String getText() {
        return this.text;
    }

    public final BottomDialogButtonType getType() {
        return this.type;
    }

    public final Function0<Unit> getOnClickListener() {
        return this.onClickListener;
    }
}
