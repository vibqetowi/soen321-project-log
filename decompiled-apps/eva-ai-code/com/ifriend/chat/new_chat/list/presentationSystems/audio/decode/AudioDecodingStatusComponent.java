package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.keychain.KeychainModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioDecodingStatusComponent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent;", "Lcom/ifriend/common_entities_engine/Component;", "status", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "(Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;)V", "getStatus", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "DecodingStatus", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioDecodingStatusComponent implements Component {
    public static final int $stable = 8;
    private final DecodingStatus status;

    public static /* synthetic */ AudioDecodingStatusComponent copy$default(AudioDecodingStatusComponent audioDecodingStatusComponent, DecodingStatus decodingStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            decodingStatus = audioDecodingStatusComponent.status;
        }
        return audioDecodingStatusComponent.copy(decodingStatus);
    }

    public final DecodingStatus component1() {
        return this.status;
    }

    public final AudioDecodingStatusComponent copy(DecodingStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new AudioDecodingStatusComponent(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioDecodingStatusComponent) && Intrinsics.areEqual(this.status, ((AudioDecodingStatusComponent) obj).status);
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        DecodingStatus decodingStatus = this.status;
        return "AudioDecodingStatusComponent(status=" + decodingStatus + ")";
    }

    public AudioDecodingStatusComponent(DecodingStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public final DecodingStatus getStatus() {
        return this.status;
    }

    /* compiled from: AudioDecodingStatusComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "", "Decoded", "DecodingInProgress", KeychainModule.AccessControl.NONE, "ReadyToDecode", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$Decoded;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$DecodingInProgress;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$None;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$ReadyToDecode;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface DecodingStatus {

        /* compiled from: AudioDecodingStatusComponent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$None;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class None implements DecodingStatus {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
            }
        }

        /* compiled from: AudioDecodingStatusComponent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$ReadyToDecode;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ReadyToDecode implements DecodingStatus {
            public static final int $stable = 0;
            public static final ReadyToDecode INSTANCE = new ReadyToDecode();

            private ReadyToDecode() {
            }
        }

        /* compiled from: AudioDecodingStatusComponent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$DecodingInProgress;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DecodingInProgress implements DecodingStatus {
            public static final int $stable = 0;
            public static final DecodingInProgress INSTANCE = new DecodingInProgress();

            private DecodingInProgress() {
            }
        }

        /* compiled from: AudioDecodingStatusComponent.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus$Decoded;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/AudioDecodingStatusComponent$DecodingStatus;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Decoded implements DecodingStatus {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Decoded copy$default(Decoded decoded, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = decoded.text;
                }
                return decoded.copy(str);
            }

            public final String component1() {
                return this.text;
            }

            public final Decoded copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Decoded(text);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Decoded) && Intrinsics.areEqual(this.text, ((Decoded) obj).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                String str = this.text;
                return "Decoded(text=" + str + ")";
            }

            public Decoded(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
