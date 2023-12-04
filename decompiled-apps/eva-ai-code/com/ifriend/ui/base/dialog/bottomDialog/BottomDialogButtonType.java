package com.ifriend.ui.base.dialog.bottomDialog;

import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
/* compiled from: BottomDialogButton.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;", "", "Default", "Timer", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType$Default;", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType$Timer;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BottomDialogButtonType {

    /* compiled from: BottomDialogButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType$Default;", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;", "()V", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Default implements BottomDialogButtonType {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    /* compiled from: BottomDialogButton.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType$Timer;", "Lcom/ifriend/ui/base/dialog/bottomDialog/BottomDialogButtonType;", RtspHeaders.Values.TIME, "", "isActive", "", "(JZ)V", "()Z", "getTime", "()J", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Timer implements BottomDialogButtonType {
        public static final int $stable = 0;
        private final boolean isActive;
        private final long time;

        public static /* synthetic */ Timer copy$default(Timer timer, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timer.time;
            }
            if ((i & 2) != 0) {
                z = timer.isActive;
            }
            return timer.copy(j, z);
        }

        public final long component1() {
            return this.time;
        }

        public final boolean component2() {
            return this.isActive;
        }

        public final Timer copy(long j, boolean z) {
            return new Timer(j, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Timer) {
                Timer timer = (Timer) obj;
                return this.time == timer.time && this.isActive == timer.isActive;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int m = AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.time) * 31;
            boolean z = this.isActive;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return m + i;
        }

        public String toString() {
            long j = this.time;
            boolean z = this.isActive;
            return "Timer(time=" + j + ", isActive=" + z + ")";
        }

        public Timer(long j, boolean z) {
            this.time = j;
            this.isActive = z;
        }

        public final long getTime() {
            return this.time;
        }

        public final boolean isActive() {
            return this.isActive;
        }
    }
}
