package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import com.ifriend.ui.base.mvvm.BaseState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LevelPopupState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "botName", "", "avatar", "", "(Ljava/lang/String;[B)V", "getAvatar", "()[B", "getBotName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelPopupState extends BaseState {
    public static final int $stable = 8;
    private final byte[] avatar;
    private final String botName;

    public static /* synthetic */ LevelPopupState copy$default(LevelPopupState levelPopupState, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPopupState.botName;
        }
        if ((i & 2) != 0) {
            bArr = levelPopupState.avatar;
        }
        return levelPopupState.copy(str, bArr);
    }

    public final String component1() {
        return this.botName;
    }

    public final byte[] component2() {
        return this.avatar;
    }

    public final LevelPopupState copy(String botName, byte[] bArr) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        return new LevelPopupState(botName, bArr);
    }

    public String toString() {
        String str = this.botName;
        String arrays = Arrays.toString(this.avatar);
        return "LevelPopupState(botName=" + str + ", avatar=" + arrays + ")";
    }

    public /* synthetic */ LevelPopupState(String str, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bArr);
    }

    public final String getBotName() {
        return this.botName;
    }

    public final byte[] getAvatar() {
        return this.avatar;
    }

    public LevelPopupState(String botName, byte[] bArr) {
        Intrinsics.checkNotNullParameter(botName, "botName");
        this.botName = botName;
        this.avatar = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.menu.botProfile.level.LevelPopupState");
            LevelPopupState levelPopupState = (LevelPopupState) obj;
            if (Intrinsics.areEqual(this.botName, levelPopupState.botName)) {
                byte[] bArr = this.avatar;
                if (bArr != null) {
                    byte[] bArr2 = levelPopupState.avatar;
                    if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                        return false;
                    }
                } else if (levelPopupState.avatar != null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.botName.hashCode() * 31;
        byte[] bArr = this.avatar;
        return hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
