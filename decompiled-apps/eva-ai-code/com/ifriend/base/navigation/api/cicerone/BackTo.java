package com.ifriend.base.navigation.api.cicerone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: commands.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/BackTo;", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "(Lcom/ifriend/base/navigation/api/cicerone/Screen;)V", "getScreen", "()Lcom/ifriend/base/navigation/api/cicerone/Screen;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackTo implements Command {
    private final Screen screen;

    public static /* synthetic */ BackTo copy$default(BackTo backTo, Screen screen, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = backTo.screen;
        }
        return backTo.copy(screen);
    }

    public final Screen component1() {
        return this.screen;
    }

    public final BackTo copy(Screen screen) {
        return new BackTo(screen);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackTo) && Intrinsics.areEqual(this.screen, ((BackTo) obj).screen);
    }

    public int hashCode() {
        Screen screen = this.screen;
        if (screen == null) {
            return 0;
        }
        return screen.hashCode();
    }

    public String toString() {
        Screen screen = this.screen;
        return "BackTo(screen=" + screen + ")";
    }

    public BackTo(Screen screen) {
        this.screen = screen;
    }

    public final Screen getScreen() {
        return this.screen;
    }
}
